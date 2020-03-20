package Serialization;

import java.io.*;

class Demo implements Serializable{
    int x;
    int y;
    private static final long SerialVersionUid=101;

    transient int z;
    //int z;
    Demo(int x,int y){
        this.x=x;
        this.y=y;
     //   this.z=50;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

//    public int getZ() {
//        return z;
//    }
}

public class SerializationExample {



    public static void main(String[] args) {
//        Demo d1=new Demo(3,4);
//        Demo d2=new Demo(5 ,6);
//
//        try
//        {
//            //Saving of object in a file
//            FileOutputStream file = new FileOutputStream("Ser.txt");
//            ObjectOutputStream out = new ObjectOutputStream(file);
//            // Method for serialization of object
//            out.writeObject(d1);
//            out.writeObject(d2);
//            out.close();
//            file.close();
//            System.out.println("Object has been serialized");
//        }catch(IOException e){
//            e.printStackTrace();
//        }


        Demo object1 = null;
        Demo object2 = null;
        // Deserialization
        try
        {
            // Reading the object from a file
            FileInputStream file = new FileInputStream("Ser.txt");
            ObjectInputStream in = new ObjectInputStream(file);

            // Method for deserialization of object
            object1 = (Demo)in.readObject();
            object2 = (Demo)in.readObject();

            in.close();
            file.close();

            System.out.println("Object has been deserialized ");
            System.out.println("X = " + object1.getX());
            System.out.println("Y = " + object1.getY());
            System.out.println("X = " + object2.getX());
            System.out.println("Y = " + object2.getY());

            //System.out.println(object1.getZ()+"  "+object2.getZ());
        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }

        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }


    }



}
