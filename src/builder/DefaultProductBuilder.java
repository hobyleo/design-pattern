package builder;

/**
 * @author hoby
 * @since 2021-03-25
 */
public class DefaultProductBuilder implements ProductBuilder {

    private String productName;
    private String companyName;
    private String part1;
    private String part2;
    private String part3;
    private String part4;

    @Override
    public void buildProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public void buildCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public void buildPart1(String part1) {
        this.part1 = part1;
    }

    @Override
    public void buildPart2(String part2) {
        this.part2 = part2;
    }

    @Override
    public void buildPart3(String part3) {
        this.part3 = part3;
    }

    @Override
    public void buildPart4(String part4) {
        this.part4 = part4;
    }

    @Override
    public Product build() {
        return new Product(productName, companyName, part1, part2, part3, part4);
    }
}
