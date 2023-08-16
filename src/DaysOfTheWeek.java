import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DaysOfTheWeek {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter 3 days of the week");
            int one = scanner.nextInt();
            int two = scanner.nextInt();
            int three = scanner.nextInt();
        }catch(Exception e){
            e.getMessage();
        }
    }
    private static Days daysOfWeek(int day){
        switch(day){
            case 1:
                Days sunday = Days.SUNDAY;
                return sunday;
            case 2:
                Days monday = Days.MONDAY;
                return monday;
            case 3:
                Days tuesday = Days.TUESDAY;
                return tuesday;
            case 4:
                Days wednesday = Days.WEDNESDAY;
                return wednesday;
            case 5:
                Days thursday = Days.THURSDAY;
                return thursday;
            case 6:
                Days friday = Days.FRIDAY;
                return friday;
            case 7:
                Days saturday = Days.SATURDAY;
                return saturday;
            default:
                System.out.print("Error date, back to ");
                return Days.SUNDAY;
        }
    }

    private static Map daysOfWeek(int one, int two, int three){
        Map<Integer, Days> dictionary = new HashMap();
        dictionary.put(one, daysOfWeek(one));
        dictionary.put(two, daysOfWeek(two));
        dictionary.put(three, daysOfWeek(three));
//        todo: calling method1 inside method2
        System.out.println(daysOfWeek(two));
        return dictionary;
    }


}
