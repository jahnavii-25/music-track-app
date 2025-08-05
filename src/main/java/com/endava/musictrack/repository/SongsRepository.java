package com.endava.musictrack.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.endava.musictrack.model.Songs;

public interface SongsRepository extends JpaRepository<Songs, Long>{
	public Songs findSongsByTitle(String title);
	public List<Songs> findByArtistIgnoreCase(String artist);
	@Query("SELECT s FROM Songs s WHERE LOWER(s.genre) LIKE LOWER(CONCAT('%', :genre, '%'))")
	public List<Songs> findSongsByGenreContaining(@Param("genre") String genre);
}
