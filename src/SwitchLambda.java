public class SwitchLambda {
    public static void main(String[] args) {

        var nilai = "A";
        switch(nilai) {
            case "A" -> System.out.println("wow anda keren");
            case "B", "C" -> System.out.println("anda b aja");
            case "D" -> System.out.println("anda payah");
            default -> {
                System.out.println("Salah jurusan bro");
            }
        }

        //switch lambda tanpa yield
        String ucapan;
        switch(nilai) {
            case "A" -> ucapan = "wow anda keren";
            case "B", "C" -> ucapan = "anda b aja";
            case "D" -> ucapan = "anda payah";
            default -> {
                ucapan = "Salah jurusan bro";
            }
        }
        System.out.println(ucapan);

        //switch lambda dengan yield

        String ucapan2 = switch(nilai) {
            case "A" :
                yield "wow anda keren";
            case "B", "C" :
                yield "anda b aja";
            case "D":
                yield "anda payah";
            default:
                yield "Salah jurusan bro";
        };
        System.out.println(ucapan2);
    }
}
