import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main56 {
    public static void main(String[] args) {

        ArrayList<String> fruit = new ArrayList<>();

        fruit.add("Apple");
        fruit.add("Orange");
        fruit.add("Banana");
        fruit.add("Cocunut");

        fruit.remove(3);

        fruit.set(0, "Pineapple");

        System.out.println(fruit);
        System.out.println(fruit.get(0));
        System.out.println(fruit.size());

        Collections.sort(fruit);


        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the # of food you would like: ");
        int numOfFood = scanner.nextInt();
        scanner.nextLine();

        for(int i = 1; i <= numOfFood; i++){
            System.out.print("Enter food #" + i + ": ");
            String food = scanner.nextLine();
            foods.add(food);
        }

        System.out.println(foods);

        scanner.close();

    }
}
