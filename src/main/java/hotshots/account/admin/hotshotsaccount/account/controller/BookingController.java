package hotshots.account.admin.hotshotsaccount.account.controller;

import hotshots.account.admin.hotshotsaccount.account.dto.models.BookingDtoModels.BookingDto;
import hotshots.account.admin.hotshotsaccount.account.request.model.bookingModels.Booking;
import hotshots.account.admin.hotshotsaccount.account.response.model.bookingModels.BookingResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("booking")
public class BookingController {

    @Autowired
    private ModelMapper modelMapper;

    @RequestMapping(method = RequestMethod.POST)
    public BookingResponse updateBookingDetails(@RequestBody Booking booking){

        BookingResponse bookingResponse = new BookingResponse();
        if(booking != null){

            BookingDto bookingDto = modelMapper.map(booking, BookingDto.class);

            if(bookingDto != null){
                ModelMapper mapper = new ModelMapper();
                bookingResponse = mapper.map(bookingDto, BookingResponse.class);
            }
        }
        return bookingResponse;
    }
}
