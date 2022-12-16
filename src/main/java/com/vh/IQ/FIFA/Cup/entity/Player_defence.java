package com.vh.IQ.FIFA.Cup.entity;
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
	@Column(name="tackles_won")
	private int wontackles;
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
	public int getBirth_year() {
		return birth_year;
	}
	public void setBirth_year(int birth_year) {
		this.birth_year = birth_year;
	}
	public double getMinutes_90s() {
		return minutes_90s;
	}
	public void setMinutes_90s(double minutes_90s) {
		this.minutes_90s = minutes_90s;
	}
	public int getTackles() {
		return tackles;
	}
	public int getWontackles() {
		return wontackles;
	}
	public void setWontackles(int wontackles) {
		this.wontackles = wontackles;
	}
	public int getTackles_def_3rd() {
		return tackles_def_3rd;
	}
	public void setTackles_def_3rd(int tackles_def_3rd) {
		this.tackles_def_3rd = tackles_def_3rd;
	}
	public int getTackles_mid_3rd() {
		return tackles_mid_3rd;
	}
	public void setTackles_mid_3rd(int tackles_mid_3rd) {
		this.tackles_mid_3rd = tackles_mid_3rd;
	}
	public int getTackles_att_3rd() {
		return tackles_att_3rd;
	}
	public void setTackles_att_3rd(int tackles_att_3rd) {
		this.tackles_att_3rd = tackles_att_3rd;
	}
	public int getDribble_tackles() {
		return dribble_tackles;
	}
	public void setDribble_tackles(int dribble_tackles) {
		this.dribble_tackles = dribble_tackles;
	}
	public int getDribbles_vs() {
		return dribbles_vs;
	}
	public void setDribbles_vs(int dribbles_vs) {
		this.dribbles_vs = dribbles_vs;
	}
	public double getDribble_tackles_pct() {
		return dribble_tackles_pct;
	}
	public void setDribble_tackles_pct(double dribble_tackles_pct) {
		this.dribble_tackles_pct = dribble_tackles_pct;
	}
	public int getDribbled_past() {
		return dribbled_past;
	}
	public void setDribbled_past(int dribbled_past) {
		this.dribbled_past = dribbled_past;
	}
	public int getBlocks() {
		return blocks;
	}
	public void setBlocks(int blocks) {
		this.blocks = blocks;
	}
	public int getBlocked_shots() {
		return blocked_shots;
	}
	public void setBlocked_shots(int blocked_shots) {
		this.blocked_shots = blocked_shots;
	}
	public int getBlocked_passes() {
		return blocked_passes;
	}
	public void setBlocked_passes(int blocked_passes) {
		this.blocked_passes = blocked_passes;
	}
	public int getInterceptions() {
		return interceptions;
	}
	public void setInterceptions(int interceptions) {
		this.interceptions = interceptions;
	}
	public int getTackles_interceptions() {
		return tackles_interceptions;
	}
	public void setTackles_interceptions(int tackles_interceptions) {
		this.tackles_interceptions = tackles_interceptions;
	}
	public int getClearances() {
		return clearances;
	}
	public void setClearances(int clearances) {
		this.clearances = clearances;
	}
	public int getErrors() {
		return errors;
	}
	public void setErrors(int errors) {
		this.errors = errors;
	}
	
}
