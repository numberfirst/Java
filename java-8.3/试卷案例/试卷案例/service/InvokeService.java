package 试卷案例.service;

import 试卷案例.constant.Constant;
import 试卷案例.question.BlankQuestion;
import 试卷案例.question.ChoiceQuestion;
import 试卷案例.question.Question;
import 试卷案例.question.support.Options;

public class InvokeService {
	private Question[] questions;
	private int choiceAmount;
	private int blankAmount;
	private int blankItemAmount;
	
	
	
	
	public void setQuestion(Question[] question) {
		this.questions = question;
	}




	public void init(Question[] questions) {
		setQuestion(questions);
		if(questions!=null&&questions.length>0) {
			calcuTotalScore();
			showQuestion();
		}		
	}
	
	
	public void calcuTotalScore() {
		for(int i=0;i<questions.length;i++) {
			if(questions[i] instanceof ChoiceQuestion) {
				choiceAmount++;
			}
			else if(questions[i] instanceof BlankQuestion){
				blankAmount++;
				BlankQuestion blankquestion=(BlankQuestion)questions[i];
				blankItemAmount+=blankquestion.getAnswer().length;				
			}
		}
		System.out.println("选择题共有"+choiceAmount+"道,"+"每道"+Constant.CHOIC_SCORE+"分,"+"一共"+choiceAmount*Constant.CHOIC_SCORE+"分！");
		System.out.println("填空题共有"+blankAmount+"道,"+"每空"+Constant.BLANK_SCORE+"分,"+"一共"+blankItemAmount*Constant.BLANK_SCORE+"分！");
		System.out.println("******************************************************");		
	}
	
	
	public void showQuestion() {
		for(int i=0;i<questions.length;i++) {
			System.out.println("题目"+(i+1)+":"+questions[i].getTitle());
			if(questions[i] instanceof ChoiceQuestion) {
				ChoiceQuestion choicequestion=(ChoiceQuestion)questions[i];
				for(Options option:choicequestion.getOptions()) {
					System.out.println(option.getKey()+"."+option.getText());
				}
			}
			System.out.println("********************************************");
		}
	}

}
