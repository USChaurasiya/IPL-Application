package com.uma.IplApp.Model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Dream_Player")
public class DreamPlayer {
	@Id
	@GenericGenerator(name = "gene", strategy = "increment")
	@GeneratedValue(generator = "gene")
	@Column(name = "id")
	private Long id;

	private String[] myPlayer;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String[] getMyPlayer() {
		return myPlayer;
	}

	public void setMyPlayer(String[] myPlayer) {
		this.myPlayer = myPlayer;
	}

}