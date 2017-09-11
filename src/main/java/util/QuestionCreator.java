package util;

import java.util.ArrayList;
import java.util.List;

import domain.Answer;
import domain.Question;

public class QuestionCreator {
	public static List<Question> getQuestions(){
		List<Question> questions = new ArrayList<>();
		
		Question question1 = new Question();
		Answer answer1 = new Answer();
		answer1.setAnswerText("Answer 1");
		answer1.setId(1);
		Answer answer2 = new Answer();
		answer2.setAnswerText("Answer 2");
		answer2.setId(2);
		List<Answer> answers = new ArrayList();
		answers.add(answer1);
		answers.add(answer2);
		question1.setAnswers(answers);
		question1.setAnswerType("multiple");
		question1.setQuestionDescription("Question 1");
		question1.setAnswerDescription("Answer description 1");
		question1.setId(0);
		questions.add(question1);
		
		Question question2 = new Question();
		Answer answer3 = new Answer();
		answer3.setAnswerText("Answer 3");
		answer3.setId(3);
		Answer answer4 = new Answer();
		answer4.setAnswerText("Answer 4");
		answer4.setId(4);
		answers = new ArrayList();
		answers.add(answer3);
		answers.add(answer4);
		question2.setAnswers(answers);
		question2.setAnswerType("radio");
		question2.setQuestionDescription("Question 2");
		question2.setAnswerDescription("Answer description 2");
		question2.setId(1);
		questions.add(question2);
				
		Question question3 = new Question();
		Answer answer5= new Answer();
		answer5.setAnswerText("Answer 5");
		answer5.setId(3);
		Answer answer6 = new Answer();
		answer6.setAnswerText("Answer 6");
		answer6.setId(4);
		answers = new ArrayList();
		answers.add(answer5);
		answers.add(answer6);
		question3.setAnswers(answers);
		question3.setAnswerType("radio");
		question3.setQuestionDescription("Question 3");
		question3.setAnswerDescription("Answer description 3");
		question3.setId(2);
		questions.add(question3);

		return questions;
	}
}
