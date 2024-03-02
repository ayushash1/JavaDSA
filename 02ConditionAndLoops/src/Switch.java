import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        // take word input

        Scanner input = new Scanner(System.in);
        String fruit = input.next();

//        switch(fruit){
//            case "Mango":
//                System.out.println("King of fruits");
//                break;
//
//            case "Apple":
//                System.out.println("An apple a day keeps doctor away");
//                break;
//            case "Orange":
//                System.out.println("It'n not a fruit its a COLOUR");
//                break;
//            case "Grapes":
//                System.out.println("I like grapes");
//                break;
//            default:
//                System.out.println("Idk about "+ fruit);
//        }

        // new switch statement
        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("An apple a day keeps doctor away");
            case "Orange" -> System.out.println("It'n not a fruit its a COLOUR");
            case "Grapes" -> System.out.println("I like grapes");
            default -> System.out.println("Idk about " + fruit);
        }

    }
}
