package com.endava.musictrack.serviceIMPL;

import java.util.List;
import org.springframework.stereotype.Service;
import com.endava.musictrack.MusicTrackApplication;
import com.endava.musictrack.model.Songs;
import com.endava.musictrack.repository.SongsRepository;
import com.endava.musictrack.service.MusicService;

@Service

public class MusicServiceIMPL implements MusicService{

    private final MusicTrackApplication musicTrackApplication;

	private SongsRepository repo;
	
	public MusicServiceIMPL(SongsRepository repo, MusicTrackApplication musicTrackApplication) {
	    this.repo = repo;
	    this.musicTrackApplication = musicTrackApplication;
	}
	
	@Override
	public List<Songs> getAllSongs() {
		return repo.findAll();
	}

	@Override
	public Songs getSongsByTitle(String title) {
		return repo.findSongsByTitle(title);
	}

	@Override
	public Songs addSong(Songs song) {
		return repo.save(song);
	}

	@Override
	public Songs updateSong(Songs song) {
		return repo.save(song);
	}
	
	@Override
	public Songs update(Long id, Songs song) {
		Songs updated = repo.findById(id).orElseThrow(() -> new RuntimeException("Song not found!"));
		updated.setTitle(song.getTitle());
		updated.setArtist(song.getArtist());
		updated.setDuration(song.getDuration());
		updated.setGenre(song.getGenre());
		return repo.save(updated);
	}

	@Override
	public String deleteSong(Long id) {
		repo.deleteById(id);
		return "Song with id: " +id+ " deleted successfully.";
	}

	@Override
	public List<Songs> getByArtist(String artist) {
		return repo.findByArtistIgnoreCase(artist);
	}

	@Override
	public List<Songs> getByGenre(String genre) {
		return repo.findSongsByGenreContaining(genre);
	}
	
}
