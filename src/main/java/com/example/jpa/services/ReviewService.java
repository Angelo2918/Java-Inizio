package com.example.jpa.services;

import com.example.jpa.dtos.CreateReviewDto;
import com.example.jpa.models.Review;

public interface ReviewService {
    Review addReview(CreateReviewDto dto);
}