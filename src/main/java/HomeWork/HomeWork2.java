//- append(String string) добавляет подстроку в конец - done
// - delete(int start, int end) удаляет все символы с определенного индекса о определенной позиции - done
// - deleteCharAt(int index) - удаляет один символ по определенному индексу - done
// - insert(int offset, String str)-  добавляет строку или символ по определенному индексу - done
// - replace(int start, int end, String str) - Для замены подстроки между определенными позициями в StringBuffer на другую подстроку
// - reverse() - меняет порядок на обратный - done
// - substring(int start) - обрезает строку с определенного индекса до конца, либо до определенного индекса - done
// - substring(int start, int end) - обрзка строки с определенного индекса до указанного - done

package HomeWork;

public class HomeWork2 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(", World");
        sb.insert(12, " !!!!!!!");
        sb.delete(0, 1);
        sb.deleteCharAt(13);
        System.out.println(sb.toString());

        StringBuilder stringBuilder = new StringBuilder("Hello, Java");
        String s1 = stringBuilder.substring(7);
        String s2 = stringBuilder.substring(8, 10);
        stringBuilder.replace(6,11, "World");
        stringBuilder.reverse();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(stringBuilder);



    }
}
