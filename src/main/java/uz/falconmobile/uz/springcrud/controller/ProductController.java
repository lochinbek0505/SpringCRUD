package uz.falconmobile.uz.springcrud.controller;

import jakarta.servlet.Servlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uz.falconmobile.uz.springcrud.model.Product;
import uz.falconmobile.uz.springcrud.service.ProjectService;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProjectService projectService;
    @Autowired
    private Servlet servlet;

    @GetMapping("/products")
    public List getProduct() {

        return projectService.getProducts();

    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable int id) {

        return projectService.getProductById(id);


    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product product) {

        projectService.addProduct(product);

    }

    @PutMapping("/products")
    public  void updateProduct(@RequestBody Product product) {


        projectService.updateProduct(product);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable int id) {

        projectService.deleteProduct(id);

    }

}
