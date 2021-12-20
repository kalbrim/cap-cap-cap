package com.claim.controller;



import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.claim.entity.ChangeNameObject;
import com.claim.entity.Hole;
import com.claim.entity.Player;
import com.claim.repository.PlayerRepository;


@CrossOrigin
@RestController
public class PlayerController {

	@Autowired
	private PlayerRepository playerRepository;

	@RequestMapping(value = "/save", consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
	public void save(@RequestBody Player player) {
		playerRepository.save(player);
	}
	

	// simpler than above request mapping
//	@PostMapping("/delete")
//	public void delete(@RequestBody Player player) {
//		playerRepository.deleteById(player.getName());
//		
//	}
	
//	@GetMapping("/index")
//	public String welcome(Model model) {
//		return "index";
//	}
	
	@GetMapping("/index")
	public ModelAndView showWelcome(Model model) {
		return new ModelAndView();
	}
	
	@GetMapping("/player-options")
	public ModelAndView showPlayerOptions(Model model) {
		return new ModelAndView();
	}
	
	@GetMapping("/add-player")
	public ModelAndView showAddPlayer(Model model) {
		return new ModelAndView("add-player", "player", new Player());
	}
	
//	@PostMapping("/add-player")
//	public String addPlayer(Model model, @ModelAttribute("player") Player player, HttpSession session) {
//		playerRepository.save(player);
//		
//		return "index";
//	}
	
	@PostMapping("/add-player")
	public ModelAndView addPlayer(Model model, @ModelAttribute("player") Player player, HttpSession session) {
		Player tempPlayer = player;
		tempPlayer.setNumberOfBingos(0);
		tempPlayer.setNumberOfBangos(0);
		tempPlayer.setNumberOfBongos(0);
		tempPlayer.setTotal(0);
		
		
		playerRepository.save(tempPlayer);
		
		return new ModelAndView("index");
	}
	
	
	
	@GetMapping("/delete-player")
	public ModelAndView showDeletePlayer(Model model) {
		return new ModelAndView("delete-player", "deadPlayer", new Player());
	}
	
	@PostMapping("/delete-player")
	public ModelAndView deletePlayer(Model model, @ModelAttribute("deadPlayer") Player player, HttpSession session) {
		playerRepository.deleteById(player.getName());		
		
		return new ModelAndView("index");
	}
	
	// play
	// check hole
	// will probably have to repo it
	// get should be good post may need to beModelViewed up
	@GetMapping("/play")
	public ModelAndView showPlay(Model model) {
		return new ModelAndView("play", "hole", new Hole());
		
	}
	
	// need annotation
	@PostMapping("/play")
	public ModelAndView completeHole(Model model, @ModelAttribute("hole") Hole hole, HttpSession session) {
		
		System.out.println(hole.getFirstOnTheGreen());
		System.out.println(hole.getClosestToThePin());
		System.out.println(hole.getFirstInTheHole());
		
		
		playerRepository.addBingo(hole.getFirstOnTheGreen());
		
		playerRepository.addBango(hole.getClosestToThePin());
		
		playerRepository.addBongo(hole.getFirstInTheHole());
		
		
		return new ModelAndView("play");
		
	}
	
	
	// U in crud 
	@GetMapping("/update-player")
	public ModelAndView showUpdatePlayer(Model model) {
		return new ModelAndView("update-player", "changeNameObject", new ChangeNameObject());
	}
	
	@PostMapping("/update-player")
	public ModelAndView changePlayerName(Model model, @ModelAttribute("changeNameObject") ChangeNameObject changeNameObject, HttpSession session) {
		
		playerRepository.changeName(changeNameObject.getOldName(), changeNameObject.getNewName());
		
//		bbbservice.changeName(changeNameObject.getOldName(), changeNameObject.getNewName());
		
		return new ModelAndView("index");
		
	}
	
	// show scores
	@GetMapping("/scores")
	public ModelAndView showScores(Model model) {
		
		List<Player> players = playerRepository.findAll();
		
		// try sort
		for(int j = 1; j < players.size(); j++) {
			Player current = players.get(j);
			int i = j - 1;
			while ((i > -1) && ((players.get(i).compareTo(current)) == -1)) {
				players.set(i + 1, players.get(i));
				i--;
			}
			players.set(i + 1, current);
		}
		// end try
		
	
		model.addAttribute("playersArrayList", players);
		return new ModelAndView("scores");
		}
	
	





}
