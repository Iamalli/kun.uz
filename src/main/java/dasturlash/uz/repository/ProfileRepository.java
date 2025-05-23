package dasturlash.uz.repository;

import dasturlash.uz.aggregation.model.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends CrudRepository<Profile, Long> {
}
