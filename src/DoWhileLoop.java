public class DoWhileLoop {
    public static void main(String[] args) {

        var counter = 100;

        while(counter <= 10) {
            System.out.println("Perulangan " + counter);
        }

        do {
            System.out.println("Perulangan " + counter);
        } while(counter <= 10);
    }
}
