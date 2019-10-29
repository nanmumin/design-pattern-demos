package cola.singleton.register;

public enum  EnumSingleton {
    INSTANCE;
    private Object data;

    public Object getData() {
        return data;
    }

    public EnumSingleton setData(Object data) {
        this.data = data;
        return this;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
