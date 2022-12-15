package com.vh.IQ.FIFA.Cup.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vh.IQ.FIFA.Cup.entity.Player_stats;
import com.vh.IQ.FIFA.Cup.service.Player_stats_Service;

@RestController
@RequestMapping("/fifa/api/v1/statistics")
public class Player_stats_Controller {
	
	@Autowired
	private Player_stats_Service service;
	
	/*	For Get All Data  */
	@RequestMapping("/get/AllDetails")
	public List<Player_stats> getAll()
	{
		return service.getAllData();
	}
	
	/*	For Get Data By Id  */
	@RequestMapping("/get/By/{id}")
	public Optional<Player_stats> getById(@PathVariable("id") int id){
	
		Optional<Player_stats> p=service.getDataById(id);
		return p;
	}
	
	/*	For Filter Data By no Of games played  */
	@RequestMapping("/apply-filter/Get-Data/By-Games-Played/{games}")
	public ResponseEntity<List<Player_stats>> getByGamesPlayed(@PathVariable("games") int games){
		List<Player_stats> l=service.getAllDataByGames(games);
		return ResponseEntity.status(200).body(l);
		
	}
		
	/*	For Filter Data By no Of minutes played  */
	@RequestMapping("/apply-filter/Get-Data/By-Played-Minutes/{minutes}")
	public ResponseEntity<List<Player_stats>> getByPlayedMinutes(@PathVariable("minutes") int minutes){
		List<Player_stats> l=service.getAllDataByMinutes(minutes);
		return ResponseEntity.status(200).body(l);
	}
	
	/*	For Filter Data By no Of score of goals  */
	@RequestMapping("/apply-filter/Get-Data/By-ScoreOfGoal/{goals}")
	public ResponseEntity<List<Player_stats>> getByScoreOfGoals(@PathVariable("goals") int goals){
		List<Player_stats> l=service.getAllDataByScoreOfGoal(goals);
		return ResponseEntity.status(200).body(l);
	}
		
	/*	For Filter Data By Year Of Birth  */
	@RequestMapping("/apply-filter/Get-Data/By-BirthYear/{birth_year}")
	public ResponseEntity<List<Player_stats>> getByBirthYear(@PathVariable("birth_year") int birth_year){
		List<Player_stats> l=service.getAllDataByBirthYear(birth_year);
		return ResponseEntity.status(200).body(l);
	} 
	
}

