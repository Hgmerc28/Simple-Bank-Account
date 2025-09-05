

/* Title: Customer code
            Name: Hugo D.
            Course: Cp12
            Date: 12/3/2023
 purpose of this code is for the data of hte user input and to reteive that data once it is inputed, aswell as a yon method that is used in this class         */


public class Customer {



    private final String firstName; //first name prviatily used
    private final String lastName; //last name prviatily used
    private static String street; //street prviatily used
    private static String city; //city prviatily used
    private static String state; //state prviatily used
    private static String zip; ///zip prviatily used

    /**
     * constructor
     * pre: none
     * post: A Customer object has been created.
     * Customer data has been initialized with parameters.
     */
    public Customer(String fName, String lNam, String str, String c, String s, String z) {
        firstName = fName;
        lastName = lNam;
        street = str;
        city = c;
        state = s;
        zip = z;

    }

    /**
     * Returns a String that represents the Customer object.
     * pre: none
     * post: A String representing the Account object has been returned
     */
    public String toString() {
        String custString;

        custString = firstName + " " + lastName + " \n ";
        custString += street + " \n";
        custString += city + " " + state + " " + zip + " \n ";
        return (custString);
    }


    public static boolean YoN() { // method that returns  true if answer equals yes


        return Account.Answer.startsWith("Y") || Account.Answer.startsWith("y");
    }



    public static void changeStreet(String Answer) { // uses paramter of the answer inputed to reassign the variable
        street = Answer;
    }

    public static String getStreet() { return(street);} // returns the varaible inputed

    public static void changeCity(String Answer) { // uses paramter of the answer inputed to reassign the variable
        city = Answer;
    }

    public static String getCity() { return(city);} // returns the varaible inputed

    public static void changeState(String Answer) { // uses paramter of the answer inputed to reassign the variable
        state = Answer;
    }

    public static String getState() { return(state);} // returns the varaible inputed

    public static void changeZip(String Answer) { // uses paramter of the answer inputed to reassign the variable
        zip = Answer;
    }

    public static String getZip() { return(zip);} // returns the varaible inputed

}






