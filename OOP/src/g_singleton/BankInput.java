package g_singleton;

public class BankInput {
	//메인변수값 선언
	private String name;
	private String bknum;
	private int mny;

	BankInput(String name, String bknum, int mny) {
		this.name = name;
		this.bknum = bknum;
		this.mny = mny;
	}
	//입금
	public void inmoney(int number1) {
		mny += number1;
	}
	//출금
	public void outmoney(int number2) {
		if( mny < number2) System.out.println("잔액이 부족합니다");
		else mny -= number2;
	}
	//결과
	void Print() {
			System.out.println("예금주명:"+ name + ", 계좌번호:" + bknum + ", 잔액:"+mny);
		}
}