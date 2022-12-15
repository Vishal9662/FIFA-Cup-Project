package com.vh.IQ.FIFA.Cup.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vh.IQ.FIFA.Cup.entity.Player_defence;

@Repository
public interface Player_defence_Repository extends JpaRepository<Player_defence, Integer> {

	public List<Player_defence> findDataByPosition(String position);
	
	public List<Player_defence> findDataByTeam(String team);
	
	public List<Player_defence> findDataByTackles(Integer tackels);
	
	public List<Player_defence> findDataByTacklesWon(Integer tackels_won);
}
