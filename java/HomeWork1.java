public class HomeWork1 {

    //StringBuildertringBuilder + append
    public static void main(String[] args) {
        /*StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(" , World");
        System.out.println(stringBuilder);



        // delete (int start, int end)

        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.delete(0,3);
        System.out.println(stringBuilder.toString());


        // deleteCharAt (int index)

        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.deleteCharAt(0);
        System.out.println(stringBuilder.toString());

        //insert (int offset, Sting str)

        StringBuilder stringBuilder = new StringBuilder(" Hello");
        stringBuilder.insert(0, "Baby,");
        System.out.println(stringBuilder.toString());

        //replace (int start, int end, String str)

        StringBuilder stringBuilder = new StringBuilder("Погода сегодня супер");
        stringBuilder.replace(20,25, "-мерзкая");
        System.out.println(stringBuilder.toString());


        // reverse ()

        StringBuilder stringBuilder = new StringBuilder("ьтатобар ясьтаратс удуб я он ,хасрук ан олежят енМ");
        stringBuilder.reverse();
        System.out.println(stringBuilder.toString());


        // substring (int start) обрезка строки, начиная с 7 символа

        StringBuilder stringBuilder = new StringBuilder("Я люблю Лето");
        String str = stringBuilder.substring(7);
        System.out.println(str);
*/
        // substing (int start, int end) обрезка строки, начиная с 5 символа и до 15

        StringBuilder stringBuilder = new StringBuilder("Я не Люблю зиму");
        String str = stringBuilder.substring(5,15);
        System.out.println(str);


    }
}