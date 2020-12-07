public class HomeWork1 {

    //StringBuildertringBuilder + append
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Hello");
        s.append(" , World");
        System.out.println(s);


        // delete (int start, int end)

        s.delete(0, 2);
        System.out.println(s);


        // deleteCharAt (int index)

        s.deleteCharAt(0);
        System.out.println(s);

        //insert (int offset, Sting str)

        s.insert(0, "Baby,");
        System.out.println(s);

        //replace (int start, int end, String str)


        s.replace(1, 2, "-мерзкая");
        System.out.println(s);


        // reverse ()


        s.reverse();
        System.out.println(s);


        // substring (int start) обрезка строки, начиная с 2 символа

     System.out.println(s.substring(2));

       // substing (int start, int end) обрезка строки, начиная с 2 символа и до 4

        System.out.println(s.substring (2, 4));



    }
}