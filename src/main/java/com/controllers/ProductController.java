package com.controllers;

import com.entites.Product;
import com.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/product")
public class ProductController {
    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping(path = "/showProductById", method = RequestMethod.GET)
    public String showProductById(Model uiModel, @RequestParam int id) {
        Product product = productService.getProductById(id);
        uiModel.addAttribute("product", product);
        return "show-product-byid";
    }

    @RequestMapping(path = "/showAllProduct", method = RequestMethod.GET)
    public String showAllProduct(Model uiModel) {
        uiModel.addAttribute("productList", productService.showProductList());
        return "show-all-product";
    }

    @RequestMapping("/addProduct")
    public String addProduct(Model uiModel) {
        Product product = new Product();
        uiModel.addAttribute("product", product);
        return "add-product";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("product") Product product) {
        productService.addNewProduct(product);
        return "add-product";
    }
}
