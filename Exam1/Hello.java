public class Hello{
	String word = "people";
	
	public String sayHi(String who)
	{
		String sentence;
		if(who != null)
		{
			sentence = "Hello "+who+":)";
		}else
		{
			sentence = "Hello "+word+":)";
		}
		return sentence;
	}
	
}
