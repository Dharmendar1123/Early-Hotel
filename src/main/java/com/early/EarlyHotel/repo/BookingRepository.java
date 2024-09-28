package com.early.EarlyHotel.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.early.EarlyHotel.entity.Booking;

import java.util.Optional;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    Optional<Booking> findByBookingConfirmationCode(String confirmationCode);
}
