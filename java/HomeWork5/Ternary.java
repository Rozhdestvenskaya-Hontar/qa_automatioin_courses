package HomeWork;

public class Ternary {

    private int time;

    public Ternary(int time) {
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public static void main(String[] args) {
        Ternary kid = new Ternary(20);

        String securityAnswer = (kid.getTime() >= 20) ? "Можно включать мультк!" : "Мультик смотреть нельзя";

        System.out.println(securityAnswer);

    }
}