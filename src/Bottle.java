public class Bottle {
    String title;
    public Bottle (String title){
        this.title = title;
    }
    public void doAction (Person p) throws WrongHealthStateException {
        if (p != null) {
            if (p.getState()!= StateOfHealth.dead) {
                p.setSize(25);
            }
            else {
                throw new WrongHealthStateException();
            }
        }
        else {
            throw new NullPointerException();
        }
    }

}
