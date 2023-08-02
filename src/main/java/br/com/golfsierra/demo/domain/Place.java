package br.com.golfsierra.demo.domain;

import java.time.LocalDateTime;

public record Place(
		
		Long id, String name, String slug, String state, LocalDateTime createdAt,
		LocalDateTime updatedAt){
	
}

	
	

