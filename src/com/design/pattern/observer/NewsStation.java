
package com.design.pattern.observer;

public class NewsStation {
    
    public static void main(String[] args) {
        NewsData newsData= new NewsData();
        CccNewsDisplay cccNewsDisplay = new CccNewsDisplay();
        DnnNewsDisplay dnnNewsDisplay = new DnnNewsDisplay();
        GuavaDaliyNewsDisplay guavaDaliyNewsDisplay = new GuavaDaliyNewsDisplay();
        YahuNewsDisplay yahuNewsDisplay = new YahuNewsDisplay();
        
        //TODO register display objects to newsData
        
        newsData.setHeadlineNews("'Big objects found' in AirAsia hunt");
        newsData.setFinanceNews("US shares barely budge in 2015");
        newsData.setEntertainmentNews("Bono guitar fears after bike crash");
        newsData.setSportsNews("World Tennis Championship: Andy Murray beats Rafael Nadal");
        
        newsData.updateNews();
        
    }

}
