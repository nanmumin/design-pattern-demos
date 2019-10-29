package cola;

import cola.singleton.register.EnumSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class EnumSingletonTest {
//    public static void main(String[] args) {
//        EnumSingleton s1=null;
//        EnumSingleton s2 = EnumSingleton.getInstance();
//        s2.setData("test");
//        FileOutputStream fos = null;
//        try{
//            fos=new FileOutputStream("EnumSingleton.obj");
//            ObjectOutputStream oss = new ObjectOutputStream(fos);
//            oss.writeObject(s2);
//            oss.flush();
//            oss.close();
//
//            FileInputStream fis = new FileInputStream("EnumSingleton.obj");
//            ObjectInputStream ois = new ObjectInputStream(fis);
//            s1 = (EnumSingleton)ois.readObject();
//            ois.close();
//
//            System.out.println(s1);
//            System.out.println(s2);
//            System.out.println(s1==s2);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
public static void main(String[] args) {
    try{
        Class clazz = EnumSingleton.class;
        Constructor c = clazz.getDeclaredConstructor();
        c.setAccessible(true);
        //从jdk层面就为枚举保驾护航
        c.newInstance("test",123);
    }catch (Exception e){
        e.printStackTrace();
    }
}
}
