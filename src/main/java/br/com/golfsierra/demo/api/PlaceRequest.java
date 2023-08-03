package br.com.golfsierra.demo.api;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotBlank;

public record PlaceRequest(

		@NotBlank String name,@NotBlank String slug){


}
