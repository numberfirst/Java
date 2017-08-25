package OOP;

public class Immortal{
		public String name;
		public String weapon;
		public int power;
		public int endurance;
		public void goal() {
			System.out.println("取得西经！");
		}
		public void action(String demonName) {
			System.out.println(demonName+"来了,"+name+"去打妖精了"+",用它的武器："+weapon);
		}
		public void idea(String idea) {
			System.out.println("我是"+name+","+"我有个想法："+idea);
		}
	

}
