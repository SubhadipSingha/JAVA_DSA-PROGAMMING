

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Scanner;

class Customer implements Serializable{
    String custid ;
    String name;
    String phoneno;
    static int c = 1;

    public Customer() {
    }
    public Customer( String n , String p) {
        custid = "Cust"+c;
        c++;
        name = n ;
        phoneno = p;
    }

    public String ToString(){
        return "CustomerId:"+custid+"\nName: "+name+"\nPhone Number: "+phoneno;
    }

}

public class CustomerDetailsOrObjects {
    // public static void main(String[] args) throws  Exception {
    //     Customer list[] = {
    //         new Customer("Subhadip", "90354658"),
    //         new Customer("Agniva", "456843020"),
    //         new Customer("Anirban", "348444020"),
    //         new Customer("Ayandip", "6390354658"),
    //         new Customer("Agniban", "6433443020"),
    //         new Customer("Avishek", "67398444020")
    //     };

    //     // Writing objects to file
    //     FileOutputStream fos = new FileOutputStream("D:\\output of io stream\\CustomerDetails.txt");
    //     ObjectOutputStream oos = new ObjectOutputStream(fos);

    //     // Write the length of the array
    //     oos.writeInt(list.length);

    //     // Write the Customer objects
    //     for (Customer c : list) {
    //         oos.writeObject(c);
    //     }

    //     oos.close();
    //     fos.close();
    // }
      public static void main(String[] args) throws  Exception {
               Scanner s = new Scanner(System.in);

        // Reading objects from file
        FileInputStream fis = new FileInputStream("D:\\output of io stream\\CustomerDetails.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        // Read the length of the array
        int l = ois.readInt();
        Customer[] customers = new Customer[l];

        // Read Customer objects
        for (int i = 0; i < l; i++) {
            customers[i] = (Customer) ois.readObject();
        }

        // Prompt user for input
        System.out.println("Enter Customer Name: ");
        String name = s.nextLine();

        // Search for customer by name
        boolean found = false;
        for (Customer customer : customers) {
            if (name.equalsIgnoreCase(customer.name)) {
                System.out.println(customer.ToString());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Customer not found.");
        }

        ois.close();
        fis.close();
        s.close();
    }
}
