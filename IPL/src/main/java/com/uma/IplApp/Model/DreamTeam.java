package com.uma.IplApp.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
@Entity
@Table(name="Dream_Team")
public class DreamTeam {

	private int dreamTeamId;
	private String dreamTeamName;
	private List<Player> dreamPlayer ;
	private User userId;

	public DreamTeam() {
	}

	public DreamTeam(String dreamTeamName) {
		this.dreamTeamName = dreamTeamName;
	}

	public DreamTeam(String dreamTeamName, List<Player> dreamPlayer) {
		this.dreamTeamName = dreamTeamName;
		this.dreamPlayer = dreamPlayer;
	}

	@Id
	@GeneratedValue
	@Column(name = "dreamTeamId")
	public int getdreamTeamId() {
		return this.dreamTeamId;
	}

	public void setdreamTeamId(int dreamTeamId) {
		this.dreamTeamId = dreamTeamId;
	}

	@Column(name = "DreamTeam_NAME", nullable = false, length = 100)
	public String getdreamTeamName() {
		return this.dreamTeamName;
	}

	public void setdreamTeamName(String dreamTeamName) {
		this.dreamTeamName = dreamTeamName;
	}

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Dream_Team_Player", joinColumns = {@JoinColumn(name = "Dream_Team_Id")}, inverseJoinColumns = { @JoinColumn(name = "Player_Id") })
	public List<Player> getdreamPlayer() {
		return this.dreamPlayer;
	}

	public void setdreamPlayer(List<Player> dreamPlayer) {
		this.dreamPlayer = dreamPlayer;
	}

	@OneToOne
	@PrimaryKeyJoinColumn
	@JoinColumn(name="User_ID")
	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}
	
}
