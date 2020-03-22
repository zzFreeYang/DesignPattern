package Builder_Pattern;

public class Builder_Pattern {

    //1.不同行为A产品的建造器
    private Builder builder = new ConcreteProduct();
    // private Builder builderB = new ConcreteProductB();  如果有产品B，在这新建

    //2.不同行为的条件设置:
    private boolean isAlarm = true;
    private boolean noAlarm = false;

    //3.根据条件get不同种类的产品
    public Product getAProduct(){
        builder.setPart(isAlarm);
        return builder.getbuildProduct();
    }

    public Product getBProduct(){
        builder.setPart(noAlarm);
        return builder.getbuildProduct();
    }

    //后面还可以有A产品的其他要求，只要改变set就可以了
    //如果要生产其他产品，定义类似的ConcretreProduct类就可以
    // public Product getCProduct(){
    //  builderB.setPart();
    //  return builderB.getbuildProduct();
    // }
}
