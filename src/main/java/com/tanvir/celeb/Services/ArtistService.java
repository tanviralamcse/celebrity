package com.tanvir.celeb.Services;

import org.springframework.stereotype.Service;

import com.tanvir.celeb.User.Artist;

@Service
public interface ArtistService {
	Artist save(Artist artist) ;
	Artist findByName(String artistName);
}
