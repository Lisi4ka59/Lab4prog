public class Poison extends AbstractDanger {

    public Poison(String title)
    {
        setTitle(title);
    }
    @Override
    public void CauseDamage(Person p) {
        if (p!=null)
            p.injure(100);
        else
            throw new NullPointerException();
    }

    @Override
    public void Describe() {
        System.out.println("Бутылка с нарисованными черепом и костями и надписью \"Яд!\"");
    }
}
