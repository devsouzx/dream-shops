package com.devsouzx.dreamshops.services.image;

import com.devsouzx.dreamshops.dtos.ImageDTO;
import com.devsouzx.dreamshops.model.Image;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IImageService {
    Image getImageById(Long id);
    void deleteImageById(Long id);
    List<ImageDTO> saveImages(Long productId, List<MultipartFile> files);
    void updateImage(MultipartFile file, Long imageId);
}
