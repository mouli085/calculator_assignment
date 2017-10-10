import java.util.Scanner;
public class Input {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("enter 1st number:");
		int n1=input.nextInt();
		System.out.println("\nenter +||-||*||%:");
		char c=input.next().charAt(0);
		System.out.println("\nenter 2nd number:");
		int n2=input.nextInt();
		if(c=='+')
		{
			Add add=new Add(n1,n2);
			System.out.println("\nresult "+add.addOperation());
			
		}
		else if(c=='-')
		{
		    Sub sub=new Sub(n1,n2);
			System.out.println("\nresult "+sub.addOperation());
			
		}
		else if(c=='/')
		{
		    Div div=new Div(n1,n2);
			System.out.println("\nresult "+div.addOperation());
			
		}
		else if(c=='*')
		{
		    Mul mul=new Mul(n1,n2);
			System.out.println("\nresult "+mul.addOperation());
			
		}
		else if(c=='%')
		{
		    Mod mod=new Mod(n1,n2);
			System.out.println("\nresult "+mod.addOperation());
			
		}
	}

}
