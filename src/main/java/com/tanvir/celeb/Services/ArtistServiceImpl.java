package com.tanvir.celeb.Services;

import org.springframework.stereotype.Service;

import com.tanvir.celeb.Repositories.UserRepository;
import com.tanvir.celeb.User.Artist;

@Service
public class ArtistServiceImpl implements ArtistService{

	private UserRepository userRepository;
	
	@Override
	public Artist save(Artist artist) {
		
		return userRepository.save(artist);
	}

	@Override
	public Artist findByName(String artistName) {
		
		return userRepository.findByArtistName(artistName);
	}
	

}
