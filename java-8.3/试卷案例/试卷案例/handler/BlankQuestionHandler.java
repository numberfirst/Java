package 试卷案例.handler;

import org.apache.commons.lang3.ArrayUtils;

import 试卷案例.answer.Answer;
import 试卷案例.answer.BlankAnswer;
import 试卷案例.check.Check;
import 试卷案例.constant.Constant;
import 试卷案例.question.BlankQuestion;
import 试卷案例.question.Question;

public class BlankQuestionHandler implements Check{

	@Override
	public int check(Question question, Answer answer) {
		BlankQuestion blankQuestion=(BlankQuestion)question;
		BlankAnswer blankAnswer=(BlankAnswer)answer;
		int score=0;
		if(blankAnswer.getContents()!=null&&blankAnswer.getContents().length>0) {
			for(int i=0;i<blankAnswer.getContents().length;i++) {
				if(ArrayUtils.contains(blankQuestion.getAnswer(), blankAnswer.getContents()[i])) {
					score+=Constant.BLANK_SCORE;
				}
			}
		}
		
		return score;
	}

}
