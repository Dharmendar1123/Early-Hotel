package com.early.EarlyHotel.service.interfac;

import com.early.EarlyHotel.dto.Response;
import com.early.EarlyHotel.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}
