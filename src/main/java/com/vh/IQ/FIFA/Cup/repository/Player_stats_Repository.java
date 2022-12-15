package com.vh.IQ.FIFA.Cup.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vh.IQ.FIFA.Cup.entity.Player_stats;

@Repository
public interface Player_stats_Repository extends JpaRepository<Player_stats, Integer>
{
	public List<Player_stats> findDataByGames(Integer games);

	public List<Player_stats> findDataByMinutes(Integer minutes);
	
	public List<Player_stats> findDataByScoreOfGoal(Integer goals);
	
	public List<Player_stats> findDataByBirthYear(Integer birth_year);

	
}
