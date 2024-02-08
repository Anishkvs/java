package Program;

public class Add_Values_In_String {

	public static void main(String[] args) {
		
		String Input = "1bjb2v44bj566kkb10bk8";
		String word =Input.replaceAll("[a-z]", " ");
		System.out.println(word);
		char[] a =word.toCharArray();
		
		int sum = 0;
		for(int i=0; i<a.length; i++)
		{
			sum = sum+a[i];
		}
		System.out.println(sum);
	}
}
