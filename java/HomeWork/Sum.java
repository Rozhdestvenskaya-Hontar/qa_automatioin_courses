//С помощью цикла for со счетчиком вывести в консоль сумму всех цифер:
// int[] nums = { -1, 2, 0, 5, -7, 6};

package HomeWork;

public class Sum {
    public static void main(String[] args) {

        int[] array = {-1, 2, 0, 5, -7, 6};

        int sum = 0;

        for (int i = 0; i < array.length; i++) {

            sum = sum + array[i];
        }
        System.out.println(sum);
    }
}
