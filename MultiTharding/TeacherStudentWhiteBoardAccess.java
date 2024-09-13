
package MultiTharding;

class whiteBoard {
    String text = "";
    int noofstudent = 0, count = 0;

    synchronized public void Write(String t) {
        System.out.println("Teacher is Writing: " + t);
        while (count != 0) {  // Wait if students are still reading
            try {
                wait();
            } catch (Exception e) {
            }
        }
        text = t;
        count = noofstudent;
        notifyAll();  // Notify all students to start reading
    }

    synchronized public String read() {
        while (count == 0) {  // Wait if teacher hasn't written anything
            try {
                wait();
            } catch (Exception e) {
            }
        }
        String v = text;
        count--;
        if (count == 0) notify();  // Notify teacher once all students have read
        return v;
    }

    public void Attendence() {
        noofstudent++;
    }
}

class Teacher extends Thread {
    whiteBoard content;

    String[] formulas = {
        "a^2 + 2ab + b^2 = (a + b)^2",
        "a^2 - 2ab + b^2 = (a - b)^2",
        "a^2 - b^2 = (a + b)(a - b)",
        "(a + b + c)^2 = a^2 + b^2 + c^2 + 2ab + 2bc + 2ca",
        "(a - b)^3 = a^3 - 3a^2b + 3ab^2 - b^3",
        "(a + b)^3 = a^3 + 3a^2b + 3ab^2 + b^3",
        "(a^3 + b^3) = (a + b)(a^2 - ab + b^2)",
        "(a^3 - b^3) = (a - b)(a^2 + ab + b^2)",
        "x = (-b ± √(b^2 - 4ac)) / 2a",
        "a(b + c) = ab + ac",
        "end"  // Indicate the end of writing
    };

    public Teacher(whiteBoard w) {
        content = w;
    }

    public void run() {
        for (String f : formulas) {
            content.Write(f);
        }
    }
}

class Student extends Thread {
    String Name;
    whiteBoard look;

    public Student(String name, whiteBoard w) {
        Name = name;
        look = w;
    }

    public void run() {
        String text;
        look.Attendence();
        do {
            text = look.read();
            System.out.println("Name: " + Name + " Writing--> " + text);
        } while (!text.equals("end"));
    }
}

public class TeacherStudentWhiteBoardAccess {
    public static void main(String[] args) {
        whiteBoard w = new whiteBoard();
        Teacher t = new Teacher(w);

        t.start();

        Student s1 = new Student("Subhadip", w);
        Student s2 = new Student("Ananya", w);
        Student s3 = new Student("Rahul", w);
        Student s4 = new Student("Priya", w);
        Student s5 = new Student("Arjun", w);
        Student s6 = new Student("Neha", w);
        Student s7 = new Student("Ravi", w);
        Student s8 = new Student("Kavita", w);
        Student s9 = new Student("Vikram", w);
        Student s10 = new Student("Ishita", w);

        s1.start();
        s2.start();
        s3.start();
        s4.start();
        s5.start();
        s6.start();
        s7.start();
        s8.start();
        s9.start();
        s10.start();
    }
}
