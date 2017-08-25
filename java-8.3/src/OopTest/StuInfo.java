package OopTest;

public class StuInfo {
	public String name;
	public int no;
	public int score;
	public StuInfo() {
		
	}
	public StuInfo(String name,int no,int score) {
		this.name=name;
		this.no=no;
		this.score=score;
	}
	public void sortByScore(StuInfo[] stu) {		
		for(int j=0;j<stu.length-1;j++) {			
		    for(int i=0;i<stu.length-1-j;i++) {		    	
			    if(stu[i].score<stu[i+1].score) {
				    StuInfo t=stu[i];
				    stu[i]=stu[i+1];
				    stu[i+1]=t;				
			    }
		    }
		}
		for(int i=0;i<stu.length;i++) {
			System.out.println(stu[i].name+" "+stu[i].no+" "+stu[i].score);
		}
		
	}
	

}
