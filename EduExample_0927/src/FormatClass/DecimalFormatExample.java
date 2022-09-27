package FormatClass;

import java.text.DecimalFormat;

// CH 11.15.1 숫자 형식 클래스(DecimalFormat)
public class DecimalFormatExample {

	public static void main(String[] args) {
		double num = 124576854.158;

		// 124576854
		DecimalFormat df = new DecimalFormat("0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("000000000000.00000");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("############.#####");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("+#.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("-#.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#,###.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0.0E0");
		System.out.println(df.format(num));
				
		df = new DecimalFormat("+#");
		System.out.println(df.format(num));
				
		df = new DecimalFormat("0.0E0");
		System.out.println(df.format(num));
				
		df = new DecimalFormat("+#,### ; -#,###");
		System.out.println(df.format(num));
				
		df = new DecimalFormat("#.# %");
		System.out.println(df.format(num));
				
		df = new DecimalFormat("\u00A4 #,###");
		System.out.println(df.format(num));
		
	}
}
