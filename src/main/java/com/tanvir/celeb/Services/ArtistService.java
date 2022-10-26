package com.tanvir.celeb.Services;

import org.springframework.stereotype.Service;

import com.tanvir.celeb.User.Artist;

import java.util.List;

@Service
public interface ArtistService {
	Artist save(Artist artist) ;

	 List<Artist> findByArtistName(String query);

}
