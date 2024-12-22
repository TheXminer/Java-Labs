import java.util.HashSet;
import java.util.TreeMap;

public class Task16 {
    private TreeMap<Integer, Product> productTreeMap = new TreeMap<>();
    private HashSet<String> productNames = new HashSet<>();
    public void addProduct(int article, Product product){
        if(article < 0 || product == null || product.price < 0 || product.title == null || product.title.isEmpty())
            return;
        productTreeMap.put(article, product);

        if(productNames.contains(product.title)){
            productNames.remove(product.title);
            return;
        }

        productNames.add(product.title);
    }
    public boolean checkUniqueName(String productName){
        return productNames.contains(productName);
    }
    public TreeMap<Integer, Product> getProducts(){
        return productTreeMap;
    }
    public Product getProduct(int article) {
        return productTreeMap.get(article);
    }
    public boolean updateProductPrice(int productArticle, float changedPrice){
        if(!productTreeMap.containsKey(productArticle) || changedPrice < 0)
            return false;
        var product = productTreeMap.get(productArticle);
        product.price = changedPrice;
        return true;
    }
}
class Product {
    public String title;
    public float price;
    public Product(String title, float price){
        this.price = price;
        this.title = title;
    }
    @Override
    public boolean equals(Object obj){
        if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }
        Product other = (Product) obj;
        if(other.price == this.price && other.title.equals(other.title)){
            return true;
        }
        return false;
    }
}
