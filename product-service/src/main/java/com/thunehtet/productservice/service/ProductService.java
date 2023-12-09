package com.thunehtet.productservice.service;

import com.thunehtet.productservice.dto.ProductRequest;
import com.thunehtet.productservice.model.Product;
import com.thunehtet.productservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {

    private final ProductRepository prodRep;

    public void createProduct(ProductRequest productRequest){
        Product product =Product.builder().name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();

        prodRep.save(product);
        log.info("Product {} is saved",product.getId());
    }
}
