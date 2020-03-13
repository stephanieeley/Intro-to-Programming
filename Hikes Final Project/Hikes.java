import java.util.Scanner;


/**
 * Program to take user input to filter hiking trails and return a filtered list with more information on each trail
 * 
 *Stephanie Eley
 *Date: 03/11/20
 */
public class Hikes{

    /**
     * Method to take user input and display outputs of the list of trails
     */
    public static void main(final String[] args) {
        
        final String[][] hikes = {
        { "mossy cave turret arch and little windows trail", "1.0", "easy", "birdwatching", "waterfall","kid friendly" },
        { "emerald pools", "1.3", "easy", "running", "waterfall", "kid friendly"},
        { "meadow hot springs", "1.1", "easy", "birdwatching", "hot springs", "kid friendly"},
        { "red reef east", "0.9", "easy", "camping", "wildlife", "dog friendly"},
        { "navajo lake loop", "10.1", "moderate", "camping", "a lake", "dog friendly"},
        { "dino cliffs trail", "3.0", "moderate", "walking", "historic site", "dog friendly"},
        { "sulver rim trail", "4.8", "moderate", "running", "wildlife", "kid friendly"},
        { "c trail", "7.3", "hard", "running", "wildlife", "dog friendly"},
        { "rattlesnake creek trail", "12.5", "hard", "birdwatching", "wildlife", "dog friendly"},
        { "single peak from pine valley", "12.9", "hard", "birdwatching", "wildlife", "kid friendly"} };

        String[] diff = {"easy", "moderate", "hard"};
        String[] pref = {"kid friendly","dog friendly"};
        Scanner input = new Scanner(System.in);

            System.out.print("Enter an option listed for a difficulty level: \n1. easy \n2. moderate \n3. hard: "  );
            int difficulty = input.nextInt();
            while (difficulty!= 1 && difficulty!= 2 && difficulty!= 3){
                System.out.print("Enter a valid number.");
                System.out.print("Enter an option listed for a difficulty level: \n1. easy, \n2. moderate, \n3. hard: "  );
                difficulty = input.nextInt();
            }
            System.out.print("Enter an option listed for a preference: \n1. kid friendly or \n2. dog friendly: ");
            int preference = input.nextInt();
            while (preference!= 1 && preference!= 2){
                System.out.print("Enter a valid number.");
                System.out.print("Enter an option listed for a preference: \n1. kid friendly or \n2. dog friendly: ");
                preference = input.nextInt();
            }


            for(int i = 0; i < hikes.length; i++){
                if (diff[difficulty-1].equals(hikes[i][2])){
                    if (pref[preference-1].equals(hikes[i][5])){
                            System.out.println(hikes[i][0] + " " + "hike details include: " + hikes[i][1] + " miles, " + hikes[i][3] + ", " + hikes[i][4]);
                    }
                }
            }
        
        }
    }


