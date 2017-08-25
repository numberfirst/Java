package Question;



public class Test {

	public static void main(String[] args) {
		Options optionsOne=new Options('A',"第一项");
		Options optionsTwo=new Options('B',"第二项");
		Options optionsThree=new Options('C',"第三项");
		Options optionsFour=new Options('D',"第四项");
		Options[] options= {optionsOne,optionsTwo,optionsThree,optionsFour};
		SingleChoice q=new SingleChoice("单选题",'A',options);
		Answers usersAnswers=new Answers(new char[] {'B'});
		System.out.println(q.check(usersAnswers.getUsersAnswers()));
		
		
		Options optionsA=new Options('A',"第一项");
		Options optionsB=new Options('B',"第二项");
		Options optionsC=new Options('C',"第三项");
		Options optionsD=new Options('D',"第四项");
		Options optionsE=new Options('E',"第五项");
		Options[] options1= {optionsA,optionsB,optionsC,optionsD,optionsE};
		MultiChoice q1=new MultiChoice("单选题",new char[] {'B','D'},options1);
		Answers usersAnswers1=new Answers(new char[] {'B','D'});
		System.out.println(q1.check(usersAnswers1.getUsersAnswers()));
	}

}
