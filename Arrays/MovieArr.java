package arrays;
public class MovieArr {
    public static void main(String[] args) {
        
        // String[] str = {"Kashmirfiles", "keralafiles", "Dhurandhar"};

        // for(int i=0; i<str.length; i++){
        //     System.out.println(str[i]);
        // }

        //traditional approach
        String[] movies = new String[3];
        movies[0] = "F1";
        movies[1] = "F2";
        movies[2] = "F3";

        // for(int i=0; i<movies.length; i++){
        //     System.out.println(movies[i]);
        // }

        //enhanced for loop
        for(String movieName: movies){
            System.out.println("Name: " + movieName);
        }
    }
}
