package com.vh.IQ.FIFA.Cup.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vh.IQ.FIFA.Cup.entity.Player_stats;

@Repository
public interface Player_stats_Repository extends JpaRepository<Player_stats, Integer>
{

	public List<Player_stats> findByGames(int games);

	public List<Player_stats> findByMinutes(int minutes);

	public List<Player_stats> findByGoals(int goals);

	public List<Player_stats> findByBirth(int birth);
	

	
}
