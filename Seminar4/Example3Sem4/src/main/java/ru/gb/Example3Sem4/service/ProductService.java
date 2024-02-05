package ru.gb.Example3Sem4.service;

import org.springframework.stereotype.Service;
import ru.gb.Example3Sem4.model.Product;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product p){products.add(p);}

    public List<Product> findAll(){return  products;}
}
