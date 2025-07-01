package devops;

public class finalPractice {
	public static String finalPractice1(String myfinalstring)
	{
		if(myfinalstring==null)
		{
			return null;
		}
		
		char[] chart = myfinalstring.toCharArray();
		String Reverfinalstring =" ";
		for(int i=chart.length-1;i>=0;i--)
		{
			Reverfinalstring += chart[i];
		}
		return Reverfinalstring;
		}

	public static void main(String[] args) {

String stry ="myfinalstring";
System.out.println("original" +stry);
System.out.println("reveresestring " +   finalPractice1(stry));


	}

}
