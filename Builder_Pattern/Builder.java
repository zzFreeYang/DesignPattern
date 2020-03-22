package Builder_Pattern;

//抽象建造类
public abstract class Builder {

   //设置产品的不同部分，以获得不同的产品
    public abstract void setPart(boolean isAlarm);

    //设置完之后可以直接拿到该对象
    public abstract Product getbuildProduct();
}
