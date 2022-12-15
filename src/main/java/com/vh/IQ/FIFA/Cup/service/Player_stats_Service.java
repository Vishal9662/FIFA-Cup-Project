package com.vh.IQ.FIFA.Cup.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vh.IQ.FIFA.Cup.entity.Player_stats;
import com.vh.IQ.FIFA.Cup.repository.Player_stats_Repository;

@Service
public class Player_stats_Service{

	@Autowired
	private	Player_stats_Repository repository;
	
	/*	For Get All Data  */
	public List<Player_stats> getAllData() {
		List<Player_stats> list= repository.findAll();
		return list;
	}

	/*	For Get Data By Id  */
	public Optional<Player_stats> getDataById(int id) {
		Optional<Player_stats> p1=repository.findById(id);
		return p1;
	}
	
	/*	For Filter Data By no Of games played  */
	public List<Player_stats> getAllDataByGames(int games) {
		List<Player_stats> list= repository.findDataByGames(games);
		return list;
	}

	/*	For Filter Data By no Of minutes played  */
	public List<Player_stats> getAllDataByMinutes(int minutes) {
		List<Player_stats> list=repository.findDataByMinutes(minutes);
		return list;
	}

	/*	For Filter Data By no Of score of goals  */
	public List<Player_stats> getAllDataByScoreOfGoal(int goals) {
		List<Player_stats> list=repository.findDataByScoreOfGoal(goals);
		return list;
	}

	/*	For Filter Data By Year Of Birth  */
	public List<Player_stats> getAllDataByBirthYear(int birth_year) {
		List<Player_stats> list=repository.findDataByBirthYear(birth_year);
		return list;
	}
	 
	
	
}
