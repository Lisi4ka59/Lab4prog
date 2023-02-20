public class Main {
    public static void main(String[] args) {

        Person alice = new Person("Алиса");
        Person vasya = new Person("Вася");

        Danger[] danders = new Danger[] {new Poker(75),
                new Knife("Кухонный нож"),
                new Poker( "Раскалленная кочерга",150),
                new Poison("Цианид калия")};

        System.out.println(alice.equals(vasya));
        System.out.println(alice);

        for (Danger d: danders){
            alice.hurt(d);
            System.out.println(alice);
        }
    }
}