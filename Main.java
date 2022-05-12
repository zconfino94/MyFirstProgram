import java.util.Scanner;
import javax.swing.JFrame;
import static java.lang.System.out;

public class MakeChange {
    public static void main(String args[]){
        int total = 586798;

        int twentyDollarBill = total/2_000;
        int whatIsLeft = total % 2_000;

        int tenDollarBill = whatIsLeft/1_000;
        whatIsLeft = whatIsLeft % 1_000;

        int fiveDollarBill = whatIsLeft/500;
        whatIsLeft = whatIsLeft % 500;

        int twoDollarBill = whatIsLeft/200;
        whatIsLeft = whatIsLeft % 200;

        int dollarBill = whatIsLeft/100;
        whatIsLeft = whatIsLeft % 100;

        int quarters = whatIsLeft/25;
        whatIsLeft = whatIsLeft % 25;

        int dimes = whatIsLeft/10;
        whatIsLeft = whatIsLeft % 10;

        int nickels = whatIsLeft/5;
        whatIsLeft = whatIsLeft % 5;

        int cents = whatIsLeft;

        String dollarBillMessage = " dollar bill";
        if (dollarBill > 1) {
            dollarBillMessage = dollarBillMessage+"s";
        } else if (dollarBill == 0) {
            dollarBillMessage = dollarBillMessage+"s";
        }

        String quarterMessage = " quarter";
        if (quarters > 1) {
            quarterMessage = quarterMessage+"s";
        } else if (quarters == 0) {
            quarterMessage = quarterMessage+"s";
        }

        out.println("From "+ total +" cents you get");
        out.println(twentyDollarBill+" twenty dollar bills");
        out.println(tenDollarBill+" ten dollar bills");
        out.println(fiveDollarBill+" five dollar bills");
        out.println(twoDollarBill+" two dollar bills");
        out.println(dollarBill +dollarBillMessage);
        out.println(quarters + quarterMessage);
        out.println(dimes + " dimes");
        out.println(nickels +" nickles");
        out.println(cents +" cents");
    }
}

public class ShowAFrame {
    public static void main(String args[]){
        JFrame myFrame = new JFrame();
        String myTitle = "Blank Frame";

        myFrame.setTitle(myTitle);
        myFrame.setSize(300, 200);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }
}

//public class Main {

 //   public static void main(String[] args) {
        // TODO Auto-generated method stub

        // var firstName = "";
        // var lastName = "";
        //  var fullName = "";
        //  var message = "";
        //  var authMessage = "";
        //  var favouriteFood = "";
        //  String nameMatch = "The name match was a ";
        //  Scanner questions = new Scanner(System.in);
        //initializers

       // System.out.println("What is your first name?");
        // firstName = questions.nextLine().toLowerCase(java.util.Locale.ROOT).trim();
        //String firstCap = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
        //System.out.println("What is your last name?");
        //lastName = questions.nextLine().toLowerCase(java.util.Locale.ROOT).trim();
        //String lastCap = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
        /*
        Takes string, separates into first letter and all other letters
        Then convers the first letter to a captial
        Finally, adds all other remaining letters back to the string
        */
        //fullName = firstCap+" "+lastCap;
        //System.out.println("What is your favourite food?");
        //favouriteFood = questions.nextLine().toLowerCase(java.util.Locale.ROOT).trim();
        //String welcomeMessage = "Welcome to your program, "+fullName+". Your favourite food is "+favouriteFood;
        //System.out.println(welcomeMessage+".\n");
        //Scanner with user input

        //if (fullName.equals("Zachary Confino")) {
            //.equals() allows Java to match String together for conditional statements.
        // System.out.println(nameMatch+"success");
        //  authMessage = "Access Authorized.";
        //} else {
        //  System.out.println(nameMatch+"failure");
        //  authMessage = "Access Denied.";
        //  }
    //System.out.println(authMessage);
        //Mock system authorization

  //      Scanner bankAccountQuestions = new Scanner(System.in);

   //     System.out.println("What is your name?");
   //     String name = bankAccountQuestions.nextLine().trim();

   //     double amountInAccount = 50.22;
   //     amountInAccount = amountInAccount +1_000_000.00;
   //     char currencySymbol = '$';

   //    int weightOfAPerson = 150, elevatorWeightLimit = 1400, numberOfPeople = elevatorWeightLimit/weightOfAPerson;
        //Allows you to combine declarations and initialising variables along one variable type, rather than breaking
        //it out along multiple lines. Both declaration && assignment
   //     System.out.println(name+". Your current balance is "+currencySymbol+amountInAccount+"\n");
   //     System.out.println("You can fit "+numberOfPeople+" people in the elevator.\n");

    //    int years = 0;
     //   int yearsMarried = years/4;

    //    while (years < 100) {
    //        System.out.println("You have been married for "+yearsMarried+" number of years.");
     //       years = years +1;
    //    }

  //  }
// }