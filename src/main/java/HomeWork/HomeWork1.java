package HomeWork;

public class HomeWork1 {

    public static void main(String[] args) {

    /*
    // в Stack хранятся примитивные типы данных (int, char и тд) и ссылки, в Heap (куча) хранятся объекты
    //Cntrl + левая кнопка мышки попасть внутрь класса
    String str = "Моя строка"; // это ссылки на ниже созданный объект
    String str2 = new String("Моя строка"); //стандартное создание объекта

    // все ссылочные типа дынных пишутся с большой буквы и являются классами, в них есть методы,
    // в примитивных типах данных нет методов;

    Byte a;
    Short b;
    Integer c;
    Long d;
    Character z;
    Float e;
    Double f;
    Boolean g;
    int v;

    public void foo() {
     new String("Моя строка"); // создание объекта
*/
        //стринг пул

        String test_1="testing";
        String test_2="testing";
        String test_3=new String("testing");

        System.out.println(test_1 ==test_3);
        System.out.println(test_1.equals(test_3));
        System.out.println("********");
        System.out.println(test_1 ==test_2);
        System.out.println(test_1.equals(test_2));

    }

}
