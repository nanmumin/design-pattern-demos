package cola.singleton.lazy;

public class LazyDoubleCheckSingleton {
    private static LazyDoubleCheckSingleton lazySimpleSingleton=null;
    private LazyDoubleCheckSingleton(){}
    public  static LazyDoubleCheckSingleton getInstance(){
        if(null==lazySimpleSingleton){
            synchronized(LazyDoubleCheckSingleton.class) {
                if(null==lazySimpleSingleton) {
                    lazySimpleSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazySimpleSingleton;
    }
}
