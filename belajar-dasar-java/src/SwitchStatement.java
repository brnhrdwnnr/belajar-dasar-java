public class SwitchStatement {
    public static void main(String[] args) {

        var nilai = "A";
        switch(nilai) {
            case "A":
                System.out.println("Nilai anda sangat BAIK");
                break;
            case "B":
            case "C":
                System.out.println("Nilai anda cukup baik");
                break;
            case "D":
                System.out.println("Nilai anda oh my god");
                break;
            default:
                System.out.println("Salah jurusan bro");
        }
    }
}
