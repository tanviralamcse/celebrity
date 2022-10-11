package com.tanvir.celeb.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tanvir.celeb.User.Artist;


public interface UserRepository extends JpaRepository<Artist, Long>{
	Artist findByArtistName(String artistName);	
	
}

