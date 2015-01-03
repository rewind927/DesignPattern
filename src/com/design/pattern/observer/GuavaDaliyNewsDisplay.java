
package com.design.pattern.observer;

public class GuavaDaliyNewsDisplay implements Observer {
    private String entertainmentNews;

    @Override
    public void update(String headlineNews, String sportsNews, String financeNews, String entertainmentNews) {
        this.entertainmentNews = entertainmentNews;
        display();
    }

    public void display() {
        System.out.println("GuavaDaliy entertainmentNews: " + entertainmentNews);
    }
}
