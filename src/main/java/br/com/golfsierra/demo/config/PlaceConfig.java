package br.com.golfsierra.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.golfsierra.demo.domain.PlaceRepository;
import br.com.golfsierra.demo.domain.PlaceService;

@Configuration
public class PlaceConfig {

	@Bean
	PlaceService placeService(PlaceRepository placeRepository) {
		return new PlaceService(placeRepository);
	}
	
}
