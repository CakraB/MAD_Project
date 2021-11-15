package com.cakrab.project_mobile_vcare;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class NewsFragment extends Fragment {

    RecyclerView rvArticles;
    ArrayList<News> newsArrayList;
    NewsAdapter newsAdapter;

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_news, container, false);
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rvArticles = view.findViewById(R.id.rvNews);
        newsArrayList = new ArrayList<>();
        newsAdapter = new NewsAdapter(newsArrayList, getContext());
        rvArticles.setLayoutManager(new GridLayoutManager(getContext(), 2));
        rvArticles.setAdapter(newsAdapter);

        newsArrayList.add(new News(
                "Mobil",
                "Mobil bla bla bla",
                "10/11/2021"
        ));
        newsArrayList.add(new News(
                "Motor",
                "Motor bla bla bla",
                "10/11/2021"
        ));
        newsArrayList.add(new News(
                "Mobil",
                "Mobil bla bla bla",
                "10/11/2021"
        ));
        newsArrayList.add(new News(
                "Motor",
                "Motor bla bla bla",
                "10/11/2021"
        ));
        newsArrayList.add(new News(
                "Mobil",
                "Mobil bla bla bla",
                "10/11/2021"
        ));
        newsArrayList.add(new News(
                "Motor",
                "Motor bla bla bla",
                "10/11/2021"
        ));
    }
}