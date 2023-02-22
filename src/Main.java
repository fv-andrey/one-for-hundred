public class Main {
    public static void main(String[] args) {

        int initial = 500;
        int replenishment = 1100;
        int bonus = replenishment / 100;
        int resultWithBonus = initial + replenishment + bonus;
        int resultWithoutBonus = initial + replenishment;


        if (replenishment > 1000) {
            System.out.println(("Вам начислено ") + bonus + (" бонусов") );
            System.out.println(("На вашем счету ") + resultWithBonus + (" рублей"));
        } else {
            System.out.println(("На вашем счету ") + resultWithoutBonus + (" рублей"));
            System.out.println("Пополните счет более чем на 1000 рублей одним платежем и мы начислим вам 1 рубыль за каждые 100");
        }
    }
}
