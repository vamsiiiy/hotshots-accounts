package hotshots.account.admin.hotshotsaccount.account.repository;

import hotshots.account.admin.hotshotsaccount.account.entity.PaymentMethod;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<PaymentMethod, Long> {
}
