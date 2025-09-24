class Animal{
    void sound(){
        System.out.println("Animal make sounds");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}

class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Cat mewos");
    }
}

public class MethodOverriding {
    public static void main(String args[]){
        Animal a1 = new Animal();
        Animal a2 = new Dog();
        Animal a3 = new Cat();

        a1.sound();
        a2.sound();
        a3.sound();
    }
}
