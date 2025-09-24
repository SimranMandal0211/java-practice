class Student{
    String name;
    int rollno;
    double marks;

    Student(String name, int rollNo, double marks) {
        this.name = name;
        this.rollno = rollNo;
        this.marks = marks;
    
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Rollno: "+rollno);
        System.out.println("Marks: "+marks);
    }
}

public class StudentDetails {
    
    public static void main(String args[]){
    // creating objects
    Student s1 = new Student("Simran", 2, 98.0);
    Student s2 = new Student("Sandeep", 29, 68);

    System.out.println("Student 1 Details: ");
    s1.display();
    
    System.out.println("Student 2 Details: ");
    s2.display();
    }
}
