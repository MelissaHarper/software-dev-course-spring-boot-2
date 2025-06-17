package com.example.mycollections.controllers;

import com.example.mycollections.models.Album;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/albums")
public class AlbumController {

    private final List<Album> albums = new ArrayList<>() {{
        add(new Album("The Dark Side of the Moon", 1973, "Pink Floyd", 10));
        add(new Album("Take Me Back to Eden", 2021, "Sleep Token", 12));
        add(new Album("Free Yourself Up", 2023, "Lake Street Dive", 10));
    }};

    @GetMapping("/json")
    public List<Album> getAlbumsJson() {
        return albums;
    }

    @GetMapping("/html")
    public String getAlbumHtml() {
        String albumList = "<ul>";
        for (Album album : albums) {
            albumList += "<li>" + album + "</li>";
        }
        albumList += "</ul>";

        return """
                <html>
                    <body>
                        <h1>Albums</h1>
                        <ul>
                """ +
                albumList +
                """
                        </ul>
                    </body>
                """;
    }

}