import java.util.Scanner;

public class MyMain {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter, 
    // it is returned unchanged. 
    public static char toLower(char ch) {
        // REPLACE WITH YOUR CODE
        char re = ch;
        if (65 <= ch && 90 >= ch){
            re += 32;
        }
        return re;
    }

    // Returns a copy of a String, where all letters 
    // are now lowercase
    public static String myToLowerCase(String str) {
        // REPLACE WITH YOUR CODE
        String re = "";
        for (int i = 0; i < str.length(); i++){
             re += toLower(str.charAt(i));
        }
        return re;
    }

    // Changes a lowercase letter to an uppercase letter
    // If the char is not an lowercase letter, 
    // it is returned unchanged. 
    public static char toUpper(char ch) {
        char re = ch;
        if (97 <= ch && 122 >= ch){
            re -= 32;
        }
        return re;
    }

    // Returns a copy of a String, where all letters 
    // are now uppercase
    public static String myToUpperCase(String str) {
        String re = "";
        for (int i = 0; i < str.length(); i++){
            
            re += toUpper(str.charAt(i));
        }
        return re;
    }


    public static void main(String[] args) {
       
        //I don't know why, but when I didn't declare dec up here it just went straight to the if statement.
        String dec = "1";

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string.");
        String ans = scan.next();
        System.out.println("Would you like to make it uppercase or lowercase?");
        dec = scan.next();
        
        if (dec.equals("lowercase")){
            System.out.println("Your string becomes: " + myToLowerCase(ans));
        }
        else if (dec.equals("uppercase")){
            System.out.println("Your string becomes: " + myToUpperCase(ans));
        }
        else{
            System.out.println("Something went wrong. Try again.");
        }
    }
}
