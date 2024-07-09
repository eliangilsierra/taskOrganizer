package eliangilsierra.taskorganizer_backend.repository;

import eliangilsierra.taskorganizer_backend.entity.ItemList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRemindersRepository extends JpaRepository<ItemList,Integer> {

}
