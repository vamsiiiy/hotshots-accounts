package hotshots.account.admin.hotshotsaccount.account.repository;

import hotshots.account.admin.hotshotsaccount.account.entity.ItemsUsed;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<ItemsUsed, Long> {
}
