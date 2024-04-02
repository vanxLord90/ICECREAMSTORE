package IceCreamDev.VIshnuDasaka.icecreamstore.repo;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import IceCreamDev.VIshnuDasaka.icecreamstore.model.Product;

import java.util.List;


@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{
        List<Product> getAllProducts();
}