package domain;

import java.util.List;

public class Question {
	int id;
	String questionDescription;
	List<Answer> answers;
	String answerType;
	String answerDescription;
	List<Integer> solutions;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestionDescription() {
		return questionDescription;
	}
	public void setQuestionDescription(String questionDescription) {
		this.questionDescription = questionDescription;
	}
	public List<Answer> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	public String getAnswerType() {
		return answerType;
	}
	public void setAnswerType(String answerType) {
		this.answerType = answerType;
	}
	public String getAnswerDescription() {
		return answerDescription;
	}
	public void setAnswerDescription(String answerDescription) {
		this.answerDescription = answerDescription;
	}
	public List<Integer> getSolutions() {
		return solutions;
	}
	public void setSolutions(List<Integer> solutions) {
		this.solutions = solutions;
	}
}