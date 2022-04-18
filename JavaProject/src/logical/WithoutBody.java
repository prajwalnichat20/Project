package logical;

public class WithoutBody {
	public static void main(String[] args) {
		int a=10;
		if(a==10)
			System.out.println("10 if");
		
		else 
			System.out.println("10 else");
		
			System.out.println("kkk");
		while(10!=a) 
			System.out.println("while");
		System.out.println("while2");
		
		
		String s1="      Hi    2";
		String s2="Hello";
		
		String s4=s1.trim();
		System.out.println(s4);
		
		String s3=s1.concat(s2);
		System.out.println(s3);
		
		for(int i=0;i<s3.length();i++) 
			if(i%2 !=0)
				System.out.print(s3.charAt(i));
			
		
	}
	


}
