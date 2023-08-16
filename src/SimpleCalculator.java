import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter first number");
            int first = scanner.nextInt();
            System.out.println("Enter second number");
            int second = scanner.nextInt();
            System.out.println("Enter Arithmetic option");
            String arith = scanner.next();

            switch(arith){
                case "+":
                    System.out.println(add(first, second));
                    break;
                case "-":
                    System.out.println(subtract(first, second));
                    break;
                case "/":
                    System.out.println(divide(first, second));
                    break;
                case "*":
                    System.out.println(multiply(first, second));
                    break;
                default:
                    System.out.println("Error in arithmetic selection");
            }
        }catch (Exception e){
            System.out.println(e.getMessage()+ ". wrong input, cant be processed");
        }

    }

    private static int subtract(int first, int second){
            int num = first-second;
            return num;
    }
    private static int divide(int first, int second){
            int num = first/second;
            return num;
    }
    private static int add(int first, int second){
            int num = first+second;
            return num;
    }
    private static int multiply(int first, int second){
            int num = first*second;
            return num;
    }
}
