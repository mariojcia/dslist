package com.devsuperior.dslist.dto;

import org.springframework.beans.BeanUtils;

import com.devsuperior.dslist.entities.GameList;

public class GameListDTO {

	private Long id;
	private String name;
	
	public GameListDTO() {
		
	}

	public GameListDTO(GameList entity) {
		//BeanUtils.copyProperties(entity, this);
		// ou
		id = entity.getId();
		name = entity.getName();
	}
	/*
	Somente GETTERS serao necessario qd nao se 
	usa BeanUtils.copyProperties(entity, this); no construtor
	*/

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
}
