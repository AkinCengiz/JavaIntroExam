public class HelloTest{
	public static void main(String[] args)
	{
		Hello hi = new Hello();
		String answer = hi.sayHi("Jack");
		System.out.println(answer);
		answer = hi.sayHi(null);
		System.out.println(answer);
	}


}