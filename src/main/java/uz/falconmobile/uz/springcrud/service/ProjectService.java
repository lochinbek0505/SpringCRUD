package uz.falconmobile.uz.springcrud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import uz.falconmobile.uz.springcrud.model.Product;
import uz.falconmobile.uz.springcrud.repository.ProductRepo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProjectService {

    @Autowired
    ProductRepo repo;

    public List<Product> getProducts() {

        return repo.findAll();

    }


    public Product getProductById(int id) {

        return repo.findById(id).orElse(null);

    }


    public void addProduct(Product product) {
        repo.save(product);

    }

    public void updateProduct(Product product) {

        repo.save(product);
    }

    public void deleteProduct(int id) {
        repo.deleteById(id);

    }
}
