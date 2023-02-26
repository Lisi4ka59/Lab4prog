public class WrongHealthStateException extends Exception {
    public WrongHealthStateException (){
        super("Нельзя применять действия к человеку, который мертв");
    }
}
