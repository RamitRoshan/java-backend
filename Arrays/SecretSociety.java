package Arrays;

import java.util.Arrays;

/* Secret Society
A group of friends have decided to start a secret socety. The name will be the 1st
letter of each of their name, sorted in alphabetical order.
create a function that takes in an array of names and returns the name of the secret society

societyName(["Adam", "Sarah", "Malcolm"]) -> "AMS"
societyName(["Harry", "Newt", "Luna", "Cho"]) -> "CHLN"
*/

public class SecretSociety {

    public static String societyName(String[] names){

        //We use char because we are storing single letters (in output)
        char[] letter = new char[names.length];

        for(int i=0; i<names.length; i++){
            letter[i] = Character.toUpperCase(names[i].charAt(0));
        }
        //sort letters
        Arrays.sort(letter);

        //convert char array to string 
        return new String(letter);
    }
    public static void main(String[] args) {
        String[] names1 = {"Adam", "Sarah", "Malcolm"};
        System.out.println(societyName(names1)); // AMS

        String[] names2 = {"Harry", "Newt", "Luna", "Cho"};
        System.out.println(societyName(names2)); // CHLN
    }
}


 

/* 


A, S, M are characters, not words.
In Java, a single letter = char.
“We use char because we are storing single letters, and sorting characters is easier and efficient.”
*/