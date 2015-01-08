
package com.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsData implements Subject {
    private String headlineNews;
    private String sportsNews;
    private String financeNews;
    private String entertainmentNews;

    private List observerArrayList;

    public NewsData() {
        observerArrayList = new ArrayList();
    }

    @Override
    public void registerObserver(Observer object) {
        observerArrayList.add(object);
    }

    @Override
    public void removeObserver(Observer object) {
        if (observerArrayList.contains(object)) {
            observerArrayList.remove(object);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observerArrayList.size(); i++) {
            ((Observer) observerArrayList.get(i)).update(headlineNews, sportsNews, financeNews, entertainmentNews);
        }
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
