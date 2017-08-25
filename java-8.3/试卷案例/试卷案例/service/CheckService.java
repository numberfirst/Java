package 试卷案例.service;

import 试卷案例.answer.Answer;
import 试卷案例.constant.Constant;
import 试卷案例.handler.BlankQuestionHandler;
import 试卷案例.handler.ChoiceQuestionHandler;
import 试卷案例.question.BlankQuestion;
import 试卷案例.question.ChoiceQuestion;
import 试卷案例.question.Question;

public class CheckService {
	private Question[] questions;
	private Answer[] answers;
	private ChoiceQuestionHandler choiceHandler=new ChoiceQuestionHandler();
	private BlankQuestionHandler blankHandler=new BlankQuestionHandler();
	
	
	private int score;
	
	
	public CheckService(Question[] questions, Answer[] answers) {
		super();
		this.questions = questions;
		this.answers = answers;
	}
	


	public int mark() {
		int each=0;
		for(int i=0;i<questions.length;i++) {
			if(questions[i] instanceof ChoiceQuestion) {
				each=choiceHandler.check(questions[i], answers[i]);
			}else if(questions[i] instanceof BlankQuestion) {
				each=blankHandler.check(questions[i], answers[i]);
				if(each>0&&each<((BlankQuestion)questions[i]).getAnswer().length*Constant.BLANK_SCORE) {
					score+=each;
					System.out.println((i+1)+"题回答不完全,得"+each+"分");
					continue;
				}				
			}
			if(each!=0) {
				score+=each;
				System.out.println((i+1)+"题回答正确,得"+each+"分");
			}else {
				System.out.println((i+1)+"题回答不正确,得0分");
			}
		}
		return score;
		
		
	}
	
	

}
