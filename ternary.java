import javax.swing.*;

public class ternary {

    private int time;

    public ternary (int time) {
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
    public static void main(String[] args) {
        ternary kid = new ternary (18);

        String securityAnswer = (kid.getTime() >= 20) ? "Можно включать мультк!" : "Мультик смотреть нельзя";

        System.out.println(securityAnswer);

    }
    }