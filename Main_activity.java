package com.example.sportnews;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView sportRV;
    private List<sportList> newsList;
    private NewsAdapter newsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();


    }

    protected void init() {
        sportRV = findViewById(R.id.sportRV);
        sportRV.setLayoutManager(new LinearLayoutManager(this));
        sportRV.setHasFixedSize(true);

        // Get News Data
        newsList = NewsDataSet.getNewsList();
        newsAdapter = new NewsAdapter(newslList);
        sportRV.setAdapter(newsAdapter);
    }
