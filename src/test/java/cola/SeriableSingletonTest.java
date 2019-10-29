package cola;

import cola.singleton.seriable.SeriableSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SeriableSingletonTest {
    public static void main(String[] args) {
        SeriableSingleton s1=null;
        SeriableSingleton s2 = SeriableSingleton.getInstance();
        FileOutputStream fos = null;
        try{
            fos=new FileOutputStream("SeriableSingleton.obj");
            ObjectOutputStream oss = new ObjectOutputStream(fos);
            oss.writeObject(s2);
            oss.flush();
            oss.close();

            FileInputStream fis = new FileInputStream("SeriableSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (SeriableSingleton)ois.readObject();
            ois.close();

            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1==s2);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
