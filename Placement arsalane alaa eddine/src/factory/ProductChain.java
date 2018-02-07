package factory;

public class ProductChain {
    private final ProductFactory productFactory;

    public ProductChain(ProductFactory productFactory) {
        this.productFactory = productFactory;
    }
}
