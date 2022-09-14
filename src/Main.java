public class Main {
    public static void main(String[] args) {

        int remainder = 300; // остаток денег в кошельке
        int replenishment = 1500; // пополнение

        int bonus;
        if (replenishment > 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        System.out.println("итоговый счёт:");
        System.out.println((bonus + remainder + replenishment) + " рублей ");
    }
}
