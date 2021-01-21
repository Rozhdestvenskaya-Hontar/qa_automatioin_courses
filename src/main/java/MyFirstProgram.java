public class MyFirstProgram {
    public static void main(String[] args) {

        int x = 5, y = 5;
        final int z = 5; // константа, нельзя изменить значение переменной

        boolean boolT = true; // для копирования строчки Cntrl+D
        boolean boolF = false;

        //-128 to 127 and weigh 1 byte
        byte bt = 100;

        // -32768 to 32767 and weigh = 2 byte
        short shrt = 32767;

        //-2 147 483 648 to 2 147 483 647 and weigh = 4 byte
        int integer = 2147483647;

        // -9, 223, 372, 036, 854, 775, 808 to 9, 223, 372, 036, 854, 775, 807
        long lng = 9223372036854775807L; //L всегда исапользуется в конце в типе long

        // weight 8 byte, после точки 15 символов;
        double dbl = 8.5;

        // в конце значения всегда добаыляют F, weight 4 byte, после точки 6-7 символов
        float flt = 2.6F;

        // weight 2 byte, UTF-16 таблица символов, от 0 до 65535, например если ввести 1,
        // то выведет символ, под кодом 1 в таблице UTF-16
        char chr = 112;
        char chr1='p'; // или выведет символ, но только одинарных кавычках


        System.out.println(chr1);


    }
}
