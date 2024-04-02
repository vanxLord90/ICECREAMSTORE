package IceCreamDev.VIshnuDasaka.icecreamstore.controller;

import IceCreamDev.VIshnuDasaka.icecreamstore.model.Product;
import IceCreamDev.VIshnuDasaka.icecreamstore.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping()
    public List<Product> findAll() {
        return productService.findAll();
    }


}
