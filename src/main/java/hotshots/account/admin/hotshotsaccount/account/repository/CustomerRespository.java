package hotshots.account.admin.hotshotsaccount.account.repository;

import hotshots.account.admin.hotshotsaccount.account.request.model.bookingModels.CustomerDetails;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRespository extends CrudRepository<CustomerDetails, Long> {
}
