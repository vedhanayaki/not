package alpha;
import java.util.Scanner;
public class alpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the value");
Scanner s=new Scanner(System.in);
char b=s.next().charAt(0);
if(b=='a'||b=='c'||b=='d')
{
	System.out.println("alphabet");
}
else
{
	System.out.println("not a alphabet");
}
	}

}
