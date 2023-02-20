public class Knife extends AbstractDanger{

    public Knife(String title) {
        setTitle(title);
    }
    @Override
    public void CauseDamage(Person p) {
        if (p==null)
            throw new NullPointerException();

        p.injure(5);
    }

    @Override
    public void Describe() {
        System.out.println(
                "Если глубоко порезать палец ножом, из этого пальца, как правило, пойдет кровь.");
    }

}
