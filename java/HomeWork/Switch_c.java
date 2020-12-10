package HomeWork;

public class Switch_c {

    public static void main(String[] args) {

        char Mark = 'A';

        switch (Mark) {
            case'A':
                System.out.println("1");
                break;
            case 'B':
                System.out.println("2");
                break;
            case 'C':
                System.out.println("3");
                break;
            default:
                System.out.println("No mark");
        }
        System.out.println("Your mark " +  Mark);


    }
}

