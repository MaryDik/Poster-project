
package ru.netology.manager;
import ru.netology.domain.NewFilm;

public class PosterManager {
    private NewFilm[] films = new NewFilm[0];
    private int defaultmax = 5;


    public PosterManager() {

    }

    public PosterManager(int max) {
        defaultmax = max;

    }

    public void add(NewFilm film) {
        NewFilm[] tmp = new NewFilm[films.length + 1];
        for (int i = 0; i < films.length; i++) tmp[i] = films[i];
        tmp[tmp.length - 1] = film;
        films = tmp;

    }

    public NewFilm[] findAll() {

        return films;
    }

    public NewFilm[] findLast() {
        int resultLength;
        if (defaultmax > films.length) {
            resultLength = films.length;
        } else {
            resultLength = defaultmax;
        }
        NewFilm[] reversed = new NewFilm[resultLength];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = films[films.length - 1 - i];
        }
        return reversed;


    }


}

