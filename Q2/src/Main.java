public class Main {
    public static void main(String[] args) {
        //Ice task 3

        SalesModel model = new SalesModel();
        model.ShoeBrand = "Nike";

        model.BrandSales = 100;

        PrintSales sales = new PrintSales(model.ShoeBrand,model.BrandSales);
        sales.Print();

        }
    }
