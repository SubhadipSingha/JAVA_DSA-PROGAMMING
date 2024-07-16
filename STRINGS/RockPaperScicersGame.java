package STRINGS;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScicersGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(true){
          String[] rps = {"r", "p" ,"s"};
          String umove;
          String cmove = rps[new Random().nextInt(rps.length)];
            while(true){
                System.out.println("ENTER YOUR MOVE (ROCK/PAPER/SCICERS):");
                umove = s.nextLine();

           
            
        //INVALID SECTION
        if(umove.equals("r")||umove.equals("s")||umove.equals("p")){
            break;
        }{
            System.out.println(umove+"YOUR MOVE IS NOT VALID ENTER A VALID MOVE");
        }
    }    
     System.out.println("COMPUTER'S MOVE IS:"+cmove);
        //tie section
        if(umove.equals(cmove)){
            System.out.println("THE GAME WAS A TIE!");
        }

        //lose win section
            
        if (umove.equals(cmove)) {
            System.out.println("THE GAME WAS A TIE!");
        } else if ((umove.equals("r") && cmove.equals("s")) ||
                   (umove.equals("p") && cmove.equals("r")) ||
                   (umove.equals("s") && cmove.equals("p"))) {
            System.out.println("YOU WIN!");
        } else {
            System.out.println("YOU LOSE!");
        }

     System.out.println("Do you want to play more (y/n)-->");
      String choice = s.nextLine();
      if(choice.equals("n")){
        return;
      }
     
    }
  }
}

