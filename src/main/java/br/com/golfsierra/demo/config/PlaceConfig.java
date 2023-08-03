package br.com.golfsierra.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.config.EnableR2dbcAuditing;

import br.com.golfsierra.demo.domain.PlaceRepository;
import br.com.golfsierra.demo.domain.PlaceService;

@Configuration
@EnableR2dbcAuditing
public class PlaceConfig {

	@Bean
	PlaceService placeService(PlaceRepository placeRepository) {
		return new PlaceService(placeRepository);
	}
	
}
