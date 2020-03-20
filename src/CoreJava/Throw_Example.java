package CoreJava;

public class Throw_Example {

    void checkAge(int age){
        if(age<18)
            throw new ArithmeticException("Not Eligible for voting");
        else
            System.out.println("Eligible for voting");
    }
    public static void main(String args[]){
        Throw_Example obj = new Throw_Example();
        obj.checkAge(19);
        System.out.println("End Of Program");
    }
}
