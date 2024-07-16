import java.util.*;


public class Calculater {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
     Scanner s=new Scanner(System.in);
     int n ,a,b;
     
     System.out.println("ENTER THE NUMBER 1:");
     a=s.nextInt();
     System.out.println("ENTER THE NUMBER 2:");
	b=s.nextInt();
		
	 System.out.println("ENTER YOUR CHOICE\n 1 FOR ADDITION \n 2 FOR SUBSTRACTION \n 3 FOR MULTIPLICATION \n 4 FOR DIVISION");
	 n=s.nextInt();
	 
	 switch(n){
	 case 1: 
		 System.out.println(a+b);
		 break;
		 
	 case 2: 
		 System.out.println(a-b);
		 break;
	 case 3: 
		 System.out.println(a*b);
		 break;
	 case 4: 
		 System.out.println(a/b);
		 break;
     default:
	 System.out.println("INVALID CHOICE");
	 break;
	 }
	}

}
