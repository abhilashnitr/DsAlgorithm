package Practise;

public class TripleStep {
    public static int dynTripleStep(int step){
        int[] res=new int[step+1];
        res[0]=1;
        res[1]=1;
        res[2]=2;
        for(int i=3;i<=step;i++){
            res[i]=res[i-1]+res[i-2]+res[i-3];
        }
        return res[step];
    }

    public static int recTripleStep(int step){
        if(step<0)
            return 0;
        if(step==0||step==1)
            return 1;
        else {
            return recTripleStep(step-1)+
                    recTripleStep(step-2)+
                    recTripleStep(step-3);
        }
    }
    public static  void main (String_Util[] args){
        int step=5;
        System.out.println(recTripleStep(step));
        System.out.println(dynTripleStep(step));
    }
}
