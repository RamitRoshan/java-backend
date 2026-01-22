package course;

public class ProductMain {
    public static void main(String[] args) {
        
    }
}

class Product{
    String name;
    int price;

    // Instance method to apply discount
    public void applyDiscount(double percentage) {
        if (percentage > 0 && percentage <= 100) {
            price = price - (int) (price * percentage / 100); // calculating discount
        } else {
            System.out.println("Invalid discount percentage");
        }
    }
}

//Create a class Book that extends Product.
class Book extends Product{
    //via inheritance
    //String name;
    //int price
    int bId;
    String author;
    String genre;
    int page;
}
