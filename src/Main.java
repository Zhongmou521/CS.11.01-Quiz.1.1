import java.util.Scanner;

/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Zhongmou H
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
            String firstName = new String();
            String favoriteFood = new String();


            System.out.println("What is your first name?");
            Scanner scanner = new Scanner(System.in);
            firstName = scanner.nextLine();




            System.out.println("What is your age?");

            int age = scanner.nextInt();

            System.out.println("What is your fav food?");
            scanner.nextLine();
            favoriteFood = scanner.nextLine();

            String details = "Name: " + firstName + "\nAge: " + age + "\nFavorite food: " + favoriteFood;

            System.out.println(details);
    }

}
