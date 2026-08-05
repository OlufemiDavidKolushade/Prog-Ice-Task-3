public abstract class Sales implements ISales {

    String ShoeBrand;
    int BrandSales;

    public Sales(String ShoeBrand, int BrandSales){

        this.BrandSales = BrandSales;
        this.ShoeBrand = ShoeBrand;
    }


    @Override
    public int getBrandSales() {
        return BrandSales;
    }

    @Override
    public String getShoeBrand() {
        return ShoeBrand;
    }
}
