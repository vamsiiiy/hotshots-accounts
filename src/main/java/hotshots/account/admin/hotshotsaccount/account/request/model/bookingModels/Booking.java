package hotshots.account.admin.hotshotsaccount.account.request.model.bookingModels;

import java.util.List;

public class Booking {

    private String bookingDate;

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

    private List<BookingInformation> bookingInformation;


}
