package com.vh.IQ.FIFA.Cup.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Player_defence {

	@Id
	private int id;
	private String player;
	private String position;
	private String team;
	private String age;
	private int birth_year;
	private double minutes_90s;
	private int tackles;
	private int tackles_won;
	private int tackles_def_3rd;
	private int tackles_mid_3rd;
	private int tackles_att_3rd;
	private int dribble_tackles;
	private int dribbles_vs;
	private double dribble_tackles_pct;
	private int dribbled_past;
	private int blocks;
	private int blocked_shots;
	private int blocked_passes;
	private int interceptions;
	private int tackles_interceptions;
	private int clearances;
	private int errors;
	
	
}
