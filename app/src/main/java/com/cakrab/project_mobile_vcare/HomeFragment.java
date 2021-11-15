package com.cakrab.project_mobile_vcare;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    RecyclerView rvNews;
    RecyclerView rvGarage;
    ArrayList<News> newsArrayList;
    NewsAdapter newsAdapter;
    TextView textViewNews, textViewGarage;

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        textViewNews = view.findViewById(R.id.text_view_news);
        clickViewNews();
        textViewGarage = view.findViewById(R.id.text_view_garage);

        rvNews = view.findViewById(R.id.rvNews);
        rvGarage = view.findViewById(R.id.rvGarage);

        newsArrayList = new ArrayList<>();
        newsAdapter = new NewsAdapter(newsArrayList, getContext());
        rvNews.setLayoutManager(new GridLayoutManager(getContext(), 2));
        rvNews.setAdapter(newsAdapter);

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

    private void clickViewNews() {
        textViewNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new NewsFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, fragment).commit();
            }
        });
    }
}