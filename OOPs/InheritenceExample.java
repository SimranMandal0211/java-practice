class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    void displayPerson(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}

class Student extends Person{
    int rollno;

    Student(String name, int age, int rollno){
        super(name, age);
        this.rollno = rollno;
    }

    void displayStudent(){
        displayPerson();
        System.out.println("Rollno: "+rollno);
    }
}

class GraduateStudent extends Student{
    String thesisTopic;

    GraduateStudent(String name, int age, int rollno, String thesisTopic){
        super(name, age, rollno);
        this.thesisTopic = thesisTopic;
    }

    void displayGraduateStudent(){
        displayStudent();
        System.out.println("Thesis Topic: "+thesisTopic);
    }
}

public class InheritenceExample{
    public static void main(String args[]){
        GraduateStudent g1 = new GraduateStudent("Simran", 24, 2, "Java");

        System.out.println("Graduate Student details: ");
        g1.displayGraduateStudent();
    }
}