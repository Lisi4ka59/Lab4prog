

public class GlassTable {
    public String Key () {
        return "ключ";
    }
    public String Book () {
        return "книжка с названием: 'УЧИСЬ СКЛАДЫВАТЬСЯ!'";
    }
    public void table(){
        double i = Math.random();
        if (i > 0.8){
            System.out.printf("На столе лежит: %s\n", Key());
        }
        if (0.8 > i &&  i > 0.6){
            System.out.printf("На столе лежит: %s\n", Book());
        }
        else {
            System.out.println("На столе ничего нет");
        }
    }
}
