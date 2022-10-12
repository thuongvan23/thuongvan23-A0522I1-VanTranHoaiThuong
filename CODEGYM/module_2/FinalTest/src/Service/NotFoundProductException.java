package Service;

public class NotFoundProductException extends Exception{
    static NotFoundProductException forInputString(String s){
        throw new NumberFormatException("For input string"+ s+"\n");
    }
}
