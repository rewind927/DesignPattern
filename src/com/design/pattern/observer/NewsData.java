
package com.design.pattern.observer;

import java.util.ArrayList;

public class NewsData implements Subject {
    private String headlineNews;
    private String sportsNews;
    private String financeNews;
    private String entertainmentNews;

    private ArrayList obserArrayList;

    public NewsData() {
        obserArrayList = new ArrayList();
    }

    @Override
    public void registerObserver(Observer object) {
        //TODO implements this function. 
    }

    @Override
    public void removeObserver(Observer object) {
        //TODO implements this function. 
    }

    @Override
    public void notifyObservers() {
        //TODO implements this function. 
    }

    public void updateNews() {
        notifyObservers();
    }

    public String getHeadlineNews() {
        return headlineNews;
    }

    public String getSportsNews() {
        return sportsNews;
    }

    public void setFinanceNews(String financeNews) {
        this.financeNews = financeNews;
    }

    public void setEntertainmentNews(String entertainmentNews) {
        this.entertainmentNews = entertainmentNews;
    }

    public void setHeadlineNews(String headlineNews) {
        this.headlineNews = headlineNews;
    }

    public void setSportsNews(String sportsNews) {
        this.sportsNews = sportsNews;
    }

    public String getFinanceNews() {
        return financeNews;
    }

    public String getEntertainmentNews() {
        return entertainmentNews;
    }
}
