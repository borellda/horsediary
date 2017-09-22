package horsediary.repository;

import horsediary.model.Horse;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface HorseRepository extends CrudRepository<Horse, UUID> {
}
