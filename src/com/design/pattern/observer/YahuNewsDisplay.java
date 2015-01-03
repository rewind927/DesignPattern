
package com.design.pattern.observer;

public class YahuNewsDisplay {
    private String headlineNews;
    private String sportsNews;

    public void update(String headlineNews, String sportsNews, String financeNews,String entertainmentNews) {
        this.headlineNews = headlineNews;
        this.sportsNews = sportsNews;
        display();
    }

    public void display() {
        System.out.println("Yahu headlineNews: " + headlineNews);
        System.out.println("Yahu sportsNews: " + sportsNews);
    }
}
