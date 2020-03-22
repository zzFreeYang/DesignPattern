package Singleton_Pattrern;

/**
 *  普通单例模式
 */

public class Singleton {

    private static final Singleton singleton = new Singleton();

    private Singleton(){
    }

    public synchronized static Singleton getSingleton(){
        return singleton;
    }

    public  void show(){
        System.out.println("我的编号是:"+singleton);
    }
}
