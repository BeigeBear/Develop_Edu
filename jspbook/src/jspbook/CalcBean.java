package jspbook;

public class CalcBean {
	
	// 멤버 변수
	private int num1, num2;
	private String operator = "";
	private int result;
	
	// 계산 기능 메서드
	public void claculate() {
		if(operator.equals("+")) {
			result = num1 + num2;
		}
		else if(operator.equals("-")) {
			result = num1 - num2;
		}
		else if(operator.equals("*")) {
			result = num1 * num2;
		}
		else if (operator.equals("/")) {
			result = num1 / num2;
		}
	}
	
	//set xxx 메서드
	public void setNum1(String num1) {
		this.num1 = Integer.parseInt(num1);
	}
	public void setNum2(String num2) {
		this.num2 = Integer.parseInt(num2);
	}
	public void setOperator(String operator) {
		System.out.println("##"+operator);
		this.operator = operator;
	}
	
	// get xxx 메서드
	public int getResult() {
		return result;
	}
}
