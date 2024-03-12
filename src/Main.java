public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.

        int initAmount = 100;
        int deposit = 1100;
//        int deposit = 300;
        int bonus = 0;
        int totalAmount = 0;
        if (deposit > 1000) {
            int hundred = (int) Math.floor(deposit / 100);
            bonus = hundred * 1;
            totalAmount = initAmount + deposit + bonus;
            System.out.println("Итоговая сумма на счета абонента:" + totalAmount + "рублей");
            System.out.println("Количество начисленных бонусов:" + bonus);
        } else {
            totalAmount = initAmount + deposit;
            System.out.println("Итоговая сумма на счета абонента:" + totalAmount + "рублей");
            System.out.println("Количество начисленных бонусов:" + bonus);
        }
    }
}


