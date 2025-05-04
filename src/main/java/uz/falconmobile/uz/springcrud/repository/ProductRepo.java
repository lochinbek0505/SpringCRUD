package uz.falconmobile.uz.springcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.falconmobile.uz.springcrud.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {


}
