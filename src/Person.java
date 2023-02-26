public class Person implements Describable{
    private String name;

    private int health=100;
    private int size;

    public Person(String name, int size){
        setName(name);
        setSize(size);
    }

    public void setSize(int size) {
        if (size > 0){
            this.size =size;
        }
        else throw new WrongSizeException();
    }
    public int getSize(){
        return size;
    }

    public StateOfHealth getState()
    {
        if (health >=90)
            return StateOfHealth.healthy;
        else if (health <=0)
            return StateOfHealth.dead;

        return StateOfHealth.sick;
    }

    public void Describe() {
        System.out.println("Человек");
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name!=null)
            this.name = name;
        else
            throw new IllegalArgumentException("Имя не может быть пустым.");
    }

    public void injure(int injury) {
        health -= injury;

        if (health<0)
            health = 0;
    }

    @Override
    public String toString()
    {
        return String.format("Человек: %s, здоровье: %s (%d%%), рост: %d", name, getState(), health,size);
    }

    @Override
    public boolean equals(Object o)
    {
        if (o == null || !(o instanceof Person))
            return false;

        Person p = (Person) o;

        return name.equals(p.name);
    }

    public void hurt(Danger danger)
    {
        if (danger!=null) {
            danger.CauseDamage(this);
            System.out.printf("Повреждение %s от %s\n", name, danger.getTitle());
        }
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
