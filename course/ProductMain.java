package course;

public class ProductMain {
    public static void main(String[] args) {
        //Book Object
        Book b = new Book();
        b.name = "Let's end pseudo Secularism";
        b.price = 300;
        b.bId = 101;
        b.author = "Ramit Roshan";
        b.genre = "Future OF Bharat";
        b.pages  = 300;

        b.applyDiscount(10);
        System.out.println(b);
         System.out.println("Reading time: " + b.getReadingTime() + " hours");


         // Accessories object
        Accessories acc = new Accessories();
        acc.name = "Headphones";
        acc.price = 2000;
        acc.accessoryId = 201;
        acc.type = "Audio";
        acc.brand = "JBL";
        acc.isWarranty = true;

        acc.applyDiscount(15);
        System.out.println(acc);
        System.out.println("Warranty Available: " + acc.isWarrantyAvailable());
    }
}

class Product{
    String name;
    int price;

    // Instance method to apply discount
    public void applyDiscount(double percentage) {
        if (percentage > 0 && percentage <= 100) {
            // price = price - (int) (price * percentage / 100); // calculating discount
            price -= price * percentage / 100;
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
    int pages;

    // Child-specific instance method
    public int getReadingTime(){
        // Assume 20 pages per hour
        return pages / 20;
    }

    @Override //label
    public String toString(){
        return "Book[bId=" + bId + ",author=" + author + ",genre=" + genre + ",pages=" + pages + ",price=" + price+ "]";
    }
}

//Create a class Accessories that extends Product.
class Accessories extends Product{
    int accessoryId;
    String type;
    String brand;
    Boolean isWarranty;

    // Child-specific instance method
    public boolean isWarrantyAvailable() {
        return isWarranty;
    }

    @Override
    public String toString() {
        return "Accessories [id=" + accessoryId +
                ", name=" + name +
                ", type=" + type +
                ", brand=" + brand +
                ", price=" + price +
                ", warranty=" + isWarranty + "]";
    }
}