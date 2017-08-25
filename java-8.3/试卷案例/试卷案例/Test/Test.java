package 试卷案例.Test;

import 试卷案例.answer.Answer;
import 试卷案例.answer.BlankAnswer;
import 试卷案例.answer.ChoiceAnswer;
import 试卷案例.question.BlankQuestion;
import 试卷案例.question.MultiQuestion;
import 试卷案例.question.Question;
import 试卷案例.question.SingleQuestion;
import 试卷案例.question.support.Options;
import 试卷案例.service.CheckService;
import 试卷案例.service.InvokeService;

public class Test {

	public static void main(String[] args) {
		Options o1=new Options('A',"应用服务器");
		Options o2=new Options('B',"虚拟机");
		Options o3=new Options('C',"垃圾回收器");
		Options o4=new Options('D',"编译器");
		Options[] o= {o1,o2,o3,o4};
		Question q1=new SingleQuestion("在Java中，负责对字节代码解释执行的是",o,'B');
		
		
		Options a1=new Options('A',"参数列表必须不同");
		Options a2=new Options('B',"参数列表中个数不同，或个数相同但参数类型的不同");
		Options a3=new Options('C',"方法返回值可以不同");
		Options a4=new Options('D',"访问控制修饰符必须相同");
		Options[] a= {o1,o2,o3,o4};
		char[] b= {'A','B','C'};
		Question q2=new MultiQuestion("符合方法重载的规则是哪些？",a,b);
		
		String[] s= {"封装","多态","继承"};
		Question q3=new BlankQuestion("面向对象程序设计的三个特征是___,___,___。",s);
		
		Question[] q= {q1,q2,q3};
		
		
		new InvokeService().init(q);
		
		
		char[] x1= {'A'};
		Answer answer1=new ChoiceAnswer(x1);
		char[] x2= {'A','B','C'};
		Answer answer2=new ChoiceAnswer(x2);
		String[] x3= {"继承"};
		Answer answer3=new BlankAnswer(x3);
		Answer[] x= {answer1,answer2,answer3};
		
		new CheckService(q,x).mark();
		

	}

}
