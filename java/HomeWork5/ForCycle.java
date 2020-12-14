
// С помощью цикла for со счетчиком вывести в консоль цифри меньше 0: int[] nums = { -1, 2, 0, 5, -7, 6};

package HomeWork;

public class ForCycle {
    public static void main(String[] args) {

        int[] numb = {-1, 2, 0, 5, -7, 6};

        for (int i = 0; i < numb.length; i++) {
            if  (numb[i] <0) {
                System.out.println(numb[i]);
            }
        }
    }
}











        /*

        int[] newIntArray = {-1, 2, 0, 5, -7, 6};
        newIntArray [0]
        for (int i = 0; i  < newIntArray.length; i++) {


            if (i < 0) {
                System.out.println(newIntArray[i]);
            }


         */
