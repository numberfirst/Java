package MeInfo;

public class MeCardInfo {
	private long cardId;
	private int password;
	private String name;
	private String id;
	private double balance;
	private String phone;
	private int age;	
	
	public MeCardInfo() {
		super();
	}
	public MeCardInfo(long cardId, String name,String id, String phone,int age) {
		this.cardId = cardId;
		this.name = name;
		this.id = id;
		this.phone = phone;
		this.age=age;
	}
	public MeCardInfo(long cardId,  int password, String name, String id, double balance,String phone,int age) {
		this.cardId = cardId;
		this.password = password;
		this.name = name;
		this.id = id;
		this.balance = balance;
		this.phone=phone;
		this.age=age;
	}
	public long getCardId() {
		return cardId;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public double getBalance() {
		return balance;
	}
	public void setPassWord(int i) {
		this.password = i;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String l) {
		this.phone = l;
	}	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void addBalance(double money) {
		this.balance+=money;
	}
	public void subBalance(double money) {
		if(money<=this.balance)
			this.balance-=money;
		else
			System.out.println("您的余额不足！");		
	}
	public boolean equals(int password,long cardId) {
		if (this.password!=password||this.cardId!=cardId)
			return false;
		return true;
	}
	
	

}
