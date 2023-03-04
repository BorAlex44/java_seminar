import java.time.LocalTime;
import java.util.Scanner;

public class seminar1 {
    public static void main(String[] args) {
        inputNameAndPrintHi();

    }

    private static void inputNameAndPrintHi() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя пользователя: ");
        String name = in.nextLine();
        LocalTime now = LocalTime.now();
        int hour = now.getHour();
        if (hour == 23 ^ hour < 5) {
            System.out.printf("Доброй ночи, %s!", name);
        } else if (hour >= 18) {
            System.out.printf("Добрый вечер, %s!", name);
        } else if (hour < 12) {
            System.out.printf("Доброе утро, %s!", name);
        } else {
            System.out.printf("Добрый день, %s!", name);
        }
    }
}
