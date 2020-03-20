package IonTrading;

public class Test {

    public static void main(String[] args){
    Currencies currencies=new Currencies();
    String[] s1=currencies.getCurrencies();
    s1[1]="Change";
    String[] s2=currencies.getCurrencies();
    String[] s3=s2;

    System.out.println(s1[1]);
    System.out.println(s2[1]);
    System.out.println(s3[1]);
    }
}

class Currencies {
    private String[] currencies = new String[] {"EUR", "USD", "INR"}; // 1
    public String[] getCurrencies() {
        String[] currencies1=currencies.clone();
        return currencies1;
    }
    }