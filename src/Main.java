public class Main {
    public static void main(String[] args) {

        Person alice = new Person("Алиса", 120);
        Person vasya = new Person("Вася",120);
        Bottle bottle = new Bottle("ВЫПЕЙ МЕНЯ!");

        try {
            bottle.doAction(alice);
        } catch (WrongHealthStateException e) {
            System.out.printf("Ошибка: %s \n", e.getMessage());
        }


        System.out.println(alice);
        Danger[] danders = new Danger[] {new Poker(75),
                new Knife("Кухонный нож"),
                new Poker( "Раскалленная кочерга",150),
                new Poison("Цианид калия")};

        try {
            alice.setSize(0);
        }
        catch (WrongSizeException ex)
        {
            System.out.printf("Ошибка: %s \n",  ex.getMessage());
        }


        System.out.println(alice.equals(vasya));
        System.out.println(alice);

        for (Danger d: danders){
            alice.hurt(d);
            System.out.println(alice);
        }
        Bottle b = new Bottle("ВЫПЕЙ МЕНЯ!");
        try {
            b.doAction(alice);
        } catch (WrongHealthStateException e) {
            System.out.printf("Ошибка: %s \n", e.getMessage());
        }
        System.out.println(alice);
    }
}