package rs.codecraft.lab.adapters.database.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rs.codecraft.lab.adapters.database.entity.UserDao;

@Repository
public interface UserJpaRepository extends JpaRepository<UserDao, Integer> {

}
