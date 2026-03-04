import java.util.Scanner;

public class Main68 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day of the week: ");
        String response = scanner.nextLine().toUpperCase();

        Day day = Day.valueOf(response);

        System.out.println(day);
        System.out.println(day.getDayNumber());

        switch(day){
            case MONDAY,
                 TUESDAY,
                 WEDNESDAY,
                 THURSDAY,
                 FRIDAY -> System.out.println("It is a weekday!");
            case SATURDAY, SUNDAY -> System.out.println("It is a weekend");
        }

        scanner.close();
    }
}
