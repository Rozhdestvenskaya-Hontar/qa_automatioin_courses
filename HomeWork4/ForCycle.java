// не получилось (((
// С помощью цикла for со счетчиком вывести в консоль цифри меньше 0:
// int[] nums = { -1, 2, 0, 5, -7, 6};
package HomeWork;

public class ForCycle {
    public static void main(String[] args) {
        int[] newIntArray = {-1, 2, 0, 5, -7, 6};

        for (int i = 0; i  <= newIntArray.length-1; i++) {
            if (i < 0) {
                System.out.println(newIntArray[i]);
            }
        }
    }
}