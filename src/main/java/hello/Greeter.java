package hello;

import java.util.Random;
public class Greeter {
    public String sayHello(String msg) {
        Random rand = new Random();
        int randLength = rand.nextInt(120) + 240;
        System.out.println(randLength);
        int num = 0;
        long start = System.currentTimeMillis() / 1000;
        /*
        while (true) {
            num = num + 1;
            if (num % 100000000 ==0) {
               System.out.println("Now I am at: " + num);
            }
            if (num == Integer.MAX_VALUE) { 
                System.out.println("reset");
                num = 0;
            }
            
            if ((System.currentTimeMillis() / 1000) - start > randLength) {
                break;
            }
        }
        */
        String localmsg = "The message received is changed to : " + msg;
        return localmsg;
    }
}

