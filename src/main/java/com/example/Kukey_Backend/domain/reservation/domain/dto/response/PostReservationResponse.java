package com.example.Kukey_Backend.domain.reservation.domain.dto.response;

import lombok.Builder;

@Builder
public record PostReservationResponse(

       long reservationId
) {
}
