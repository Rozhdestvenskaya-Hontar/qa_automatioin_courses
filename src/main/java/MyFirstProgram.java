public class MyFirstProgram {
    public static void main(String[] args) {
        int x = 5, y = 5;
        final int z = 5;

        boolean boolT = true;
        boolean boolF = false;

        // - 128 to 127 and weight = 1 byte
        byte bt = 100;
        short shrt = 3278;
        //  int -2147483648 to 2147483647, weight = 4 byte
        int integer = 456666;

        //–9 223 372 036 854 775 808 to 9 223 372 036 854 775 807, weight = 8 byte
        long lng = 9223372036854775805L;

        //from ±4.9*10-324 to ±1.8*10308 weight 8 byte
        double dbl = 4.5;

        //from -3.4*1038 to 3.4*1038 weight 4 байта
        float flt = 2.6F;

        //хранит одиночный символ в кодировке UTF-16 и занимает 2 байта, поэтому диапазон хранимых значений от 0 до 65535
        char crt = 'p';


    }


}
