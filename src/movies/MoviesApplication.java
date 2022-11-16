package movies;
import util.Input;
import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {
        System.out.println("What would you like to do?\n0 - exit\n1 - view all movies\n2 - view animated movies\n3 - view drama movies\n4 - view horror movies\n5 - view sci-fi movies");

        presentMovies();
    }

    public static void presentMovies() {
        Input movieChoice = new Input(new Scanner(System.in));
        int choiceNum = movieChoice.getInt();
        if (choiceNum == 0) {
            System.out.println("Goodbye");

        } else if (choiceNum == 1) {    // All Movies
            System.out.println("You chose option 1");
            for (Movie myMovie : MoviesArray.findAll()) {
                System.out.println(myMovie.getName() + " - " + myMovie.getCategory());
            }
            presentMovies();

        }  else if (choiceNum == 2) {   // Animated
            System.out.println("You chose option 2");
            for (Movie myMovie: MoviesArray.findAll()) {
                if (myMovie.getCategory() == "animated") {
                    System.out.println(myMovie.getName() + " - " + myMovie.getCategory());
                }
            }
            presentMovies();

        }  else if (choiceNum == 3) {   // Drama
            System.out.println("You chose option 3");
            for (Movie myMovie: MoviesArray.findAll()) {
                if (myMovie.getCategory() == "drama") {
                    System.out.println(myMovie.getName() + " - " + myMovie.getCategory());
                }
            }
            presentMovies();

        }  else if (choiceNum == 4) {   // Horror
            System.out.println("You chose option 4");
            for (Movie myMovie: MoviesArray.findAll()) {
                if (myMovie.getCategory() == "horror") {
                    System.out.println(myMovie.getName() + " - " + myMovie.getCategory());
                }
            }
            presentMovies();

        } else if (choiceNum == 5) {    // Sci-Fi
            System.out.println("You chose option 5");
            for (Movie myMovie: MoviesArray.findAll()) {
                if (myMovie.getCategory() == "scifi") {
                    System.out.println(myMovie.getName() + " - " + myMovie.getCategory());
                }
            }
            presentMovies();

        } else {
            System.out.println("Please enter a number between 0 - 5");
            presentMovies();
        }
    }
}
