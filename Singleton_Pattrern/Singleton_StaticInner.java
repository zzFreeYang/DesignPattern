package Singleton_Pattrern;

/**
 * 静态内部类实现
 */
public class Singleton_StaticInner {

private  Singleton_StaticInner(){
}

private static class LazyHolder{
        private static final Singleton_StaticInner INSTANCE = new Singleton_StaticInner();
}

public static  final Singleton_StaticInner getInstance(){
    return LazyHolder.INSTANCE;
}

public void show(){
    System.out.println("我的编号是: " + LazyHolder.INSTANCE);
}

}
