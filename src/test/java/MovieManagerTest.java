import org.example.MovieManager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MovieManagerTest {

    MovieManager set1 = new MovieManager ();

//    "Властелин колец", "Хоббит", "Наруто", "Клинок рассекающий демонов"

    @Test
    public void test() {
        set1.movieAdd("Властелин колец");
        set1.movieAdd("Хоббит");
        set1.movieAdd("Наруто");
        set1.movieAdd("Клинок рассекающий демонов");

        String [] expected = {"Властелин колец", "Хоббит", "Наруто", "Клинок рассекающий демонов"};
        String [] actual = set1.findAll();
        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void test2() {
        String[] expected = {};
        String[] actual = set1.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addMovies() {
        MovieManager set1 = new MovieManager();

        set1.movieAdd("Film 1");
        set1.movieAdd("Film 2");
        set1.movieAdd("Film 3");

        String[] expected = {"Film 1", "Film 2", "Film 3"};
        String[] actual = set1.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldLastMovie() {
        MovieManager set1 = new MovieManager(3);

        set1.movieAdd("Film 1");
        set1.movieAdd("Film 2");
        set1.movieAdd("Film 3");

        String[] expected = {"Film 3", "Film 2", "Film 1"};
        String[] actual = set1.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAboveLimit() {
        MovieManager set1 = new MovieManager(7);

        set1.movieAdd("Film 1");
        set1.movieAdd("Film 2");
        set1.movieAdd("Film 3");
        set1.movieAdd("Film 4");
        set1.movieAdd("Film 5");
        set1.movieAdd("Film 6");

        String[] expected = {"Film 6", "Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};
        String[] actual = set1.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldLimit() {
        MovieManager manager = new MovieManager();

        manager.movieAdd("Film 1");
        manager.movieAdd("Film 2");
        manager.movieAdd("Film 3");
        manager.movieAdd("Film 4");
        manager.movieAdd("Film 5");
        manager.movieAdd("Film 6");

        String[] expected = {"Film 6", "Film 5", "Film 4", "Film 3", "Film 2"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }



}
