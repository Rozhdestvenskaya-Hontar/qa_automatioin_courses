//С помощью цикла foreach вывести в консоль цифри больше 0:
// int[] nums = { -1, 2, 0, 5, -7, 6};

package HomeWork;

public class ForEach {

    public static void main(String[] args) {
        int[] array = {-1, -2, 0, 5, -7, 6};

        for (int i : array) {
            if (i > 0){
                System.out.println(i);
            }
        }
    }

}