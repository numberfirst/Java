package 试卷案例.handler;

import org.apache.commons.lang3.ArrayUtils;

import 试卷案例.answer.Answer;
import 试卷案例.answer.ChoiceAnswer;
import 试卷案例.check.Check;
import 试卷案例.constant.Constant;
import 试卷案例.question.MultiQuestion;
import 试卷案例.question.Question;
import 试卷案例.question.SingleQuestion;

public class ChoiceQuestionHandler implements Check{

	@Override
	public int check(Question question, Answer answer) {
		ChoiceAnswer choiceAnswer=(ChoiceAnswer)answer;
		boolean flag=false;
		if(question instanceof SingleQuestion) {
			SingleQuestion single=(SingleQuestion)question;
			flag=single.getAnswers()==choiceAnswer.getChoice()[0];
		}
		else if(question instanceof MultiQuestion) {
			MultiQuestion multi=(MultiQuestion)question;
			if(choiceAnswer.getChoice()!=null&&multi.getAnswer().length==choiceAnswer.getChoice().length) {
				for(int i=0;i<multi.getAnswer().length;i++) {
					flag=ArrayUtils.contains(choiceAnswer.getChoice(), multi.getAnswer()[i]);
					if(!flag)
						break;
					
				}
			}
		}
		if(flag)
			return Constant.CHOIC_SCORE;
		else
		return 0;
	}

}
