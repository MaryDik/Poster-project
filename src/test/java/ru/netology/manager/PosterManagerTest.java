package ru.netology.manager;
import ru.netology.domain.NewFilm;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    NewFilm filmNames1 = new NewFilm("Бладшот");
    NewFilm filmNames2 = new NewFilm("Вперед");
    NewFilm filmNames3 = new NewFilm("Отель 'Белград'");
    NewFilm filmNames4 = new NewFilm("Джентельмены");
    NewFilm filmNames5 = new NewFilm("Человек-неведимка");
    NewFilm filmNames6 = new NewFilm("Тролли. Мировой тур");
    NewFilm filmNames7 = new NewFilm("Номер один");


    @Test
    public void AddingFilms() {
        PosterManager repo = new PosterManager();

        repo.add(filmNames1);
        repo.add(filmNames2);
        repo.add(filmNames3);
        repo.add(filmNames4);
        repo.add(filmNames5);
        repo.add(filmNames6);
        repo.add(filmNames7);

        NewFilm[] expected = {filmNames1, filmNames2, filmNames3, filmNames4, filmNames5, filmNames6, filmNames7};
        NewFilm[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void FindMaxlimitLastFilms() {
        PosterManager repo = new PosterManager();

        repo.add(filmNames1);
        repo.add(filmNames2);
        repo.add(filmNames3);
        repo.add(filmNames4);
        repo.add(filmNames5);
        repo.add(filmNames6);
        repo.add(filmNames7);

        NewFilm[] expected = {filmNames7, filmNames6, filmNames5, filmNames4, filmNames3};
        NewFilm[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void FindMaxlimitLastFilmsParametr() {
        PosterManager repo = new PosterManager(3);

        repo.add(filmNames1);
        repo.add(filmNames2);
        repo.add(filmNames3);
        repo.add(filmNames4);
        repo.add(filmNames5);
        repo.add(filmNames6);
        repo.add(filmNames7);

        NewFilm[] expected = {filmNames7, filmNames6, filmNames5};
        NewFilm[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void FindFilmsLessDefaultmax() {
        PosterManager repo = new PosterManager();

        repo.add(filmNames1);
        repo.add(filmNames2);

        NewFilm[] expected = {filmNames2,filmNames1};
        NewFilm[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}



