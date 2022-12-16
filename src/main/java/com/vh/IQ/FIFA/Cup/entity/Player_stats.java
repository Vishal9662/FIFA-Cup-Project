package com.vh.IQ.FIFA.Cup.entity;

import javax.persistence.Column;
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
	@Column(name="birth_year")
	private int birth;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlayer() {
		return player;
	}
	public void setPlayer(String player) {
		this.player = player;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getClub() {
		return club;
	}
	public void setClub(String club) {
		this.club = club;
	}
	public int getBirth() {
		return birth;
	}
	public void setBirth(int birth) {
		this.birth = birth;
	}
	public int getGames() {
		return games;
	}
	public void setGames(int games) {
		this.games = games;
	}
	public int getGames_starts() {
		return games_starts;
	}
	public void setGames_starts(int games_starts) {
		this.games_starts = games_starts;
	}
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	public float getMinutes_90s() {
		return minutes_90s;
	}
	public void setMinutes_90s(float minutes_90s) {
		this.minutes_90s = minutes_90s;
	}
	public int getGoals() {
		return goals;
	}
	public void setGoals(int goals) {
		this.goals = goals;
	}
	public int getAssists() {
		return assists;
	}
	public void setAssists(int assists) {
		this.assists = assists;
	}
	public int getGoals_pens() {
		return goals_pens;
	}
	public void setGoals_pens(int goals_pens) {
		this.goals_pens = goals_pens;
	}
	public int getPens_made() {
		return pens_made;
	}
	public void setPens_made(int pens_made) {
		this.pens_made = pens_made;
	}
	public int getPens_att() {
		return pens_att;
	}
	public void setPens_att(int pens_att) {
		this.pens_att = pens_att;
	}
	public int getCards_yellow() {
		return cards_yellow;
	}
	public void setCards_yellow(int cards_yellow) {
		this.cards_yellow = cards_yellow;
	}
	public int getCards_red() {
		return cards_red;
	}
	public void setCards_red(int cards_red) {
		this.cards_red = cards_red;
	}
	public float getGoals_per90() {
		return goals_per90;
	}
	public void setGoals_per90(float goals_per90) {
		this.goals_per90 = goals_per90;
	}
	public float getAssists_per90() {
		return assists_per90;
	}
	public void setAssists_per90(float assists_per90) {
		this.assists_per90 = assists_per90;
	}
	public float getGoals_assists_per90() {
		return goals_assists_per90;
	}
	public void setGoals_assists_per90(float goals_assists_per90) {
		this.goals_assists_per90 = goals_assists_per90;
	}
	public float getGoals_pens_per90() {
		return goals_pens_per90;
	}
	public void setGoals_pens_per90(float goals_pens_per90) {
		this.goals_pens_per90 = goals_pens_per90;
	}
	public float getGoals_assists_pens_per90() {
		return goals_assists_pens_per90;
	}
	public void setGoals_assists_pens_per90(float goals_assists_pens_per90) {
		this.goals_assists_pens_per90 = goals_assists_pens_per90;
	}
	public Double getXg() {
		return xg;
	}
	public void setXg(Double xg) {
		this.xg = xg;
	}
	public Double getNpxg() {
		return npxg;
	}
	public void setNpxg(Double npxg) {
		this.npxg = npxg;
	}
	public Double getXg_assist() {
		return xg_assist;
	}
	public void setXg_assist(Double xg_assist) {
		this.xg_assist = xg_assist;
	}
	public Double getNpxg_xg_assist() {
		return npxg_xg_assist;
	}
	public void setNpxg_xg_assist(Double npxg_xg_assist) {
		this.npxg_xg_assist = npxg_xg_assist;
	}
	public Double getXg_per90() {
		return xg_per90;
	}
	public void setXg_per90(Double xg_per90) {
		this.xg_per90 = xg_per90;
	}
	public Double getXg_assist_per90() {
		return xg_assist_per90;
	}
	public void setXg_assist_per90(Double xg_assist_per90) {
		this.xg_assist_per90 = xg_assist_per90;
	}
	public Double getXg_xg_assist_per90() {
		return xg_xg_assist_per90;
	}
	public void setXg_xg_assist_per90(Double xg_xg_assist_per90) {
		this.xg_xg_assist_per90 = xg_xg_assist_per90;
	}
	public Double getNpxg_per90() {
		return npxg_per90;
	}
	public void setNpxg_per90(Double npxg_per90) {
		this.npxg_per90 = npxg_per90;
	}
	public Double getNpxg_xg_assist_per90() {
		return npxg_xg_assist_per90;
	}
	public void setNpxg_xg_assist_per90(Double npxg_xg_assist_per90) {
		this.npxg_xg_assist_per90 = npxg_xg_assist_per90;
	}
	
	
}
