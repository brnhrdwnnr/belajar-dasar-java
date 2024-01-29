public class TernaryOperator {
    public static void main(String[] args) {
        var nilai = 75;
        String ucapan;

        if (nilai >= 75){
            ucapan = "Selamat anda lulus";
        } else {
            ucapan = "Anda tidak lulus";
        }

        String ucapan2 = nilai >= 75 ? "Anda lulus" : "Andaa gagal";
    }
}
