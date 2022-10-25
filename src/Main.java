import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(66);
        int y = random.nextInt(66);
        System.out.println("Первое число: " + x);
        System.out.println("Второе число: " + y);
        System.out.println("Сумма " + (x + y));
    }
}
