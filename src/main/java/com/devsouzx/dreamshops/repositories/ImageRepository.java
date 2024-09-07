package com.devsouzx.dreamshops.repositories;

import com.devsouzx.dreamshops.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
