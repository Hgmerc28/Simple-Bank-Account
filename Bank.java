
/* Title: Bank clinet code
            Name: Hugo D.
            Course: Cp12
            Date: 12/3/2023
 purpose of this codeis to act as a bank where the custmomer has a balance and is then asked if they wish to chagne their account and depending on their repsonse change their adress by asking a couple of questions and then asking if they wish to withdarw or deposit any money
             */


import java.text.NumberFormat; // imports java number format
import java.util.Scanner; // import user scanner

public class Bank{


    public static void main(String[] args) {

        Account munozAccount = new Account(50.57, "Hugo", "De Jongh",  "13 road", "Oregon", "Bc", "v1cs 534"); // this is all the start up data such as first and last name street their balance city state zip code etc
        Scanner input = new Scanner(System.in); // imports scanner
        double data; // this is a varibale for any placeholder data such as depoist money or withdraw moeny
        String Answer; // this is a placehodler varibale to carry over all the string such as for the names and adresses
        NumberFormat money = NumberFormat.getCurrencyInstance(); // takes hte meony they have in that instance and uses the formating method to format it

        System.out.println(munozAccount); // prints the balance they have
        System.out.println(munozAccount.Address()); // pinrts their adress

        System.out.print("Would you like to change your address? "); // asks if they wish to change adress
        Answer = input.next(); // yes or no
        if(Answer.startsWith("Y") || Answer.startsWith("y")) { // if they say yes then runs if else stament
            Account.changeAddress(); // runs a method to change their adress
            System.out.println(); // adds space
            System.out.print(munozAccount.Address()); // prints their adress
        }



        System.out.print("Enter deposit amount: "); // asks how much oney they wanna depoist
        data = input.nextDouble(); // inputs it into datavairbale
        munozAccount.deposit(data); // then runs a method to add that money
        System.out.println("Balance is: " + money.format(munozAccount.getBalance())); // finds the balance

        System.out.print("Enter withdrawal amount: "); // aks if they want ot withdraw moeny
        data = input.nextDouble(); // assings vairbale fo rthe number given
        munozAccount.withdrawal(data); // takes that moeny out of their balance
        System.out.println("Balance is: " + money.format(munozAccount.getBalance())); // then finds the balance and prints


        input.close(); // closes input

    }
}


