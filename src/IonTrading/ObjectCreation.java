package IonTrading;

public class ObjectCreation  implements Cloneable{



    String name = "GeeksForGeeks";
    public static void main(String[] args) {
        ObjectCreation o1=new ObjectCreation();
        System.out.println(o1.name);

//        String s1=new String("Display");
//       // String s2=s1;
//        String s2=s1.intern();
//        String s3="Display";
//       // String s2=new String("Display");
//        //s2.intern();
//        System.out.println(s3==s2);

        String s1 = "Test";
        String s2 = "Test";

        String s3 = new String("Test");
        final String s4 = s3.intern();
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s3 == s4);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s4));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s3));

//        try {
//            Class cls = Class.forName("ObjectCreation");
//            ObjectCreation obj =
//                    (ObjectCreation) cls.newInstance();
//            ObjectCreation o2 = (ObjectCreation) Class.forName("ObjectCreation").newInstance();
//
//            System.out.println(obj.name);
//
//        }
//        catch (ClassNotFoundException e)
//        {
//            e.printStackTrace();
//        }
//        catch (InstantiationException e)
//        {
//            e.printStackTrace();
//        }
//        catch (IllegalAccessException e)
//        {
//            e.printStackTrace();
//        }
//

    }
}
