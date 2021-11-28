package componentscan;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductRepository {
    private List<Product> products = new ArrayList<Product>();
    private ProductRepository() {
        products.add(new Product(1,"tittle1",100));
        products.add(new Product(2,"tittle2",200));
        products.add(new Product(3,"tittle3",300));
        products.add(new Product(4,"tittle4",400));
        products.add(new Product(5,"tittle5",500));

    }

   public Product findId(int id){
        for (Product product:products){
            if (product.getId() == id) {
                return product;

            }
        }
        return null;
   }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Product prod:products){
            sb.append(prod + "\n");
        }
        return sb.toString();
    }
}
