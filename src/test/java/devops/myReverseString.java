package devops;

public class myReverseString {
	public static String reverse(String input)
	{
		if (input ==null)
		{
			return null;
		}
		
		char[] chare= input.toCharArray();
		String reverses ="";
		for (int i =chare.length -1; i>=0;i--)
		{
			reverses += chare[i];
		}
		return reverses;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Ashish";
System.out.println("Original" + str);
System.out.println("reverse " + reverse(str));
	}

}
