import model.Artist;
import model.Sorting;
import model.Track;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Artist> artists = new ArrayList<>();

        Track t1 = new Track("g", 29);
        Track t2 = new Track("b", 10);
        Track t3 = new Track("a", 14);
        Track t4 = new Track("d", 37);
        Track t5 = new Track("a", 13);

        Artist a1 = new Artist(t1, t1.getName());
        Artist a2 = new Artist(t2, t2.getName());
        Artist a3 = new Artist(t3, t3.getName());
        Artist a4 = new Artist(t4, t4.getName());
        Artist a5 = new Artist(t5, t5.getName());

        artists.add(a1);
        artists.add(a2);
        artists.add(a3);
        artists.add(a4);
        artists.add(a5);

        Sorting<Artist> artistSorting = new Sorting<>();
        artists = artistSorting.insertSort(artists);

        for (Artist a: artists) {
            System.out.print(a.getTrack().getName() + " ");
        }

    }
}