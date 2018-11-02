package junit_lecture;

public class Calc {
	public int add(int a, int b) {
		return a + b;
		}
	
	public int max(int a, int b) {
		if(a>b)
			return a;
		else
			return b;
	}
	
	public boolean areFirstandSecondLastCharTheSame(String str) {
		if (str.length()<=1)
			return false;
		if (str.length()==2)
			return true;
		
		String first2Chars = str.substring(0,2);
		String last2Chars = str.substring(str.length()-2);
		return first2Chars.equals(last2Chars);
		
	}
}
