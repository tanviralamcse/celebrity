package com.tanvir.celeb.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tanvir.celeb.User.Artist;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface UserRepository extends JpaRepository<Artist, Long>{
	@Query("SELECT a FROM Artist a WHERE a.artistName LIKE CONCAT('%',:query, '%')")
	List<Artist> findByArtistName(String query);


}

