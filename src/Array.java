public class Array {
    public static void main(String[] args) {
        String[] stringArray;
        stringArray = new String[3];

        stringArray[0] = "Bernhard";
        stringArray[1] = "Winner";
        stringArray[2] = "Manurung";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        stringArray[0] = "Ganteng";

        System.out.println(stringArray[0]);

        String[] stringArray2 = new String[3];

        String[] namaNama = {
                "Bernhard", "Winner", "Manurung"
        };

        int[] arrayInt = new int[] {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        };

        long[] arrayLong = {
                10L, 20L, 30L
        };

        arrayLong[0] = 0;
        System.out.println(arrayLong.length);

        String[][] members = {
                { "Ben", "Win"},
                { "Hard", "Ner"},
                { "Man", "Urung"}
        };
        System.out.println(members[0]);
        System.out.println(members[0][1]);
    }
}
