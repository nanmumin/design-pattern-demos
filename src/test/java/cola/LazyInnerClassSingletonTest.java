package cola;

import cola.singleton.lazy.LazyInnerSingleton;

import java.lang.reflect.Constructor;

public class LazyInnerClassSingletonTest {
    public static void main(String[] args) {
        try {
            Class<?> clazz = LazyInnerSingleton.class;
            Constructor c = clazz.getDeclaredConstructor(null);
            c.setAccessible(true);
            Object o1 = c.newInstance();
            Object o2 = LazyInnerSingleton.getInstance();
            System.out.println(o1==o2);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
