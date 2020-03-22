package Builder_Pattern;

public class Client {
    public static void main(String[] args) {
        Builder_Pattern builder_pattern = new Builder_Pattern();
        //生产1个会叫的A
        builder_pattern.getAProduct().run();
        //生产1个不会叫的A
        builder_pattern.getBProduct().run();
    }
}
