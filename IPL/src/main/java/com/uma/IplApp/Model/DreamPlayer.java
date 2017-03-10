package com.uma.IplApp.Model;


import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Dream_Player")
public class DreamPlayer {
	@Id
	@GenericGenerator(name = "abc", strategy = "increment")
	@GeneratedValue(generator = "abc")
	@Column(name = "id")
	private Integer id;

	/*@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="id")
	private Collection<Player> myDreamPlayer;*/

	
	
	@Column(name = "name")
	private String name;
	@Column(name = "display_picture")
	private String displayPicture;
	@Column(name = "role")
	private String role;
	@Column(name = "batting_style")
	private String battingStyle;
	@Column(name = "nationality")
	private String nationality;
	@Column(name = "dob")
	private String dob;
	/*@Column(name = "teamId")
	private int teamId; 
	*
	*/
	
	
	/*@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="user_id")
	private User user;*/
	
	
	private int userId;
	
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDisplayPicture() {
		return displayPicture;
	}

	public void setDisplayPicture(String displayPicture) {
		this.displayPicture = displayPicture;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getBattingStyle() {
		return battingStyle;
	}

	public void setBattingStyle(String battingStyle) {
		this.battingStyle = battingStyle;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	/*public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}*/

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/*public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
*/
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	/*public Collection<Player> getMyDreamPlayer() {
		return myDreamPlayer;
	}

	public void setMyDreamPlayer(List<Player> list) {
		this.myDreamPlayer = list;
	}*/

	
}
