package CoreJava;

public class Throws_Example {

    int division(int a, int b) {
        int t = a/b;
        return t;
    }
    public static void main(String args[]){
        Throws_Example obj = new Throws_Example();
        try{
            System.out.println(obj.division(15,0));
        }
        catch(ArithmeticException e){
            System.out.println("You shouldn't divide number by zero");
        }
    }
}
