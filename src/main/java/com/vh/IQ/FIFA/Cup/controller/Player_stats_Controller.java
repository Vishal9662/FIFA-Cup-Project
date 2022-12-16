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
	
	@RequestMapping("/filter/ByGames/{games}")
	public List<Player_stats> getAllDataByGames(@PathVariable("games") int games) {
		return this.service.getAllDataByGames(games);
	}
	
	/*	For Filter Data By no Of minutes played  */
	@RequestMapping("/filter/ByMinutes/{minutes}")
	public List<Player_stats> getAllDataByMinutes(@PathVariable("minutes") int minutes) {
		return this.service.getAllDataByMinutes(minutes);
	}
	
	/*	For Filter Data By no Of Score Of Goals */
	@RequestMapping("/filter/ByGoals/{goals}")
	public List<Player_stats> getAllDataByGoals(@PathVariable("goals") int goals) {
		return this.service.getAllDataByGoals(goals);
	}
	
	/*	For Filter Data By Birth Year */
	@RequestMapping("/filter/ByBirthYear/{birth}")
	public List<Player_stats> getAllDataByBirthYear(@PathVariable("birth") int birth) {
		return this.service.getAllDataByBirthYear(birth);
	}
	
}


