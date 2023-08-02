package br.com.golfsierra.demo.domain;

import reactor.core.publisher.Mono;

public class PlaceService {
	private PlaceRepository placeRepository;

	public PlaceService(PlaceRepository placeRepository) {
		super();
		this.placeRepository = placeRepository;
	}
	
	public Mono<Place> create(Place place){
		return placeRepository.save(place);
	}
}
