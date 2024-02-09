public class Break {
    public static void main(String[] args) {
        var counter = 1;

        while (true) {
            System.out.println("perulangan " + counter);
            counter++;

            if(counter > 5) {
                break;
            }
        }
        System.out.println("perulangan berhenti");
    }
}
