public class Lesson3 {

    // арифметические операции
    public static void main(String[] args) {
        int a = 50;
        int b = 5;
        // b = b+a; // или так запись
        // b +=a; // равно строчке выше, аналог записи
        // b = a * b;
        // b *=a; // сумма а * б
        //b = a / b;
        // b /= a; // а разделить на b
        // инкремент - записывается через ++, дикремент через --

        int c = 8;
        int d = ++c; // вначале увеличивает, потом присваивает, то есть к с + 1 и далее к d добавляется 1

        int e = 8;
        int f = e++; // сначала присваивается значение, а потом оно увеличивает значение на 1 (постфиксный инкремент)

        int g = 8;
        int j = --g; // вначале уменьшает значение, потом присваивает

        int k = 8;
        int l = k--; //сначала присваивается значение, а потом оно увеличивает значение на 1

        int x = 10 / 5 * 2;

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);
        System.out.println(x);

        // операции сравнения

        boolean bool = a == b;
        String text = "Hello";
        String text2 = "Hello";

        String text3 = new String("Hello"); // создание оьбъекта
        String text4 = new String("Hello"); // создание оьбъекта

        // сравнение
        boolean bool1 = text == text2;
        boolean bool2 = text3 == text4; // двойное == сравнивает объекты по ссылке
        boolean bool3 = a != b; // проверяет что значения не равны
        boolean bool4 = a < b; // проверка что а меньше b
        boolean bool5 = a > b; // проверка что а больше b
        boolean bool6 = a <= b; // проверка а меньше или равно b, значение также true если а=в
        boolean bool7 = a >= b; // проверка а больше или равно b, значение также true если а=в

        // логические операторы

        boolean bool8 = (5 > 6) || (4 < 6); // сравнение or, сначала проверяет левую сторону 5<6, если не true,
        // идет в правую, и если там true, это и возвращает, должна быть хотя бы одна часть true, тогда результат true
        boolean bool9 = (5 < 6) && (4 < 6); // сравнение and, чтобы вернуть true он проdеряет обе стороны

        // Условные конструкции - if, else, switch


        /* оператор if
        if (a ==b) { // то есть выполняется проверка и если а = в, то выполняется условие внутри, написать текст ниже
            // если значение не верное, то ничего не произойдет, вывода не будет
            System.out.println("Hello, World");



        if (a !=b) {
            System.out.println("Hello, Java");
        }

         */

        if (a == 5) { // a != b && a>=b проверяем or или and, или a != b || a>= b)
            System.out.println("Hello, World " + a); // если выполнился этот блок как true, то дальше не идет
//        } else {
//            System.out.println("Hello, World else");
//        }
        } else if (a == 6) {
            System.out.println("Hello, World " + a);
        } else if (a == 7) {
            System.out.println("Hello, World else");
        }

        switch (a) {
            case 5: // номер это возможное значение переменной а
                System.out.println("first case");
                a++;
                break; // останавливает проверку, можно без break, тогда выполянется 2-й блок
            case 6:
                System.out.println("second case");
                break;
            case 15:
                System.out.println("third case");
                break;

            default:
                System.out.println("default");

                // тернальный оператор

                int z = a > b? 10 : 5; // это равносильно записи 1

                System.out.println(z);

//                if (a > b) { // конструкция запись 1
//                    z = 10;
//                } else {
//                    z = 5;

                }
        }
    }

    // варианты проверок
    //if (a==b) - если а равно б
    // if(a != b) - если а не равно б


//        System.out.println(bool); //сравниваем переменные а и b
//        System.out.println(bool1);
//        System.out.println(bool2);
//        System.out.println(text3.equals(text2)); // операция сравнения методом equals, но уже
//        // проверяем тект в "", он проверяет значение, а не ссылку, потому даст true, так как Hello в text2=text3
//        System.out.println(bool3);
//        System.out.println(bool4);
//        System.out.println(bool5);
//        System.out.println(bool6);
//        System.out.println(bool7);
//        System.out.println(bool8);
//        System.out.println(bool9);




