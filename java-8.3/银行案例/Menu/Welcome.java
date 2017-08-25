package Menu;

import java.util.Scanner;

import Bank.CustomInfo;
import Hander.AddBalance;
import Hander.ExitProgram;
import Hander.Loan;
import Hander.PrintInfo;
import Hander.Repayment;
import Hander.SubBalance;
import Hander.TransferAccounts;
import MeInfo.MeCardInfo;
import MeInfo.MeLoanInfo;

public class Welcome {
	private MeCardInfo meCardInfo;
	private CustomInfo customInfos;
	private MeLoanInfo meLoanInfo=new MeLoanInfo();
	public Welcome(MeCardInfo meCardInfo) {
		this.meCardInfo = meCardInfo;
	}
	public Welcome(MeCardInfo meCardInfo, CustomInfo customInfos) {
		this.meCardInfo = meCardInfo;
		this.customInfos = customInfos;
	}
	public Welcome(MeCardInfo meCardInfo,MeLoanInfo meLoanInfo) {
		this.meLoanInfo = meLoanInfo;
		this.meCardInfo = meCardInfo;
	}
	public void welcome() {
		System.out.println("*************************");
		System.out.println("1.取款\n"+"2.存款\n"+"3.查询个人信息\n"+"4.转账\n"+"5.贷款\n"+"6.查看贷款信息\n"+"7.还款\n"+"8.退出");
		System.out.println("*************************");
		systemOperation();
	}

	public void systemOperation() {
		System.out.print("请输入您要进行的操作：");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		switch(num) {
		case 1:
			new SubBalance().subBalance(meCardInfo);
			break;
		case 2:			
			new AddBalance().addBalance(meCardInfo);
			break;
		case 3:
			new PrintInfo().printInfo(meCardInfo);
			break;
		case 4:
			new TransferAccounts().transferAccounts(meCardInfo,customInfos);
			break;
		case 5:
			new Loan().loanNum(meCardInfo);
			break;
		case 6:
			new PrintInfo().printLoanInfo(meLoanInfo,meCardInfo);
			break;
		case 7:
			new Repayment().repayment(meCardInfo, meLoanInfo);
			break;
		case 8:
			new ExitProgram().exitProgram();
			break;
		default:
			System.out.println("您输入的不正确！");
			break;
		}
	}
		

}
