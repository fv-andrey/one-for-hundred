public class Main {
    public static void main(String[] args) {

        int initial = 100;
        int replenishment = 300;
        int result = initial + replenishment;
        int bonus = result / 100;

        if (result > 1000) {
            System.out.println(("Вам начислено ") + bonus + (" бонусов") );
            System.out.println(("На вашем счету ") + (result + bonus) + (" рублей"));
        } else {
            System.out.println(("На вашем счету ") + result + (" рублей"));
            System.out.println(("Пополните счет более чем на ") + (1000 - result) + (" рублей и мы начислим вам 1 рубль за каждые 100 рублей на вашем счету"));
        }
    }
}
