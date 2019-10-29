package cola.singleton.lazy;

public class LazyInnerSingleton {
    private static LazyInnerSingleton lazySimpleSingleton=null;
    private LazyInnerSingleton(){
        if(LazyHolder.LAZY!=null){
            throw  new RuntimeException("不允许构建多个实例");
        }
    }
    //懒汉式单例
    //LazyHolder里面的逻辑需要等到外部方法调用时才执行
    //巧妙利用了内部类的特性
    //JVM底层执行逻辑，完美的避免了线程安全问题
    //新方式GET!
    public synchronized static LazyInnerSingleton getInstance(){
        return LazyHolder.LAZY;
    }
    private static class LazyHolder{
        private static final LazyInnerSingleton LAZY = new LazyInnerSingleton();
    }
}
