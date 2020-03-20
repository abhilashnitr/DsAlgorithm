package IonTrading;

class Emp{
    int x;

    public Emp(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
public class Test5 {

    public static void change(Emp e){
        e.setX(15);
    }

    public static void main(String[] args) {

        Emp e1=new Emp(5);
        System.out.println(e1.getX());
        Emp e2=e1;
        e1.setX(10);
        System.out.println(e2.getX());
        change(e1);
        System.out.println(e1.getX());

    }
}
