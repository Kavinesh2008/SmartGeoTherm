package com.example.geotherm.service;

import com.example.geotherm.model.ProductModel;
import java.util.*;

public interface ProductService {
    public ProductModel create(ProductModel data);
    public List<ProductModel> getData();
    public ProductModel update(Long id,ProductModel data);
    public void delete(Long id);
}
