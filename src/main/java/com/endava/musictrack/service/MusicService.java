package com.endava.musictrack.service;

import com.endava.musictrack.model.Songs;
import java.util.List;

public interface MusicService {
	public List<Songs> getAllSongs();
	public Songs getSongsByTitle(String title);
	public Songs addSong(Songs song);
	public Songs updateSong(Songs song);
	public Songs update(Long id, Songs song);
	public String deleteSong(Long id);
	public List<Songs> getByArtist(String artist);
	public List<Songs> getByGenre(String genre);
}
