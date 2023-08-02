package br.com.golfsierra.demo.api;

import java.time.LocalDateTime;

public record PlaceResponse(

		String name, String slug, String state, LocalDateTime createdAt,
		LocalDateTime updatedAt){


}
