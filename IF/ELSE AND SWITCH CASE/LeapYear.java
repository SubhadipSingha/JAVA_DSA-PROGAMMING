import java.util.Scanner;

public class LeapYear {
    public static void LeapYearChecker(int year){
        if( year%400==0 ){
            System.out.println("ENTERED YEAR "+year+" IS A LEAP YEAR");
        }else if(year%4==0 && year%100!=0){
            System.out.println("ENTERED YEAR "+year+" IS  A LEAP YEAR"); 
        }else{
            System.out.println("ENTERED YEAR "+year+" IS NOT A LEAP YEAR");
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int year =s.nextInt();
        LeapYearChecker(year);
    }
}
