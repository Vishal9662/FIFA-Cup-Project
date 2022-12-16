package com.vh.IQ.FIFA.Cup.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vh.IQ.FIFA.Cup.entity.Player_defence;

@Repository
public interface Player_defence_Repository extends JpaRepository<Player_defence, Integer> {

	List<Player_defence> findByPosition(String position);

	List<Player_defence> findByTeam(String team);

	List<Player_defence> findByTackles(int tackles);

	List<Player_defence> findByWontackles(int wontackles);

	
}
