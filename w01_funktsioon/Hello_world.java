import java.text.spi.NumberFormatProvider;

public class Hello_world{

   

    public static void main(String[] args){
        System.out.println("Hello world");


        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        boolean flag = true;

        // byte, short, int, long, float, double, char, boolean

        //comment out
        /* comment out
        with a row change*/

        System.out.println(1+1); // * / - % OPERAATORID

        /* int number = 5;
        System.out.println(number++)
        System.out.println(++number) */

        /*if (number < 10 && number > 0){
            System.out.println("Jah");
        }
        */
        
        // i++ i= i+1
        // for (int i = 0; i < 10; i++)

        /*int counter = 0;
        while(flag){
            if (!flag){
            }
            counter++;
            if counter == 10){
                System.out.println("I'm out");
                flag = false;
            }
            // do something
        */
    int[] numberArray = new int[] {1, 2, 3, 4, 5,};

    for (int element : numberArray){
        System.out.println(element);
    }

    /*for(int i = 0; i < numberArray.length; i++){
        System.out.println(numberArrray[i]);
    }*/
    
    String myName = "Maksim";
    System.out.println(myName);

    Hello_world helloworld = new Hello_world();

    //helloworld.printSomething();

    printSomething(10);

        }

        static void printSomething(int number){
            for (int i = 1; i < 10; i++){
                number += i;
            }
            System.out.println(number);
        }
    
}