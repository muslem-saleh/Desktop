package com.example.sportnews;

import java.util.ArrayList;

public class NewsDataSet {

    public static List<sportList> getNewsList() {
        List<sportList> newsModelList = new ArrayList<>();

        // News 1
        NewsModel newsModel = new NewsModel();
        newsModel.setTitle("FC Barcelona defeats RealMadrid in La Liga");
        newsModel.setDescription(" a5-0 was the result yesterday Saturday night where FC Barcelona demolished Real Madrid in their home for a historical win. A hatrick for Lionile Missi, and remaning 2 goals for luis Swaris.");
        newsModel.setImage(R.drawable.news_1);
        newsModelList.add(newsModel);

        // News 2
        newsModel = new NewsModel();
        newsModel.setTitle("Roger Ferdrer to participate in Wimbledon");
        newsModel.setDescription(" Despite injuries, Rojer Federer the man with most grand slams won in Tennis history announced he will participate in wimbledon 2020 putting an end to long speculations about his fitness level.");
        newsModel.setImage(R.drawable.news_2);
        newsModelList.add(newsModel);


        return newsModelList;
    }

}
