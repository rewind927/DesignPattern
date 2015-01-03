
package com.design.pattern.observer;

public class CccNewsDisplay {
    private String headlineNews;
    private String sportsNews;
    private String entertainmentNews;

    public void update(String headlineNews, String sportsNews, String financeNews, String entertainmentNews) {
        this.headlineNews = headlineNews;
        this.sportsNews = sportsNews;
        this.entertainmentNews = entertainmentNews;
        display();
    }

    public void display() {
        System.out.println("Ccc headlineNews: " + headlineNews);
        System.out.println("Ccc sportsNews: " + sportsNews);
        System.out.println("Ccc entertainmentNews: " + entertainmentNews);
    }
}
