package com.nathanstruhs.jokearama;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class JokeStorage {
    private static JokeStorage sJokeStorage;
    private List<Joke> jokes;

    public static JokeStorage getInstance(Context context) {
        if (sJokeStorage == null) {
            sJokeStorage = new JokeStorage(context);
        }
        return sJokeStorage;
    }

    private JokeStorage(Context context) {
        jokes = new ArrayList<>();
        String[] jokeArray = {"Knock Knock", "Who's there?", "Olive.", "Olive who?", "Olive you and I don’t care who knows it!"};
        for (int i = 0; i < 10; i++) {
            Joke joke = new Joke();
            joke.setTitle("Joke #" + i);
            joke.setJoke(jokeArray);
            jokes.add(joke);
        }
    }

    public List<Joke> getJokes() {
        return jokes;
    }

    public Joke getJoke(UUID id) {
        for (Joke joke : jokes) {
            if (joke.getId().equals(id)) {
                return joke;
            }
        }
        return null;
    }
}
