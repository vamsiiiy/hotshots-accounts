package hotshots.account.admin.hotshotsaccount.account.entity;

import javax.persistence.*;
import java.util.List;

@Table(name = "CourtBookingDetails")
public class CourtBookingDetailsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String timeSlotCode;

    @Column
    private String timeSlotCodeDescription;

    @Column
    @OneToMany(mappedBy = "courtBookingDetailsEntity")
    private List<SlotDetailsEntity> slotDetails;


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

    public List<SlotDetailsEntity> getSlotDetails() {
        return slotDetails;
    }

    public void setSlotDetails(List<SlotDetailsEntity> slotDetails) {
        this.slotDetails = slotDetails;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
