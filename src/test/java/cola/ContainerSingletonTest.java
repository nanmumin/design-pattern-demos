package cola;

import cola.singleton.register.ContainerSingleton;

public class ContainerSingletonTest {
    public static void main(String[] args) {
        Object obj = ContainerSingleton.getBean("cola.singleton.Pojo");
        System.out.println(obj);
    }
}
