package ex;

public class dmbCellPhone_ex {

	public static void main(String[] args) {
//		자식 클래스 객체 생성
		dmbCellPhone cameo = new dmbCellPhone("아이폰14 Plus", "리퀴드 골드", 256);
		
//		부모 클래스 상속 필드
		System.out.println("모델: " + cameo.model);
		System.out.println("색상: " + cameo.color);
		
//		자식 클래스 필드
		System.out.println("채널: " + cameo.channel);
		
//		부모 클래스 메소드 호출	
		cameo.powerIn();
		cameo.bell();
		cameo.voice("여보세요");
		cameo.receiveVoice("안녕하세요! 저는 애플이에요");
		cameo.hangUp();
		
//		자식 클래스 메소드 호출	
		cameo.turnOnDmb();
		cameo.changeChannelDmb(14);
		cameo.turnOffDmb();
	}
}