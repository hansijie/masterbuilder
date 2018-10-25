package hello;

import org.junit.Test; 
import static org.junit.Assert.assertEquals; 
import org.junit.Test; 
import hello.HelloWorld;
import hello.Greeter;

public class HelloWorldTest{
	@Test
	public void testSayHello(){
                Greeter greeter = new Greeter();
		assert (greeter != null);
		assertEquals("The message received is changed to : HelloWorld",  greeter.sayHello("Hello World") );
	}
}
