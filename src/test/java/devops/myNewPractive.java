package devops;

public class myNewPractive {
	
	public static String Reversemystring (String myString)
	
	{
		if(myString==null)
		{
			return null;
		}
		
		char[] chare = myString.toCharArray();
		String ReverseMyStrings ="";
		for(int i=chare.length-1;i>=0;i--)
		{
			ReverseMyStrings += chare[i];
		}
		return ReverseMyStrings;
		
	}

	public static void main(String[] args) {
String str1="MYString";
System.out.println("Original" +str1);
System.out.println("reverese" +Reversemystring(str1));
	}

}
