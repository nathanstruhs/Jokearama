package com.nathanstruhs.jokearama;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class JokeListFragment extends Fragment {

    private RecyclerView jokeRecyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_joke_list, container, false);

        jokeRecyclerView = (RecyclerView) view.findViewById(R.id.joke_recycler_view);
        jokeRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return view;
    }

//    private class JokeHolder extends RecyclerView.ViewHolder {
//        public CrimeHolder(LayoutInflater inflater, ViewGroup parent) {
//            super(inflater.inflate(R.layout.list_item_joke, parent, false));
//        }
//    }

}
