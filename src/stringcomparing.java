import java.util.Scanner;

public class stringcomparing {

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("How is the weather?");
        String answer = sc.nextLine();

        if (answer.equals ("rain") || answer.equals ("precipitation"))
            System.out.println("Take your umbrella!");
        else if  (answer.equals ("windy"))
            System.out.println("Wear your jacket!");
        else if (answer.equals ("snow") )
            System.out.println("Wear a coat and take a shovel!");
        else if (answer.equals ("stormy")|| answer.equals ("hurricane") )
            System.out.println("Stay indoors buddy boy");
        else
            System.out.println("Enjoy your day!");
    }

}
