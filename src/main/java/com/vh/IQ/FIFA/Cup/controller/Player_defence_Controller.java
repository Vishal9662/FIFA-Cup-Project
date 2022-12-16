package com.vh.IQ.FIFA.Cup.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vh.IQ.FIFA.Cup.entity.Player_defence;
import com.vh.IQ.FIFA.Cup.service.Player_defence_Service;

@RestController
@RequestMapping("fifa/api/v1/defense")
public class Player_defence_Controller {
	
	private static Logger log = LoggerFactory.getLogger(Player_defence_Controller.class);
	
	@Autowired
	private Player_defence_Service service;

	/*	For Get All Data  */
	@RequestMapping("/get/All")
	public List<Player_defence> getAllData(){
		log.info("This is the Information from Player_Defence_Controller class",Player_defence_Controller.class);
		return this.service.getAllData();
	}
	
	/*	For Get Data By Id  */
	@RequestMapping("/get/ById/{id}")
	public Optional<Player_defence> getDataById(@PathVariable("id") int id){
		log.info("This is the Information from Player_Defence_Controller class",Player_defence_Controller.class);
		return this.service.getDataById(id);
	}
	
	/*	For Filter Data By position  */
	@RequestMapping("/apply-filter/getBy/Position/{position}")
	public List<Player_defence> getByPosition(@PathVariable("position") String position){
		log.info("This is the Information from Player_Defence_Controller class",Player_defence_Controller.class);
		return this.service.getByPosition(position);
	}
	
	/*	For Filter Data By Team  */
	@RequestMapping("/apply-filter/getBy/Team/{team}")
	public List<Player_defence> getByTeam(@PathVariable("team") String team){
		log.info("This is the Information from Player_Defence_Controller class",Player_defence_Controller.class);
		return this.service.getByTeam(team);
	}
	
	/*	For Filter Data By Tackles  */
	@RequestMapping("/apply-filter/getBy/Tackles/{tackles}")
	public List<Player_defence> getByTackles(@PathVariable("tackles") int tackles){
		log.info("This is the Information from Player_Defence_Controller class",Player_defence_Controller.class);
		return this.service.getByTackles(tackles);
	}
	
	/*	For Filter Data By Won Tackles  */
	@RequestMapping("/apply-filter/getBy/WonTackles/{wontackles}")
	public List<Player_defence> getByWonTackles(@PathVariable("wontackles") int wontackles){
		log.info("This is the Information from Player_Defence_Controller class",Player_defence_Controller.class);
		return this.service.getByTacklesWon(wontackles);
	}
	
}
