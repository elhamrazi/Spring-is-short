package org.example.springshortner.service;

import org.example.springshortner.model.Url;
import org.example.springshortner.model.UrlList;
import org.example.springshortner.repository.UrlRepository;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Service;
import java.util.Random;
import java.security.SecureRandom;
import java.util.UUID;

@Service
public class ShortenerServiceImpl implements ShortenerService {
    private final UrlRepository urlRepository;
    private final Random random;

    public ShortenerServiceImpl(UrlRepository urlRepository) {
        this.urlRepository = urlRepository;
        this.random = new Random();
    }

    @Override
    @CachePut(value="shortUrls")
    public String shortenUrl(String longUrl) {
        String shortenedUrl = "shortSpring_" + generateRandomString();
        urlRepository.createUrl(shortenedUrl, longUrl);
        return shortenedUrl;
    }

    @Override
    public String getShortUrl(String shortUrl) {
        return "";
    }

    private String generateRandomString() {
        SecureRandom numberGenerator = null;
        final long MSB = 0x8000000000000000L;
        SecureRandom ng = numberGenerator;
        if (ng == null) {
            numberGenerator = ng = new SecureRandom();
        }

        return Long.toHexString(MSB | ng.nextLong()) + Long.toHexString(MSB | ng.nextLong());
    }
}
