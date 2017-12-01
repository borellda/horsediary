package horsediary.repository;

import horsediary.model.Horse;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
@EnableScan
public interface HorseRepository extends CrudRepository<Horse, String> {

    List<Horse> findById(String id);

}
