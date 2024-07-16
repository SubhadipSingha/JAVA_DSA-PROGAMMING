package JAVA_OBJECTS.OOP;

public class bmi {
    String name;
    double weight;
    double height;
    
    //constructer
    bmi(String name,int weight,int height){
        this.name = name;
        this.weight= weight;
        this.height = height;
    } 

    bmi(int weight,int height){
        this.weight= weight;
        this.height = height;
    }

   double calculatebmi(){
    return (weight / (height*height))* 10000;
   }
   public String toString(){
    return name +"\n"+weight+"\n"+height;
    
   }
   void details(){
    double bmi = calculatebmi();
    System.out.println(this); 
    if (bmi < 18.5) {
        System.out.println("BMI Category: Underweight");
      } else if (bmi < 25) {
        System.out.println("BMI Category: Normal weight");
      } else if (bmi < 30) {
        System.out.println("BMI Category: Overweight");
      } else {
        System.out.println("BMI Category: Obese");
      }
   }
   
}
