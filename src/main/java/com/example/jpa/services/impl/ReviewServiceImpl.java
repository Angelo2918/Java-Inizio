package com.example.jpa.services.impl;

import com.example.jpa.dtos.CreateReviewDto;
import com.example.jpa.models.Instrument;
import com.example.jpa.models.Review;
import com.example.jpa.models.User;
import com.example.jpa.repositories.InstrumentRepository;
import com.example.jpa.repositories.ReviewRepository;
import com.example.jpa.repositories.UserJpaRepository;
import com.example.jpa.services.ReviewService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
@Service
public class ReviewServiceImpl implements ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;
    @Autowired
    private InstrumentRepository instrumentRepository;
    @Autowired
    private UserJpaRepository userRepository;


    public Review addReview(CreateReviewDto dto) {
        Review review = new Review();
        review.setComment(dto.getComment());
        review.setRating(dto.getRating());
        review.setReviewDate(LocalDateTime.now());

        User user = userRepository.findById(dto.getUserId()).orElseThrow(() -> new EntityNotFoundException("User was not found!"));
        review.setUser(user);

        Instrument instrument = instrumentRepository.findById(dto.getUserId()).orElseThrow(() -> new EntityNotFoundException("Instrument not found!"));
        review.setInstrument(instrument);

        return reviewRepository.save(review);
    }

}