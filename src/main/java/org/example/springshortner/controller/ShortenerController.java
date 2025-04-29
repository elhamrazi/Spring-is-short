package org.example.springshortner.controller;

import org.example.springshortner.service.ShortenerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/SpringShortener")
public class ShortenerController {
    final ShortenerService shortenerService;

    public ShortenerController(ShortenerService shortenerService) {
        this.shortenerService = shortenerService;
    }

    @GetMapping("/getShortUrl/{longUrl}")
    public String getShortUrl(@PathVariable String longUrl) {
        return shortenerService.shortenUrl(longUrl);
    }


    
}
