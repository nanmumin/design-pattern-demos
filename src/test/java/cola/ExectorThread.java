package cola;

import cola.singleton.lazy.LazySimpleSingleton;

public class ExectorThread implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+":"+LazySimpleSingleton.getInstance().toString());
    }
}
