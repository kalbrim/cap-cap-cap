package com.claim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.claim.entity.Player;


@Repository
public interface PlayerRepository extends JpaRepository<Player, String> {
	
	

	
	
	// deafult mysql ints need to be 0 currently they are not
	//bingo go
	@Transactional
	@Modifying
	@Query("UPDATE Player p SET p.numberOfBingos = p.numberOfBingos+1 WHERE p.name = ?1")
	public void addBingo(String name);
		
	//bango go
	@Transactional
	@Modifying
	@Query("UPDATE Player p SET p.numberOfBangos = p.numberOfBangos+1 WHERE p.name = ?1")
	public void addBango(String name);
		
	//bongo go
	@Transactional
	@Modifying
	@Query("UPDATE Player p SET p.numberOfBongos = p.numberOfBongos+1 WHERE p.name = ?1")
	public void addBongo(String name);
	
	// change name
	@Transactional
	@Modifying
	@Query("UPDATE Player p SET p.name = ?2 WHERE p.name = ?1")
	public void changeName(String oldName, String newName);
}
