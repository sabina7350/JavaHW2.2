public class Main {

    public static void main(String[] args) {

        double currentBalance = 100;

        double rechargeAmount = 1200;
        int bonus;

        if (rechargeAmount > 1000) {
            bonus = (int) (rechargeAmount / 100);
        } else {
            bonus = 0;
        }

        int finalBalance = (int) (currentBalance + rechargeAmount + bonus);

        System.out.println("Бонус: " + bonus + " рублей");
        System.out.println("Итоговая сумма на счету клиента: " + finalBalance + " рублей");
    }
}