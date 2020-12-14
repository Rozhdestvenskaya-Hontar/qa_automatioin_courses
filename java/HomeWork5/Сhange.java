package HomeWork;

import java.lang.reflect.Array;
import java.util.Arrays;

//С помощью цикла for со счетчиком заменить отрицательные числа в масиве на ноль
// int[] nums = { -1, 2, 0, 5, -7, 6};
public class Сhange {

    public static void main(String[] args) {

        int[] numb = {-1, 2, 0, 5, -7, 6};

        for (int i = 0; i < numb.length; i++) {

            if (numb[i] < 0) {
                numb[i] = 0;

                //   System.out.println(numb[i]); можно вывести также замену отрицательных чисел отдельно

            }
        }

        System.out.println(Arrays.toString(numb));
    }
}
