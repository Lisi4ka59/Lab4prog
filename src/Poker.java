public class Poker extends AbstractDanger{
    private int temperature;


    public Poker(int temperature) {
        this("Кочерга", temperature);
    }

    public Poker(String title , int temperature) {
        setTitle(title);
        this.temperature = temperature;
    }
    @Override
    public void CauseDamage(Person p) {
        if (p==null)
            throw new NullPointerException();

        if (temperature>=100)
            p.injure(20);
        else if (temperature>=70)
            p.injure(10);
    }

    @Override
    public void Describe() {
        System.out.println("Докрасна раскалленная кочерга, которой можно обжечься.");
    }

    @Override
    public boolean equals(Object o)
    {
        if (o == null || !(o instanceof Poker))
            return false;

        Poker p = (Poker) o;

        return title.equals(p.title) && temperature == p.temperature;
    }
}
