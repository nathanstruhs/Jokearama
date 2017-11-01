package com.nathanstruhs.jokearama;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class JokeListFragment extends Fragment {

    private RecyclerView jokeRecyclerView;
    private JokeAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_joke_list, container, false);

        jokeRecyclerView = (RecyclerView) view.findViewById(R.id.joke_recycler_view);
        jokeRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        updateUI();

        return view;
    }

    private void updateUI() {
        JokeStorage jokeStorage = JokeStorage.getInstance(getActivity());
        List<Joke> jokes = jokeStorage.getJokes();
        adapter = new JokeAdapter(jokes);
        jokeRecyclerView.setAdapter(adapter);
    }

    private class JokeHolder extends RecyclerView.ViewHolder {

        private TextView mTitleTextView;
        private Joke joke;

        public JokeHolder(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.list_item_joke, parent, false));

            mTitleTextView = (TextView) itemView.findViewById(R.id.joke_title);
        }

        public void bind(Joke joke) {
            this.joke = joke;
            mTitleTextView.setText(joke.getTitle());
        }
    }

    private class JokeAdapter extends RecyclerView.Adapter<JokeHolder> {
        private List<Joke> jokes;

        public JokeAdapter(List<Joke> jokes) {
            this.jokes = jokes;
        }

        @Override
        public JokeHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            return new JokeHolder(layoutInflater, parent);
        }

        @Override
        public void onBindViewHolder(JokeHolder holder, int position) {
            Joke joke = jokes.get(position);
            holder.bind(joke);
        }

        @Override
        public int getItemCount() {
            return jokes.size();
        }
    }
}
