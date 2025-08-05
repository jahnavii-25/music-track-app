package com.endava.musictrack.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.endava.musictrack.model.Songs;
import com.endava.musictrack.service.MusicService;
import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/musictrack")

public class MusicController {
	
	private MusicService ms;
	
	public MusicController(MusicService ms) {
		this.ms = ms;
	}
	
	@GetMapping("/all")
	public List<Songs> getAllSongs(){
		return ms.getAllSongs();
	}
	
	@GetMapping("/{title}")
	public Songs getSongsByTitle(@PathVariable String title) {
		return ms.getSongsByTitle(title);
	}
	
	@PostMapping
	public Songs addSong(@Valid @RequestBody Songs song) {
		System.out.println("Recieved: "+song);
		return ms.addSong(song);
	}
	
	@PutMapping
	public Songs updateSong(@RequestBody Songs song) {
		return ms.updateSong(song);
	}
	
	@PutMapping("/getasinput/{id}")
	public Songs update(@PathVariable Long id, @RequestBody Songs song) {
	    return ms.update(id, song);
	}

	
	@DeleteMapping("/{id}")
	public String deleteSong(@PathVariable Long id) {
		return ms.deleteSong(id);
	}
	
	@GetMapping("/artist/{artist}")
	public List<Songs> getByArtist(@PathVariable String artist){
		return ms.getByArtist(artist);
	}
	
	@GetMapping("/genre")
	public List<Songs> getByGenre(@RequestParam String genre){
		return ms.getByGenre(genre);
	}
}
