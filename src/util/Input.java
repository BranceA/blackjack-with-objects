package util;
import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input(){
        scanner = new Scanner(System.in);
    }

    public String getString(){
        return scanner.nextLine();
}

    public boolean yesNo(){
        String answer = scanner.nextLine();
        if(answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("true") || answer.equalsIgnoreCase("yay verily")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max) {
        System.out.print("Enter a number between " + min + " and " + max + ": ");
        String userInput = scanner.nextLine();
        int userInt;
        if(userInput.matches(".*\\d.*")){
            userInt = Integer.parseInt(userInput);
        } else {
            System.out.println("That's an invalid input. Try again.");
            return getInt(min, max);
        }
        if (userInt < min || userInt > max){
            System.out.println("That's an invalid range. Try again.");
            return getInt(min, max);
        }else {
            return userInt;
        }

    }

//    public int getInt(int min, int max) throws Exception {
//        System.out.print("Enter a number between " + min + " and " + max + ": ");
//        String userInput = scanner.nextLine();
//        if(!userInput.matches(".*\\d.*")){
//            throw new Exception("That is not an integer.");
//        }
//        int userInt = Integer.parseInt(userInput);
//        if (userInt < min || userInt > max){
//            throw new Exception("That is not in range.");
//        }
//
//        return userInt;
//    }

    public int getInt() {
        String userInput = scanner.nextLine();
        if(userInput.matches(".*\\d.*")){
            return Integer.parseInt(userInput);
        } else {
            System.out.println("That isn't an integer. Try again.");
            return getInt();
        }

    }

//    public int getInt() throws Exception {
//        String userInput = scanner.nextLine();
//        if(!userInput.matches(".*\\d.*")){
//            throw new Exception("That is not an integer.");
//        }
//        return Integer.parseInt(userInput);
//
//    }

    public double getDouble(double min, double max) {
        System.out.print("Enter a double between " + min + " and " + max + ": ");
        String userInput = scanner.nextLine();
        double userDouble;
        if(userInput.matches(".*\\d.*")){
            userDouble = Double.parseDouble(userInput);
        } else {
            System.out.println("That's an invalid input. Try again.");
            return getDouble(min, max);
        }
        if (userDouble < min || userDouble > max){
            System.out.println("That's an invalid range. Try again.");
            return getDouble(min, max);
        }else {
            return userDouble;
        }
    }

//    public double getDouble(double min, double max) throws Exception {
//        System.out.print("Enter a double between " + min + " and " + max + ": ");
//        String userInput = scanner.nextLine();
//        if(!userInput.matches(".*\\d.*")){
//            throw new Exception("That is not a double.");
//        }
//        double userDouble = Double.parseDouble(userInput);
//        if (userDouble < min || userDouble > max){
//            throw new Exception("That is not in range.");
//        }
//
//        return userDouble;
//    }

    public double getDouble() {
        String userInput = scanner.nextLine();
        if(userInput.matches(".*\\d.*")){
            return Double.parseDouble(userInput);
        } else {
            System.out.println("That isn't a double. Try again.");
            return getDouble();
        }
    }

//    public double getDouble() throws Exception {
//        String userInput = scanner.nextLine();
//        if(!userInput.matches(".*\\d.*")){
//            throw new Exception("That is not a double.");
//        }
//        return Double.parseDouble(userInput);
//
//    }

//    public double getBinary() {
//        String userInput = scanner.nextLine();
//        if(userInput.matches(".*\\d.*")){
//            return Integer.valueOf(userInput, 2);
//        } else {
//            System.out.println("That isn't a binary number. Try again.");
//            return getDouble();
//        }
//    }

}

//    String getString()
//    boolean yesNo()
//    int getInt(int min, int max)
//    int getInt()
//    double getDouble(double min, double max)
//    double getDouble()

//    Integer valueOf(String str, int base);