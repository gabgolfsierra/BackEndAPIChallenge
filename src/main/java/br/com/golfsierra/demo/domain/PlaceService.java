package br.com.golfsierra.demo.domain;

import com.github.slugify.Slugify;
import com.github.slugify.Slugify.SlugifyBuilder;

import br.com.golfsierra.demo.api.PlaceRequest;
import reactor.core.publisher.Mono;

public class PlaceService {
	private PlaceRepository placeRepository;
	private Slugify slg;

	public PlaceService(PlaceRepository placeRepository) {
		super();
		this.placeRepository = placeRepository;
		this.slg = Slugify.builder().build();
	}
	
	public Mono<Place> create(PlaceRequest placeRequest){
		var place = new Place(null,placeRequest.name(),slg.slugify(placeRequest.name()),
				placeRequest.state(),placeRequest.createdAt(),placeRequest.updatedAt());
		return placeRepository.save(place);
	}
}
