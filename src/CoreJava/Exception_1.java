package CoreJava;

public class Exception_1 {

    public static void handleExp() throws Exception{
        try{
            int i=10;
            int j=i/0;
        }catch (Exception e){
            //e.printStackTrace();
            System.out.println("Number should not be divided by zero");
            //throw new ArithmeticException("Abhilash");
        }
        finally {
            throw  new Exception("Hello");
        }
    }

    public static void main(String[] args){
        try{
            System.out.println("First statement of try block");
            int num=45/3;
            System.out.println(num);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        finally{
            System.out.println("finally block");
        }
        System.out.println("Out of try-catch-finally block");
    }

}
