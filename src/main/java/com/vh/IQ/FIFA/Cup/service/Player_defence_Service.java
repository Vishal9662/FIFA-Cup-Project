package com.vh.IQ.FIFA.Cup.service;

import java.util.List;
import java.util.Optional;

package com.vh.IQ.FIFA.Cup.service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vh.IQ.FIFA.Cup.entity.Player_defence;
import com.vh.IQ.FIFA.Cup.repository.Player_defence_Repository;

@Service
public class Player_defence_Service {

	@Autowired
	private Player_defence_Repository repository;
	
	/*	For Get All Data  */
	public List<Player_defence> getAllData()
	{
		List<Player_defence> list=repository.findAll();
		return list;
	}
	
	/*	For Get Data By Id  */
	public Optional<Player_defence> getDataById(int id)
	{
		Optional<Player_defence> list=repository.findById(id);
		return list;
	}
	
	/*	For Filter Data By Position */
	public List<Player_defence> getByPosition(String position){
		List<Player_defence> list=repository.findByPosition(position);
		return list;
	}
	
	/*	For Filter Data By Team name */
	public List<Player_defence> getByTeam(String team){
		List<Player_defence> list=repository.findByTeam(team);
		return list;
	}
	
	/*	For Filter Data By no Of tackles  */
	public List<Player_defence> getByTackles(int tackles){
		List<Player_defence> list=repository.findByTackles(tackles);
		return list;
	}
	
	/*	For Filter Data By no Of won the tackles  */
	public List<Player_defence> getByTacklesWon(int wontackles){
		List<Player_defence> list=repository.findByWontackles(wontackles);
		return list;
	}
	
	
}
