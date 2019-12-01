package hotshots.account.admin.hotshotsaccount.account.dto.models.BookingDtoModels;

import hotshots.account.admin.hotshotsaccount.account.request.model.bookingModels.CourtBookingDetails;

import java.util.List;

public class BookingInformationDto {

    private String courtId;

    private String courtName;

    private List<CourtBookingDetails> courtBookingDetails;

    public String getCourtId() {
        return courtId;
    }

    public void setCourtId(String courtId) {
        this.courtId = courtId;
    }

    public String getCourtName() {
        return courtName;
    }

    public void setCourtName(String courtName) {
        this.courtName = courtName;
    }

    public List<CourtBookingDetails> getCourtBookingDetails() {
        return courtBookingDetails;
    }

    public void setCourtBookingDetails(List<CourtBookingDetails> courtBookingDetails) {
        this.courtBookingDetails = courtBookingDetails;
    }
}
