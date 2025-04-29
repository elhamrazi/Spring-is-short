package org.example.springshortner.repository;

import org.example.springshortner.model.Url;

public interface UrlRepository {
    Url getUrl(String shortUrl);
    Url createUrl(String shortUrl, String longUrl);
}
