package Java8;

public class Java8ForEachExample {

    public static void main(String[] args) {

        Integer x=1234;
        int len=x.toString().length();
        int[] arr=new int[len];
        int j=0;
        while(x!=0){
            arr[len-j-1]=x%10;
            x=x/10;
            j++;
        }
        for(int i:arr){
            System.out.println(i);
        }
    }
}
/*
class MyConsumer implements Consumer<Integer>{

    public void accept(Integer t) {
        System.out.println("Consumer impl Value::"+t);
    }


}*/
