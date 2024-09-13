package MultiTharding;

 class  ATM{
   
   long balance = 0;

   synchronized  public long getbalance(){
    System.out.println("fetching...");
   try{Thread.sleep(1000);}catch(Exception e){}
    return balance;
   }
   synchronized  public   boolean withdraw(String name , long amount){
    System.out.println("withdrawing...");
   try{Thread.sleep(100000);}catch(Exception e){}
    if(balance > amount){
        balance -= amount;
      System.err.println("SuccessFull");
      return true;

    } else {
        System.err.println("Insufficient funds for " + name + ".");
        return false;
    }
   }

   synchronized  public void deposit(String name, long amount){
    System.out.println("depositing...");
    try{Thread.sleep(1000);}catch(Exception e){}
    balance += amount;
    System.out.println(name + " deposited " + amount + ". Current balance: " + balance);
   }
}

 class Customer extends Thread{
  private  ATM atm ;
  private String name;
  private long amount;
  private boolean withdraw;

  public Customer ( String name , ATM atm ,long amount , boolean withdraw){
    this.name=name;
    this.atm =atm;
    this.amount = amount;
    this.withdraw = withdraw;
  }

   public void run(){
    if(withdraw){
        atm.withdraw(name, amount);

    }else{
        atm.deposit(name, amount);
    }
   }
 }


public class ATMManageMentSystem{
    public static void main(String[] args) {
        ATM a= new ATM();
         Customer c1 = new Customer("John Doe", a, 5000, false); // Deposit
        Customer c2 = new Customer("Jane Smith", a, 2000, true); // Withdraw
        Customer c3 = new Customer("Alice Brown", a, 3000, true); // Withdraw
        Customer c4 = new Customer("Bob White", a, 10000, false); // Deposit
       c1.start();
       c2.start();
        c3.start(); 
        c4.start();
        System.out.println("Now Balance: "+a.getbalance());


    }
}