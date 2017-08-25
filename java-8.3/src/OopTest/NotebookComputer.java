package OopTest;

public class NotebookComputer {
	public char color;
	public int cpu;
	public NotebookComputer() {
		
	}
	public NotebookComputer(char color,int cpu) {
		this.color=color;
		this.cpu=cpu;
	}
	public void showAll() {
		System.out.println(color+" "+cpu);
	}

}
