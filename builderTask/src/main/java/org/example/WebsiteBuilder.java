package org.example;

public abstract class WebsiteBuilder {
    Website website;

    void createWebsite() {
        website = new Website();
    }

    abstract void buildName();
    abstract void buildCms();
    abstract void buldPrice();

    Website getWebsite() {
        return website;
    }
}
