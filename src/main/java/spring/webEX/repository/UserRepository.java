package spring.webEX.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.webEX.domain.SiteUser;

import java.util.Optional;

public interface UserRepository extends JpaRepository<SiteUser,Long> {
    Optional<SiteUser> findByusername(String username);

}
