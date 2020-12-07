public class HomeWork2 {

    public static void main(String[] args) {


        int a = 2000;
        int b = 4000;


        if (a > b) {
            System.out.println("Your card is Platinum");

        } else if (a <= b) {

            System.out.println("Your card is Morning");

        }

        int x = 7000;

        if (x == 6000) { //== больше или равно
            System.out.println("Вы можете посещать сауну");
        } else if (x < 6000 && x >=1000) { // меньше 6000 и больше 1000
            System.out.print("Вам нужно повысить класс карты");

        } else if (x >= 7000 || x >=7001) { // больше или равно 7000 или больше или равно
            System.out.print("Вы можете посещать бассейн");
        } else {
            System.out.print("Вам нужно купить карту");
        }
    }
}

