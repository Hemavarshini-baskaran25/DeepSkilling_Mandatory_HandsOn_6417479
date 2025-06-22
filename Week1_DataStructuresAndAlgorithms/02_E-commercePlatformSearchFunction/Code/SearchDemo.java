import java.util.Arrays;
import java.util.Comparator;

public class SearchDemo {

    public static int linearSearch(Product[] products, String key) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productName.equalsIgnoreCase(key)) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(Product[] products, String key) {
        Arrays.sort(products, Comparator.comparing((Product p) -> p.productName.toLowerCase()));
        int low = 0, high = products.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(key);
            if (cmp == 0) return mid;
            else if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product("P101", "Keyboard", "Electronics"),
            new Product("P102", "Shoes", "Fashion"),
            new Product("P103", "Book", "Education"),
            new Product("P104", "Mouse", "Electronics")
        };

        System.out.println("Linear Search for 'Shoes'");
        int linearIndex = linearSearch(products, "Shoes");
        System.out.println("Found at index: " + linearIndex);

        System.out.println("\nBinary Search for 'Book'");
        int binaryIndex = binarySearch(products, "Book");
        System.out.println("Found at index: " + binaryIndex);
    }
}
