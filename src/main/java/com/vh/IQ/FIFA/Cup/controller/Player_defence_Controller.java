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
	@RequestMapping("/get/AllDetails")
	public List<Player_defence> getAllData(){
		log.info("This is the Information from Player_Defence_Controller class",Player_defence_Controller.class);
		return service.getAllData();
	}
	
	/*	For Get Data By Id  */
	@RequestMapping("/get/ById/{id}")
	public Optional<Player_defence> getById(@PathVariable("id") int id){
		log.info("This is the Information from Player_Defence_Controller class",Player_defence_Controller.class);
		Optional<Player_defence> op=service.getById(id);
		return op;
	}
	
	/*	For Filter Data By position  */
	@RequestMapping("/apply-filter/getBy/Position/{position}")
	public ResponseEntity<List<Player_defence>> getByPosition(@PathVariable("position") String position){
		log.info("This is the Information from Player_Defence_Controller class",Player_defence_Controller.class);
		List<Player_defence> list=service.getByPosition(position);
		return ResponseEntity.status(200).body(list);
	}
	
	/*	For Filter Data By Team  */
	@RequestMapping("/apply-filter/getBy/Team/{team}")
	public ResponseEntity<List<Player_defence>> getByTeam(@PathVariable("team") String team){
		log.info("This is the Information from Player_Defence_Controller class",Player_defence_Controller.class);
		List<Player_defence> list=service.getByTeam(team);
		return ResponseEntity.status(200).body(list);
	}
	
	
	/*	For Filter Data By no Of Tackles  */
	@RequestMapping("/apply-filter/getBy/Tackles/{tackles}")
	public ResponseEntity<List<Player_defence>> getByTackles(@PathVariable("tackles") int tackles){
		log.info("This is the Information from Player_Defence_Controller class",Player_defence_Controller.class);
		List<Player_defence> list=service.getByTackles(tackles);
		return ResponseEntity.status(200).body(list);
	}
	
	/*	For Filter Data By no Of Won Tackles  */
	@RequestMapping("/apply-filter/getBy/TacklesWon/{tackles_won}")
	public ResponseEntity<List<Player_defence>> getByWonTackles(@PathVariable("tackles_won") int tackles_won){
		log.info("This is the Information from Player_Defence_Controller class",Player_defence_Controller.class);
		List<Player_defence> list=service.getByTacklesWon(tackles_won);
		return ResponseEntity.status(200).body(list);
	}
}
