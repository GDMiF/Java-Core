public class Main63 {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog(){
            @Override
            void speak(){
                System.out.println("Schooby Doo says *Ruh Roh*");
            }
        };

        dog1.speak();
        dog2.speak();

    }
}
