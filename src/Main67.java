import java.util.HashMap;

public class Main67 {
    public static void main(String[] args) {

        HashMap<String, Double> map = new HashMap<>();

        map.put("apple", 0.50);
        map.put("orange", 0.75);
        map.put("banana", 0.25);
        map.put("coconut", 1.00);

        map.remove("apple");

        System.out.println(map.get("orange"));
        System.out.println(map.containsKey("orange"));
        System.out.println(map);

        if(map.containsKey("apple")){
            System.out.println(map.get("apple"));
        } else{
            System.out.println("Key not found");
        }

        System.out.println(map.size());

        for(String key : map.keySet()){
            System.out.println(key + " : $" + map.get(key));
        }

    }
}
