package METHODS;

public class FindAvgAndRoundOff {

    static class Calculator {
          static double FindAVG(int a , int b , int c){
            double avg = (a + b + c)/3 ;
            return avg;
            
          }

          void RoundOF(double a , double b ){
            double num3 = a/b;
            System.out.println(Math.round(num3*100.0)/100.0); 
          }
        
    }
    

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(Calculator.FindAVG(10, 20 , 30));
        calculator.RoundOF(65, 175);
    }
}
