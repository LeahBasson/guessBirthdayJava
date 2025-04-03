package guessbirthday;

import java.util.Scanner;

public class GuessBirthday {

    public static void main(String[] args) {
        //Java program that asks the user to guess your birthday month.
        //You use an if-statement when you want to compare.
        //The user must type in a number between 1 and 12 which represents their guess of your birthday month
        //Compare the input value to YOUR birthday month number & display suitable messages.

        Scanner scn = new Scanner(System.in);
        System.out.println("Guess my birthday month!");

        int month;
        System.out.println("Please type in a month number: ");
        month = scn.nextInt();

//        if (month == 12) {
//            System.out.print("Congratulations, you are 100% correct!!");
//        } else if (month > 12) {
//            System.out.print("Not a valid month!!");
//        } else {
//            System.out.print("No, that's not it!!");
//        }

        //better way to do it
        //|| means OR   - Truth tables - T or T = T, T or F = T
        //&& means AND  - Truth tables - T and T = T, T and F = F
        //!= means NOT EQUAL - Truth tables - not T = F, not F = T
        //== means EQUAL
        if (month <= 0 || month > 12) { //Evaulates to a boolean value.
            System.out.print("Not a valid month!!");
        } else if (month == 12){
            System.out.print("Congratulations, you are 100% correct!!");
        } else {
            System.out.print("No, that's not it!!");
        }
        
        
           
    }

}
