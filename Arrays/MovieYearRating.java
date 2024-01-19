package Arrays;

import java.util.Comparator;
//
//Movie(int yearReleased, float rating, long budget, long collectionAmount, long profit)

public class MovieYearRating implements Comparator<Movie>
{

    @Override
    public int compare(Movie m1, Movie m2) {
        if(m1.getYearReleased()>m2.getYearReleased()&&m1.getRating()>m2.getRating())return 1;
        else if(m2.getYearReleased()>m1.getYearReleased()&&m2.getRating()>m1.getRating()) return -1;
        return 0;
    }

    public static void main(String[] args) {

        Movie m1 = new Movie(2010, 3.5f, 1000, 2000);
        Movie m2 = new Movie(2013, 4.5f, 1000, 2000);

        MovieYearRating obj = new MovieYearRating();

        int result = obj.compare(m1, m2);

        if(result == 0 )System.out.println("Both are equally good movies");
        else if(result>0)System.out.println("Movie 1 is good than Movie 2");
        else System.out.println("Movie 2 is good than Movie 1");

    }


}