package EXTRAS;

public class GETANDSETencaptulation {

   public static class human{
    private String name;
    private int weight;
    private Double height;

    human(String name,int weight,double height){
        this.setheight(height);;
        this.setname(name);
        this.setweight(weight);;
    }
    public String getname(){
        return name;
    }
    public int getweight(){
        return weight;
    }
    public double getheight(){
        return height;
    }
  
   public void setname(String name){
        this.name = name;
    }
    public void setheight(double height){
        this.height = height;
    }
    public void setweight(int weight){
        this.weight = weight;
    }

   }

    public static void main(String[] args) {
        human h =new human("subhadip", 85, 189);
        System.out.println(h.getname()+"\n"+h.getheight()+"\n"+h.getweight());

    }
}
