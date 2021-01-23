//- If, If - Else, If - else - else if, с логическими операторами || и &&
// - Switch
// - Ternary operator ?:

package HomeWork;

public class HomeWork3 {
    public static void main(String[] args) {

        /*
        int a = 2500;

        if (a >= 2500) {
            System.out.println("Ваша карта типа Классик");
        }


        int Month = 11;

        if (Month == 1 || Month == 2) {
            System.out.println("Сейчас зима");
        } else if (Month == 3 || Month == 4 || Month == 5) {
            System.out.println("Уже наступила весна");
        } else if (Month == 6 && Month >= 6 && Month <= 8) {
            System.out.println("Это лето");
        } else {
            System.out.println("Какое-то другое время года");
        }
        switch (Month) {
            case 9:
                System.out.println("Наступил сентябрь");
                break;
            case 10:
                System.out.println("Уже октябрь");
                break;
            default:
                System.out.println("Пришел конец года");
        }
 */
        //тернарный оператор
        int C = 4000;
        int P = 3499;

        String result = C <= P ? "Classic" : "Platinum";
        System.out.println(result);


    }
}








