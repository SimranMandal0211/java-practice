public class MethodOverloading{
    public static int add(int a, int b){
        return (a+b);
    }

    public static int add(int a, int b, int c){
        return (a+b+c);
    }

    public static int add(int a, int b, int c, int d){
        return (a+b+c+d);
    }

    public static void main(String args[]){
        System.out.println("Sum of two number: "+add(2,3));
        System.out.println("Sum of two numbers: "+add(2,3,5));
        System.out.println("Sum of two number: "+add(2,3,5,6));
    }
}