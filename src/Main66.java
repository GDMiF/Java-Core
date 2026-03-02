public class Main66 {
    public static void main(String[] args) {

        Product<String, Double> product = new Product<>("Apple", 0.50);

        System.out.println(product.getPrice());
        System.out.println(product.getItem());
    }
}
