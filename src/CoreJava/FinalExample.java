package CoreJava;

public class FinalExample {



    public static void main(String[] args) {

        abc c=new abc();
        c.syso();
       // c.syso1();
    }
}


class  abc{

    int a=0;
    static  int b=0;
     void syso(){

        this.a=10;
        this.b=200;
        System.out.println(a+"  "+b);
    }



}

//class bcd extends abc{
//   void syso(){
//        System.out.println("HiHI");
//    }
//
//    void syso1(){
//        System.out.println("HiHI1");
//    }
//}

