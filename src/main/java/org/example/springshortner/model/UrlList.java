package org.example.springshortner.model;

import java.util.ArrayList;


public class UrlList {
    private final ArrayList<Url> urls;
    public UrlList(ArrayList<Url> urls) {
        this.urls = urls;
    }

    public void addUrl(Url url) {
        this.urls.add(url);
    }

    public Url getUrl(int index) {
        if (index >= 0 && index < urls.size()) {
            return this.urls.get(index);
        }
        throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + urls.size());
    }
}
