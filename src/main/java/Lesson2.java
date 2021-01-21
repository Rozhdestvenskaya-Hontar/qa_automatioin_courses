// стринг пулл

public class Lesson2 {

    public static void main(String[] args) {
//
//        String file = "Hello"; //запись всегла в двойных кавычках
//        String file2 = "Hello, \n World"; //перенос строки
//        file = "test";
//        file = "test2"; // создание объекста типа стринг, при изменении значения будет создаваться новый каждый раз
//        StringBuilder sb = new StringBuilder(); // создание типа стринг билдер
//
//        String file2 = new String("test");
//
//        System.out.println(file);

        String name = "Hello, World" + "test"; // инициализация, тут ссылка на объект
        name = "abddd"; // создали новый, теперь обьектов nam два, у них разные ссылки
        System.out.println(name);
    }
}
