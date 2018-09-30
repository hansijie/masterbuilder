package hello;

public class HelloWorld {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        String q_msg = System.getenv("Message");
        System.out.println(greeter.sayHello(q_msg));
    }
}
