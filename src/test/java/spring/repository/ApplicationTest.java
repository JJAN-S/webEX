package spring.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import spring.webEX.WebExApplication;
import spring.webEX.domain.Question;
import spring.webEX.repository.QuestionRepository;
import spring.webEX.service.QuestionService;

import java.time.LocalDateTime;

@SpringBootTest(classes = WebExApplication.class)
public class ApplicationTest {

    @Autowired
    private QuestionRepository questionRepository;
    @Autowired
    private QuestionService questionService;

    @Test
    void testJpa(){
        Question q1 = new Question();
        q1.setSubject("sbb가 무엇인가요?");
        q1.setContent("sbb에 대해서 알고 싶습니다.");
        q1.setCreateDate(LocalDateTime.now());
        System.out.println("결과는?");
        this.questionRepository.save(q1);  // 첫번째 질문 저장

    }


}
