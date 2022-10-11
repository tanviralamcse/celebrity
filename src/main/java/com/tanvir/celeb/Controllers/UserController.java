package com.tanvir.celeb.Controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tanvir.celeb.Repositories.UserRepository;
import com.tanvir.celeb.Services.ArtistService;
import com.tanvir.celeb.User.Artist;


@RestController
@RequestMapping("/api")
public class UserController {
    private ArtistService artistService;
	
	@PostMapping("/blogpost")
    public Artist createArtistInfo(@RequestBody Artist artist) {
        return artistService.save(artist);
    }
	
	@GetMapping("/view")
    public List<Artist> getAllUsers() {
        return null;
    }
	
}
