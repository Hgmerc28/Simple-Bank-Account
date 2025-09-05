
/* Title: account code
            Name: Hugo D.
            Course: Cp12
            Date: 12/3/2023

 purpose of this code is for all the methods of chagnineg account inclduing depostiing withdrawing and change the adress
 */

import java.text.NumberFormat; // inzuiles number format
import java.util.Scanner; // so that we can see user input


public class Account {

    static Scanner input = new Scanner(System.in); // inputs user thingy

    private double balance; // for the balance prviatly

    static String Answer; // a trangable string used
    private Customer cust; // for a extra customer varibale


    /**
     * constructor
     * pre: none
     * post: An account created. Balance and
     * customer data initialized with parameters.
     */
    public Account(double bal, String fNam, String lNam, String str, String city, String st, String zip) {
        balance = bal;
        cust = new Customer(fNam, lNam, str, city, st, zip);
    }

    /**
     * Returns the current balance
     * pre: none
     * post: The account balance has been returned.
     */

    public double getBalance() {
        return (balance);
    }

    /**
     * A deposit is made to the account
     * pre: none
     * post: The balance has been increased by the amount of the deposit.
     */

    public void deposit(double amt) {
        balance += amt;
    }

    /**
     * A withdrawal is made from the account if there is enough money.
     * pre: none
     * post: The balance has been decreased by the amount withdrawn.
     */

    public void withdrawal(double amt) {
        if (amt <= balance) {
            balance -= amt;
        } else {
            System.out.println("Not enough money in account.");
        }
    }

    /**
     * Returns a String that represents the Account object
     * pre: none
     * post: A string representing the Account object has been returned
     */

    public String toString() {
        String accountString;
        NumberFormat money = NumberFormat.getCurrencyInstance();

        accountString = cust.toString();
        accountString = "Current balance is " + money.format(balance);
        return (accountString);
    }





    public static void changeAddress() { // a method that doesnt return anything however tells the user their adress each time and then asks if they wan to change it and hten allows them to change it


        System.out.print("Would you like to change your street? Current Street is " + Customer.getStreet() + ". ");
        Answer = input.next();


        if (Customer.YoN()) { // if they say yes then prompts to what they want to change it to

            System.out.print("Enter street, (no spaces): \n");
            Answer = input.next();
            Customer.changeStreet(Answer);
            System.out.print("Your Street is: " + Customer.getStreet() + " \n");
        }


        System.out.print("Would you like to change your city? Current City is " + Customer.getCity() + ". ");
        Answer = input.next();

        if (Customer.YoN()) { // if they say yes then prompts to what they want to change it to
            System.out.print("Enter City: \n");
            Answer = input.next();
            Customer.changeCity(Answer);
            System.out.print("Your City is: " + Customer.getCity() + " \n");
        }


        System.out.print("Would you like to change your State? Current State is " + Customer.getState() + ". ");
        Answer = input.next();

        if (Customer.YoN()) { // if they say yes then prompts to what they want to change it to
            System.out.print("Enter State: \n");
            Answer = input.next();
            Customer.changeState(Answer);
            System.out.print("Your State is: " + Customer.getState()+ " \n");
        }

        System.out.print("Would you like to change your Zip? Current Zip is " + Customer.getZip() + ". ");
        Answer = input.next();

        if (Customer.YoN()) { // if they say yes then prompts to what they want to change it to
            System.out.print("Enter Zip: \n");
            Answer = input.next();
            Customer.changeZip(Answer);
            System.out.print("Your Zip is: " + Customer.getZip() + " \n");
        }
    }
    public String Address () { // returns what the instnancuece address is
        return ("Your address as recorded into our system is... " + " \n" + "Street: " + Customer.getStreet() + " \n" + "City: " + Customer.getCity() + " \n" + "State: " + Customer.getState()+ " \n" + "Zip: " + Customer.getZip() + " \n");
    }

}

















