package org.example;

import java.util.List;
import java.util.UUID;

public class PaymentService {

    public PaymentService(){

    }

    public Payment makePayment(Booking booking, int amountPayed)
    {
        if(booking.getBookingStatus()!=BookingStatus.PENDING_PAYEMENT)
        {
            throw new RuntimeException("Payment can't be made because booking status is not pending payment");
        }
        List<Seat> seatList = booking.getSeatList();

        if(amountPayed<booking.getAmountToBePayed())
        {
            booking.setBookingStatus(BookingStatus.CANCELLED);

            for(Seat seat: seatList)
            {
                seat.setSeatStatus(SeatStatus.FREE);
            }
            throw new RuntimeException("amount payed is less than the amount to be payed hence making all seats available again");
        }

        booking.setBookingStatus(BookingStatus.CONFIRMED);
        for(Seat seat: seatList)
        {
            seat.setSeatStatus(SeatStatus.BOOKED);
        }
        return new Payment(UUID.randomUUID().toString(), booking.getBookingId(), amountPayed);
    }
}
