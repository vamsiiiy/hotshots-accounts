package hotshots.account.admin.hotshotsaccount.account.request.model.bookingModels;

import java.util.List;

public class CourtBookingDetails {

    private String timeSlotCode;

    private String timeSlotCodeDescription;

    private List<SlotDetails> slotDetails;

    public String getTimeSlotCode() {
        return timeSlotCode;
    }

    public void setTimeSlotCode(String timeSlotCode) {
        this.timeSlotCode = timeSlotCode;
    }

    public String getTimeSlotCodeDescription() {
        return timeSlotCodeDescription;
    }

    public void setTimeSlotCodeDescription(String timeSlotCodeDescription) {
        this.timeSlotCodeDescription = timeSlotCodeDescription;
    }

    public List<SlotDetails> getSlotDetails() {
        return slotDetails;
    }

    public void setSlotDetails(List<SlotDetails> slotDetails) {
        this.slotDetails = slotDetails;
    }
}
