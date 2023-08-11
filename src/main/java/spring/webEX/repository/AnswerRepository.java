package spring.webEX.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.webEX.domain.Answer;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Integer> {


}
