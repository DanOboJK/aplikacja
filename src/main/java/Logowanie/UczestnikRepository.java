package Logowanie;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.scheduling.config.Task;

import java.util.List;

public interface UczestnikRepository extends CrudRepository<Uczestnik, Long> {
    public List<Uczestnik> findByDone(Boolean done);

    @Query("select t from Uczestnik t where t.imie like 'Daniel'")
    public List<Uczestnik> getByImieLike(String search);
}
