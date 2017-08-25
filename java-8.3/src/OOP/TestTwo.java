package OOP;
import OOP.Immortal;
public class TestTwo {

	public static void main(String[] args) {
		Immortal master=new Immortal();
		master.name="唐僧";
		master.weapon="禅杖";
		master.power=1;
		master.endurance=5;
		master.goal();
		master.action("白骨精");
		master.idea("我要去女儿国！");
		Immortal pig=new Immortal();
		pig.name="猪八戒";
		pig.action("蜘蛛精");

	}

}
