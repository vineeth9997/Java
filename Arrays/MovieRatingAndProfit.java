package Arrays;


import java.util.Comparator;

public class MovieRatingAndProfit implements Comparator<Movie> {

        @Override
        public int compare(Movie m1, Movie m2) {
            if(m1.getRating()>m2.getRating()&&m1.getProfit()>m2.getProfit())return 1;
            else if(m2.getRating()>m1.getRating()&&m2.getProfit()>m1.getProfit()) return -1;
            return 0;
        }

        public static void main(String[] args) {
            Movie m1 = new Movie(2010, 3.5f, 1000, 2000);
            Movie m2 = new Movie(2013, 4.5f, 1000, 3000);


            int p1 = (int) (m1.getCollectionAmount()-m1.getBudget());
            int p2 = (int) (m2.getCollectionAmount()-m2.getBudget());

            m1.setProfit(p1);
            m2.setProfit(p2);

            MovieRatingAndProfit obj = new MovieRatingAndProfit();
            int result = obj.compare(m1, m2);

            if(result == 0 )System.out.println("Both are equally good movies");
            else if(result>0)System.out.println("Movie 1 has more Net than Movie 2");
            else System.out.println("Movie 2 has More Net than Movie 1");

        }

    }
