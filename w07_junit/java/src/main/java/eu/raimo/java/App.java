package eu.raimo.java;

/**
 * Hello world!
 *
 */
public class App {

    private String name;
    public int code;

    public App(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public int maxValue(int a, int b){
        return a > b ? a : b;
    }

    public static void main(String[] args){
        System.out.println( "Hello World!" );
    }


}
