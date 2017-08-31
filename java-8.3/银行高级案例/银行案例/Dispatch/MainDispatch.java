package 银行案例.Dispatch;

import 银行案例.Handler.PrintAccrualInfo;
import 银行案例.Handler.PrintLoanInfo;
import 银行案例.Handler.PrintMyInfo;
import 银行案例.Handler.PrintTransInfo;
import 银行案例.Menu.InfoMenu;
import 银行案例.Menu.Menu;
import 银行案例.Service.AccountServive;
import 银行案例.Service.DepositService;
import 银行案例.Service.LoanService;
import 银行案例.Service.RepayService;
import 银行案例.Service.ReviseService;
import 银行案例.Service.TransferService;
import 银行案例.Service.WithdrawalServive;
import 银行案例.Utils.Biz;

public class MainDispatch {
	private static AccountServive accountService=new AccountServive();
	public static void dispatch(String forward) throws Exception  {
		switch (forward) {
		case Biz.LOGIN:
			accountService.doLogin();
			break;			
		case Biz.MENU:
			Menu.welcome();
			break;
		case Biz.DEPOSITE:
			DepositService.deposit();
			break;
		case Biz.WITTHDRAWAL:
			WithdrawalServive.withdrawal();
			break;
		case Biz.TRANSFER:
			TransferService.transferAccounts();
			break;
		case Biz.LOAN:
			LoanService.loan();
			break;
        case Biz.ENQUIRY:
			InfoMenu.infoMenu();
			break;
        case Biz.REVISE:
			ReviseService.reviseInfo();
			break;
        case Biz.ENQUIRYMYINFO:
			PrintMyInfo.printInfo();
			break;
        case Biz.ENQUIRYLOANINFO:
			PrintLoanInfo.printLoanInfo();
			break;
        case Biz.ENQUIRYTRANSINFO:
			PrintTransInfo.printTransInfo();
			break;
        case Biz.ENQUIRYACCRUAL:
			PrintAccrualInfo.printAccrualInfo();
			break;
        case Biz.REPAY:
			RepayService.repay();
			break;
		default:
			break;
		}
	}

}
