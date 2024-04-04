package com.example.demo.controller;

import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BuyProductController {

    private final ProductService productService;

    @Autowired
    public BuyProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/decrementInventory/{productId}")
    public String decrementProductInventory(@PathVariable int productId) {
        productService.decrementProductInventory(productId);
        return "redirect:/products"; // Redirect to the product list page or any other appropriate page
    }

    @PostMapping()
}
