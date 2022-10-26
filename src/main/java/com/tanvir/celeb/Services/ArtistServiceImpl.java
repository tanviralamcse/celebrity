package com.tanvir.celeb.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tanvir.celeb.Repositories.UserRepository;
import com.tanvir.celeb.User.Artist;

import java.util.List;

@Service
public class ArtistServiceImpl implements ArtistService{
	
	@Autowired
	private UserRepository userRepository;

	public ArtistServiceImpl(UserRepository userRepository){
		this.userRepository = userRepository;
	}
	@Override
	public Artist save(Artist artist) {
		
		return userRepository.save(artist);
	}

	@Override
	public List<Artist> findByArtistName(String query) {
		List<Artist> artists = userRepository.findByArtistName(query);
		return artists;
	}
	

}
