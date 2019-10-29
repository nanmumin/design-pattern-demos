package cola.singleton.lazy;

public class LazySimpleSingleton {
    private static LazySimpleSingleton lazySimpleSingleton=null;
    private LazySimpleSingleton(){}
    public synchronized static LazySimpleSingleton getInstance(){
        if(null==lazySimpleSingleton){
            lazySimpleSingleton=new LazySimpleSingleton();
        }
        return lazySimpleSingleton;
    }
}
