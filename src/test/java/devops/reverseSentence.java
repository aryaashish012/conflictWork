package devops;

public class reverseSentence {
	public static String reverseword (String sentence)
	{
		if(sentence==null||sentence.isEmpty())
		{
		return null;
		}
		
		String[] newString = sentence.trim().split("\\s+");
		StringBuilder sb = new StringBuilder();
		for(int i= newString.length-1;i>=0;i--)
		{
			sb.append(newString[i]);
			if(i != 0)
			{
				sb.append(" ");
			}
		}
		return sb.toString();
		
	}
	public static void main(String[] args) {

		String sen ="MY Name Is Ashish";
		System.out.println("Original Sentence" +sen);
		System.out.print("Reverse Senetence " +reverseword(sen) ) ;
	}

}
