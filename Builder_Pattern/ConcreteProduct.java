package Builder_Pattern;

public class ConcreteProduct extends Builder {

    //一个产品A
    private  Product product = new Product();
    //设置产品零件
    @Override
    public void setPart(boolean isAlarm) {
        if(isAlarm) {
            System.out.println("注入属性:我会叫");
        } else {
            System.out.println("注入属性:我不会叫");
        }
    }
//组建一个产品
    @Override
    public Product getbuildProduct() {
        System.out.println("产品A已完工");
        return this.product;
    }
}
