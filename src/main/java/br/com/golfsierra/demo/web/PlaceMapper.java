package br.com.golfsierra.demo.web;

import br.com.golfsierra.demo.api.PlaceResponse;
import br.com.golfsierra.demo.domain.Place;

public class PlaceMapper {
	public static PlaceResponse fromPlaceToResponse(Place place) {
		return new PlaceResponse(place.name(),place.slug(),
				place.state(),place.createdAt(),place.updatedAt()); 
	}
}
