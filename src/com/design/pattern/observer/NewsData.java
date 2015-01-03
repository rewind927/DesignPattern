
package com.design.pattern.observer;

public class NewsData {
    private String headlineNews;
    private String sportsNews;
    private String financeNews;
    private String entertainmentNews;

    private YahuNewsDisplay yahuNewsDisplay;
    private DnnNewsDisplay dnnNewsDisplay;
    private CccNewsDisplay cccNewsDisplay;
    private GuavaDaliyNewsDisplay guavaDaliyNewsDisplay;

    public void updateNews() {
        yahuNewsDisplay.update(headlineNews, sportsNews, financeNews, entertainmentNews);
        dnnNewsDisplay.update(headlineNews, sportsNews, financeNews, entertainmentNews);
        cccNewsDisplay.update(headlineNews, sportsNews, financeNews, entertainmentNews);
        guavaDaliyNewsDisplay.update(headlineNews, sportsNews, financeNews, entertainmentNews);
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

    public void setYahuNewsDisplay(YahuNewsDisplay yahuNewsDisplay) {
        this.yahuNewsDisplay = yahuNewsDisplay;
    }

    public void setDnnNewsDisplay(DnnNewsDisplay dnnNewsDisplay) {
        this.dnnNewsDisplay = dnnNewsDisplay;
    }

    public void setCccNewsDisplay(CccNewsDisplay cccNewsDisplay) {
        this.cccNewsDisplay = cccNewsDisplay;
    }

    public void setGuavaDaliyNewsDisplay(GuavaDaliyNewsDisplay guavaDaliyNewsDisplay) {
        this.guavaDaliyNewsDisplay = guavaDaliyNewsDisplay;
    }
}
