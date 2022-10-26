package com.tanvir.celeb.Controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.tanvir.celeb.Repositories.UserRepository;
import com.tanvir.celeb.Services.ArtistService;
import com.tanvir.celeb.User.Artist;


@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
    private ArtistService artistService;
	
	@PostMapping("/blogpost")
    public Artist createArtistInfo(@RequestBody Artist artist) {
        return artistService.save(artist);
    }
	
	@GetMapping("/view")
    public ResponseEntity<List<Artist>> findByArtistName(@RequestParam("query") String query) {
        return ResponseEntity.ok(artistService.findByArtistName(query));
    }
	
}
