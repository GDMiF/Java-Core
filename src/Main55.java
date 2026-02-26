public class Main55 {
    public static void main(String[] args){

        Integer a = 123;
        Double b = 3.14;
        Character c = 'S';
        Boolean d = true;
        String e = "Pizza";

        int x = a;

         String a1 = Integer.toString(123);
         String b1 = Double.toString(3.14);
         String c1 = Character.toString('@');
         String d1 = Boolean.toString(false);

         String x1 = a1 + b1 + c1 + d1;

        System.out.println(x1);

        char letter = 'B';

        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));


    }
}
