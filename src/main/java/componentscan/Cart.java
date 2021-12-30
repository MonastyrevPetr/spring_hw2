package componentscan;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Cart {
    private List<Product> products = new ArrayList<Product>();

    public void cartAdd(Product product){
        if (product != null){
            products.add(product);
        }

    }

    public Product findId(int id){
        for (Product product:products){
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    public void cartRemove(int id){
        products.remove(findId(id));
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
