import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        int ticket_price = 2000;
        int price_bonus_mile = 20;

        int bonus_mile = ticket_price / price_bonus_mile;
        // Объявляете переменные для входных данных и
        // параметров программы: одну для хранения
        // стоимости билета, другую для хранения количества
        // рублей для одной бонусной милли

        // Рассчитываете количество бонусных милль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран
        System.out.println("Брнусные мили = " + bonus_mile);
    }


}