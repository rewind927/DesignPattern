
package com.design.pattern.observer;

public class GuavaDaliyNewsDisplay {
    private String entertainmentNews;

    public void update(String headlineNews, String sportsNews, String financeNews,String entertainmentNews) {
        this.entertainmentNews = entertainmentNews;
        display();
    }

    public void display() {
        System.out.println("GuavaDaliy entertainmentNews: " + entertainmentNews);
    }
}
