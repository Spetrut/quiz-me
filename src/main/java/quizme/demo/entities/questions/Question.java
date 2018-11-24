package quizme.demo.entities.questions;

import lombok.Data;
import quizme.demo.enums.QuestionCategory;
import quizme.demo.enums.QuestionDifficultyLevel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import java.time.LocalDateTime;

@Data
@Entity
@Inheritance
public abstract class Question {


    @Id
    @GeneratedValue
    private Integer id;

    private String questionSentence;
    private LocalDateTime timeConstraint;
    private QuestionCategory questionCategory;
    private QuestionDifficultyLevel questionDifficultyLevel;
}
