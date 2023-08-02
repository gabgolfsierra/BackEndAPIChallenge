package br.com.golfsierra.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.golfsierra.demo.api.PlaceRequest;
import br.com.golfsierra.demo.api.PlaceResponse;
import br.com.golfsierra.demo.domain.Place;
import br.com.golfsierra.demo.domain.PlaceService;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/places")
public class PlaceController {
	
	@Autowired
	private PlaceService placeService;
	
	@PostMapping
	public ResponseEntity<Mono<PlaceResponse>> create (@RequestBody PlaceRequest request){
		var placeResponse = placeService.create(request).map(PlaceMapper::fromPlaceToResponse);
		return ResponseEntity.status(HttpStatus.CREATED).body(placeResponse);
	}
}
