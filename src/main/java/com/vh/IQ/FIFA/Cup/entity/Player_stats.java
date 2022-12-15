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
public class Player_stats {

	@Id
	private int id;
	private String player;
	private String position;
	private String team;
	private String age;
	private String club;
	private int birth_year;
	private int games;
	private int games_starts;
	private int minutes;
	private float minutes_90s;
	private int goals;
	private int assists;
	private int goals_pens;
	private int pens_made;
	private int pens_att;
	private int cards_yellow;
	private int cards_red;
	private float goals_per90;
	private float assists_per90;
	private float goals_assists_per90;
	private float goals_pens_per90;
	private float goals_assists_pens_per90;
	private Double xg;
	private Double npxg;
	private Double xg_assist;
	private Double npxg_xg_assist;
	private Double xg_per90;
	private Double xg_assist_per90;
	private Double xg_xg_assist_per90;
	private Double npxg_per90;
	private Double npxg_xg_assist_per90;
	
}
