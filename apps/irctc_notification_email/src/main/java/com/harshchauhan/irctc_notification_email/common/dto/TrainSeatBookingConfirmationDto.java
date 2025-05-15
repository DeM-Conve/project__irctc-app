package com.harshchauhan.irctc_notification_email.common.dto;

public record TrainSeatBookingConfirmationDto(String trainId, Integer seatNumber, String userEmail) {
}
