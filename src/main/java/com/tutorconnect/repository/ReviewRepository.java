package com.tutorconnect.repository;

import com.tutorconnect.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findByTutorIdOrderByCreatedAtDesc(Long tutorId);
    List<Review> findByStudentIdOrderByCreatedAtDesc(Long studentId);
    Optional<Review> findByBookingId(Long bookingId);
}