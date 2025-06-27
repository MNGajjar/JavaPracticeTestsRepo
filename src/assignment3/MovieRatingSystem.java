package assignment3;

/*
Movie Rating System:
You are managing a movie rating system where users rate movies.
Write a Java program that:
• Stores the names of 5 movies in a string array and stores ratings (out of 5) in another array.
• Finds the movie with the highest rating and displays it to the user.
*/

public class MovieRatingSystem {

    private static String[] movies = {"3 idiots","Oh My God","Kalki","Raid","Sooryavanshi"};
    private static double[] ratings = {4.9,4.5,4.4,5.0,3.5};

    public static void showMovieNames(){
        System.out.println("Movies List: ");
        for (int i = 0;i< movies.length;i++){
            System.out.println((i+1)+". "+movies[i]);
        }
    }

    public static void highestRating(){
        int indexOfHighest = 0;
        double highestrating = 0.0;
        for (int i = 0 ; i < movies.length; i++){
            if (ratings[i] > highestrating){
                highestrating = ratings[i];
                indexOfHighest = i;
            }
        }
        System.out.println("Movie "+ movies[indexOfHighest] + " has the highest rating of : " + highestrating );
    }
}
