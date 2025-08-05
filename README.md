MusicTrack - Spring Boot REST API
🎵 MusicTrack - Spring Boot REST API

A simple Spring Boot application to manage a collection of music tracks. Users can add, retrieve, update, and delete songs, as well as filter them by title, artist, or genre.

📁 Project Structure

com.endava.musictrack
├── controller/
│   └── MusicController.java
├── exception/
│   └── GlobalExceptionHandler.java
├── model/
│   └── Songs.java
├── repository/
│   └── SongsRepository.java
├── service/
│   └── MusicService.java
├── serviceIMPL/
│   └── MusicServiceIMPL.java
└── MusicTrackApplication.java

💻 Tech Stack

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Lombok
- Postman (for testing)

🚀 Getting Started

✅ Run Locally

1. Clone the repository:
   git clone https://github.com/jahnavii-25/music-track-app.git
   cd music-track-app

2. Open the project in your IDE (STS, IntelliJ, or VS Code)

3. Run the app:
   ./mvnw spring-boot:run

4. Access H2 console (for DB debugging):
   - URL: http://localhost:8080/h2-console
   - JDBC URL: jdbc:h2:mem:musicdb
   - Username: sa
   - Password: (leave blank)

📬 API Endpoints

| Method | Endpoint                          | Description                          |
|--------|------------------------------------|--------------------------------------|
| POST   | /addSong                           | Add a new song                       |
| GET    | /getSongByTitle/{title}            | Get song by title                    |
| GET    | /getAllSongs                       | Get all songs                        |
| PUT    | /updateSongByBody                  | Update song using ID in request body|
| PUT    | /updateSongById/{id}               | Update song by path ID              |
| DELETE | /deleteSong/{id}                   | Delete song by ID                    |
| GET    | /getAllSongsByArtist/{artist}      | Get all songs by artist              |
| GET    | /getAllSongsByGenre/{genre}        | Get all songs by genre               |

📦 Sample JSON - Add Song

{
  "title": "Let It Be",
  "artist": "The Beatles",
  "genre": "Rock",
  "duration": "4:03"
}

🧑💻 Developed by

Jahnavi Tiwari  
GitHub: https://github.com/jahnavii-25
