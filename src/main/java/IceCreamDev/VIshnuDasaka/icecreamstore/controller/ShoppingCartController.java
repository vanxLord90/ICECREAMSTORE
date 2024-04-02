package IceCreamDev.VIshnuDasaka.icecreamstore.controller;

import IceCreamDev.VIshnuDasaka.icecreamstore.model.Product;
import IceCreamDev.VIshnuDasaka.icecreamstore.service.ProductService;
import IceCreamDev.VIshnuDasaka.icecreamstore.service.ShoppingCartService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;
@RestController
@RequestMapping("/api/cart")
public class ShoppingCartController {

    private final ProductService productService;
    private final ShoppingCartService cartService;

    public ShoppingCartController(ProductService productService, ShoppingCartService cartService) {
        this.productService = productService;
        this.cartService = cartService;
    }

    @PostMapping
    public boolean addToCart(@RequestBody Product product) throws InterruptedException {
        cartService.addToCart(product.getId());
        return true;
    }

    @GetMapping("/getAllCart")
    public Map<Integer,Integer> getCartValues(@RequestParam String param) {
        System.out.println(cartService.findAll());
       return cartService.findAll();
       
    }

}
