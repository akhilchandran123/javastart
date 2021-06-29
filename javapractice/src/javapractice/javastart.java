package javapractice;
class ABCD
{
	byte a=12;
	public int fun()
	{
		return a+1;
	}
		
}

public class javastart {

	public static void main(String[] args) {
		
		
		ABCD obj=new ABCD();
		System.out.print(obj.fun());
	
		
	}

}
