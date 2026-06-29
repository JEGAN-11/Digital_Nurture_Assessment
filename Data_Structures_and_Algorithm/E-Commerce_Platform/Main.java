import java.util.Arrays;
import java.util.Comparator;

public class Product{

    int productId;
    String productName;
    String category;
    
    public Product(int productId, String productName, String category) {

        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }


    public void display(){

        System.out.println(
            "Product ID: " + productId +
            ", Name: " + productName +
            ", Category: " + category
        );
    }


    public static Product linearSearch(Product[] products, int id) {

        for(Product product : products) {

            if(product.productId == id) {
                return product;
            }
        }

        return null;
    }



  
    public static Product binarySearch(Product[] products, int id) {

        int left = 0;
        int right = products.length - 1;


        while(left <= right) {

            int mid = (left + right) / 2;


            if(products[mid].productId == id) {

                return products[mid];
            }

            else if(products[mid].productId < id) {

                left = mid + 1;
            }

            else {

                right = mid - 1;
            }
        }

        return null;
    }




    public static void main(String[] args) {


        Product[] products = {

            new Product(100,"pc","Electronics"),
            new Product(101,"sandals","Fashion"),
            new Product(102,"phone","Electronics"),
            new Product(103,"bracelet","Accessories"),
            new Product(104,"book","Education")

        };


        System.out.println("Linear Search Result:");

        Product result1 = linearSearch(products,101);


        if(result1 != null)
            result1.display();

        else
            System.out.println("Product not found");



       

        Arrays.sort(
            products,
            Comparator.comparingInt(p -> p.productId)
        );


        System.out.println("\nBinary Search Result:");

        Product result2 = binarySearch(products,101);


        if(result2 != null)
            result2.display();

        else
            System.out.println("Product not found");



        System.out.println("\nAnalysis:");

        System.out.println(
            "Linear Search: Best O(1), Average O(n), Worst O(n)"
        );

        System.out.println(
            "Binary Search: Best O(1), Average O(log n), Worst O(log n)"
        );

        System.out.println(
            "Binary Search is more suitable for large e-commerce platforms."
        );

    }

}
