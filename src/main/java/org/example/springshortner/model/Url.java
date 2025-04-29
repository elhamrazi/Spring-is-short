package org.example.springshortner.model;

public class Url {

    private String Id;
    private String LongUrl;
    private String ShortUrl;

    public Url(String LongUrl, String ShortUrl) {
        this.LongUrl = LongUrl;
        this.ShortUrl = ShortUrl;
    }

}
