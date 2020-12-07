// арифметические операции
// ++ это инкремент
// -- это дискремент

public class Lesson3 {
    public static void main(String[] args) {

        int a = 5;
        int b = 5;


        int i = 9;
        int d = ++i; // два плюса означает что мы увеличиваем значение на 1, то есть с стало = 9

        int f = 8;
        int r = f--; // уменьшаем на 1 значение

        String text = "hello";
        String text2 = "hello";

        String text3 = new String("hello");
        String text4 = new String("hello");

        boolean bool = text3 != text4; // двойное равно сравнивает объекты по ссылке. ВСЕГДА
        boolean bool1 = a != b;
        boolean bool2 = a < b;
        boolean bool3 = a > b;
        boolean bool4 = a <= b;
        boolean bool5 = a >= b;

        boolean bool7 = (5 > 6) || (4 < 6); // оператор or если хотя бы одна true вернется true.
        boolean bool8 = (5 > 6) && (4 < 6); // оператор end - тут проверяет обе стороны, если хоть олдна не вернет true, то вернет false


        // условные конструкции - if, else, switch
/*
        if (a == b ) {
            System.out.println("Hello, World if");
        } else {
            System.out.println("Hello, World else");

         switch (a) {
             case 5:
                 System.out.println("first case");
                 a++;
             System.out.println("first case");
             break;
             case 10:
                 System.out.println("second case");
                 break;
             case 15:
                 System.out.println("3-rd case");
                 break;

             default:
                 System.out.println("default");

*/
        int z = a > b ? 10 : 5;


        System.out.println(z);
    }

}




