public class PrintSales extends Sales {

    public PrintSales(String ShoeBrand, int BrandSales) {
        super(ShoeBrand, BrandSales);
    }

    public void Print(){

        System.out.println("***************************************************");
        System.out.println("Shoe Sales PrintOut");
        System.out.println("***************************************************");
        System.out.println("Shoe Brand: "+getShoeBrand());
        System.out.println("Shoe Brand Sales: "+getBrandSales());
        System.out.println("***************************************************");
    }
}
