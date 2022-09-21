package BT.ss15;

public class IllegalTriangleException extends Exception{
    static IllegalTriangleException forInputString(String s){
        throw new NumberFormatException("For input string"+ s+"\n");
    }
}
