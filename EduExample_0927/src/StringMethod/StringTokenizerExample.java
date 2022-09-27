package StringMethod;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		String str1 = "오늘의 날씨는 맑은 가운데 다소 쌀쌀한 날씨가 이어지겠습니다 ";
		String str2 = "2022/09/27";
		String str3 = "이순신&선조/강감찬/이성계/정도전-이방원";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		StringTokenizer tokenizer1 = new StringTokenizer(str1);
		StringTokenizer tokenizer2 = new StringTokenizer(str2, "/");
		StringTokenizer tokenizer3 = new StringTokenizer(str3, "&|/|-");
		
		System.out.println("tokenizer1" + tokenizer1.countTokens());
		System.out.println("tokenizer2" + tokenizer2.countTokens());
		System.out.println("tokenizer3" + tokenizer3.countTokens());
		
		while(tokenizer1.hasMoreTokens()) {
			System.out.println(tokenizer1.nextToken());
		}
		
		while(tokenizer2.hasMoreTokens()) {
			System.out.println(tokenizer2.nextToken());
		}
		
		while(tokenizer3.hasMoreTokens()) {
			System.out.println(tokenizer3.nextToken());
		}
		
	}

}
