package org.example.springshortner.service;

public interface ShortenerService {
    String shortenUrl(String longUrl);
    String getShortUrl(String shortUrl);
}
