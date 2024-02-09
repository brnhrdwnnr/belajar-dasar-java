public class TipeDataNumber {
    public static void main(String[] args) {
        byte iniByte = 100;
        short iniShort = 1000;
        int iniInt = 1000000;
        long iniLong = 100000000;
        long iniLong2 = 100000000L;

        float iniFloat = 10.12F;
        double iniDouble = 12.2424;

        int decimalInt = 34;
        int hexaDecimal = 0xA132B;
        int binaryDecimal = 0b01010101;

        int amount = 1_000_000_000;

        float iniFLoat2 = (float) iniDouble;
        long iniLong3 = (long) iniFLoat2;
        int iniInt2 = (int) iniLong2;
        short iniShort2 = (short) iniInt2;

    }
}
