package j_combobox;

import java.awt.*;//<- 1.2 버전 이전
import java.awt.event.*;
import java.util.Calendar;

import javax.swing.*;//<- 1.2 버전 이후

public class ComboBoxTest extends JFrame{
	// [1] 멤버변수
	JComboBox<Integer> cbYear, cbMonth, cbDate;
	JButton	  btn;
	JLabel	  laDay;
	
	// [2] 객체생성
	public ComboBoxTest() {
		
		Integer[] years = new Integer[11];
		for(int j=0, y=1900; j<11; y++, j++) {
			years[j] = y;
		}
		
		Integer[] strM = new Integer[12];
		for(int i=0; i<12; i++) {
			strM[i] = i+1;
		}
		Integer[] days = new Integer[31];//임시로 요일값 넣기
		for(int a=0; a<31; a++) {
			days[a] = a+1;
		}
		
		cbYear	= new JComboBox<Integer>(years);
		cbMonth	= new JComboBox<Integer>(strM);
		cbDate	= new JComboBox<Integer>(days);
		btn		= new JButton("▶");
		laDay	= new JLabel(" 요일");
	}
	
	// [3] 화면구성(보이기)
	public void addLayout() {
		setLayout(new FlowLayout());
		
		// 붙이기
		add(cbYear);
		add(new JLabel("년"));
		add(cbMonth);
		add(new JLabel("월"));
		add(cbDate);
		add(new JLabel("일"));
		add(btn);
		add(laDay);
		
		setTitle("미니 달력");
		setBounds(100, 100, 500, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	// [4] 이벤트처리
	public void eventProc() {
		
		// 버튼이 눌렸을때
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				outputDay();
			}
		});
		
		// 년도 콤보박스가 선택했을 때 이벤트처리
		cbYear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setDay();
			}
		});
		
		// 월 콤보박스가 눌렸을 때 이벤트처리
		cbMonth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setDay();
			}
		});
	}// end of eventProc
	
	/*
	 * 선택한 년과 월에 따라서 일수를 변경
	 */
	void setDay() {
		
		Integer[] lastDays = {31, 28, 31, 30, 31
							,30, 31, 31, 30, 31, 30, 31};
		
		Integer y = (Integer)cbYear.getSelectedItem();
		if(( y % 4 == 0 & y %100 != 0) | y % 400 == 0 ) {
			lastDays[1] = 29;
		}else {
			lastDays[1] = 28;
		}
		
		
		Integer z = (Integer)cbMonth.getSelectedItem();
	
		cbDate.removeAllItems();
		for(int i=1; i<=lastDays[z-1];i++) {
			cbDate.addItem(i);
		}
	}
	/*
	 *  년, 월, 일 값을 얻어서 요일 구하고 출력
	 */
	void outputDay() {
		Integer y = (Integer)cbYear.getSelectedItem();	//년도값 입력받은것 가져오기
		Integer z = (Integer)cbMonth.getSelectedItem(); //월값 입력받은것 가져오기
		Integer x = (Integer)cbDate.getSelectedItem();	//일값 입력받은것 가져오기
		//System.out.println(y + "년도 "+ z + "월 "+ x + "일");
		
		Calendar cal= Calendar.getInstance();
		cal.set(y, z-1, x);
		//System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		
		// 요일 지정
		String [] dow = {"일", "월","화" ,"수" ,"목" ,"금" ,"토"};
		
		String msg = dow[cal.get(Calendar.DAY_OF_WEEK)-1] + "요일";
		laDay.setText(msg);
		
		
	}// end of outputDay
	
	/*
	 * 화면에 출력될 때 처음부터 오늘날짜 지정하기
	 */
	void initial() {
		
		Calendar cal= Calendar.getInstance();
		
		Integer y = (Integer)cbYear.getSelectedItem();
		Integer z = (Integer)cbMonth.getSelectedItem();
		Integer x = (Integer)cbDate.getSelectedItem();
		
		
	}
	
	public static void main(String[] args) {
		ComboBoxTest cb = new ComboBoxTest();
		cb.addLayout();
		cb.initial();
		cb.eventProc();
	}

}
