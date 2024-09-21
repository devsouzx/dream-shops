package com.devsouzx.dreamshops.services.product;

import com.devsouzx.dreamshops.dtos.ProductDTO;
import com.devsouzx.dreamshops.model.Product;
import com.devsouzx.dreamshops.requests.AddProductRequest;
import com.devsouzx.dreamshops.requests.ProductUpdateRequest;

import java.util.List;

public interface IProductService {
    Product addProduct(AddProductRequest product);
    Product getProductById(Long id);
    void deleteProductById(Long id);
    Product updateProduct(ProductUpdateRequest product, Long productId);
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByCategoryAndBrand(String category, String brand);
    List<Product> getProductsByName(String name);
    List<Product> getProductsByBrandAndName(String category, String name);
    Long countProductsByBrandAndName(String brand, String name);
    List<ProductDTO> getConvertedProducts(List<Product> products);
    ProductDTO convertToDTO(Product product);
    List<Product> findDistinctProductsByName();
    List<String> getAllDistinctBrands();
}
