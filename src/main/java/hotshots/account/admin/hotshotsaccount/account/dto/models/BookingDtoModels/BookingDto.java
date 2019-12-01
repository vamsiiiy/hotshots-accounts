package hotshots.account.admin.hotshotsaccount.account.dto.models.BookingDtoModels;

import hotshots.account.admin.hotshotsaccount.account.request.model.bookingModels.BookingInformation;

import java.util.List;

public class BookingDto {

    private String bookingDate;

    private List<BookingInformation> bookingInformation;

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public List<BookingInformation> getBookingInformation() {
        return bookingInformation;
    }

    public void setBookingInformation(List<BookingInformation> bookingInformation) {
        this.bookingInformation = bookingInformation;
    }
}
