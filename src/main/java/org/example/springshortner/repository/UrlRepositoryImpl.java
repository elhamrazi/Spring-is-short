package org.example.springshortner.repository;

import org.example.springshortner.model.Url;
import org.example.springshortner.model.UrlList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class UrlRepositoryImpl implements UrlRepository {
    private final UrlList urlList;

    public UrlRepositoryImpl() {
        this.urlList = new UrlList(new ArrayList<>());
    }

    @Override
    public Url getUrl(String shortUrl) {
        return null;
    }

    @Override
    public Url createUrl(String shortUrl, String longUrl) {

        Url url = new Url(shortUrl, longUrl);
        urlList.addUrl(url);
        return url;
    }
}
