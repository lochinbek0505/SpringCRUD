package uz.falconmobile.uz.springcrud.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import uz.falconmobile.uz.springcrud.model.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProjectService {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(0, "Apple", 150),
            new Product(1, "Samsung", 150),
            new Product(0, "Apple", 150),
            new Product(1, "Samsung", 150),
            new Product(0, "Apple", 150)));

    public List<Product> getProducts() {

        return products;

    }


    public Product getProductById(int id) {

        return products.stream().filter(p -> p.getProdId() == id).findFirst().get();

    }


    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProduct(Product product) {

        int index = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProdId() == product.getProdId()) {

                index = i;

            }

        }

        products.set(index, product);

    }

    public void deleteProduct(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProdId() == id) {

                products.remove (products.get(i));

            }

        }

    }
}
