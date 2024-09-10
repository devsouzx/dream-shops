package com.devsouzx.dreamshops.dtos;

import com.devsouzx.dreamshops.model.Category;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class ProductDTO {
    private Long id;
    private String name;
    private String brand;
    private BigDecimal price;
    private Integer inventory;
    private String description;
    private Category category;
    private List<ImageDTO> images;
}
