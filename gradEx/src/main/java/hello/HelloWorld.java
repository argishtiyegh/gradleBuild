package hello;
import org.joda.time.LocalTime;

/*
	For example, suppose that in addition to saying "Hello World!",
	you want the application to print the current date and time.
	You could use the date and time facilities in the native Java libraries,
	but you can make things more interesting by using the Joda Time libraries.
	gradle tasks - to see all the tasks that available
	gradle build to make a build and import all the dependecies... gradle also creates .jar executable file
*/

public class HelloWorld {
  public static void main(String[] args) {
		LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is: " + currentTime);
		Greeter greeter = new Greeter();
		System.out.println(greeter.sayHello());
  }
}