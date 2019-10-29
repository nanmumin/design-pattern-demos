package cola.singleton.hungry;

public class HungrySingleton {
    public static HungrySingleton hungrySingleton = new HungrySingleton();
    private HungrySingleton(){};
    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
