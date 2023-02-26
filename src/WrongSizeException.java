public class WrongSizeException extends RuntimeException {
    public WrongSizeException (){
        super("Рост должен быть больше нуля");
    }
}
