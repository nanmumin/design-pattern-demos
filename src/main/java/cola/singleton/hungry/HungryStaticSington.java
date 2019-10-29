package cola.singleton.hungry;

public class HungryStaticSington {
    public static final HungryStaticSington hungryStaticSington;
    static {
        hungryStaticSington = new HungryStaticSington();
    }
    private HungryStaticSington(){}
    public static HungryStaticSington getInstance(){
        return hungryStaticSington;
    }
}
