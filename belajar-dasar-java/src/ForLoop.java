public class ForLoop {
    public static void main(String[] args) {

//        for(;;){
//            System.out.println("Perulangan");
//        }
        var counter = 1;
        for(;counter <=10;){
            System.out.println("Perulangan");
            counter++;
        }
        System.out.println(counter);

        // init statement
        for(var countera = 1;countera <=10;){
            System.out.println("Perulangan " + countera);
            countera++;
        }

        // post statement
        for(var countera = 1;countera <=10; countera++) {
            System.out.println("Perulangan " + countera);
        }

    }
}
