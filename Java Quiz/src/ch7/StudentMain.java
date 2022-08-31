package ch7;

public class StudentMain {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		s1.name = "±èÅÂÈñ";
		s1.kor = 90;
		s1.eng = 95;
		s1.math = 100;
		s1.sum = s1.kor + s1.eng + s1.math;
		s1.avg = (float)s1.sum / 3;
		
		System.out.println("°´Ã¼ s1ÀÇ Á¤º¸");
		System.out.println("ÀÌ¸§ : "+ s1.name);
		System.out.println("±¹¾î : "+ s1.kor);
		System.out.println("¿µ¾î : "+ s1.eng);
		System.out.println("¼öÇÐ : "+ s1.math);
		System.out.println("ÃÑÁ¡ : "+ s1.sum);
		System.out.println("Æò±Õ : "+ s1.avg);
		System.out.println();
		
		s2.name = "¿øºó";
		s2.kor = 80;
		s2.eng = 90;
		s2.math = 70;
		s2.sum = s2.kor + s2.eng + s2.math;
		s2.avg = (float)s2.sum / 3;
		
		System.out.println("°´Ã¼ s2ÀÇ Á¤º¸");
		System.out.println("ÀÌ¸§ : "+ s2.name);
		System.out.println("±¹¾î : "+ s2.kor);
		System.out.println("¿µ¾î : "+ s2.eng);
		System.out.println("¼öÇÐ : "+ s2.math);
		System.out.println("ÃÑÁ¡ : "+ s2.sum);
		System.out.println("Æò±Õ : "+ s2.avg);
		System.out.println();
		
		s3.name = "Ã¤¼öºó";
		s3.kor = 100;
		s3.eng = 100;
		s3.math = 99;
		s3.sum = s3.kor + s3.eng + s3.math;
		s3.avg = (float)s3.sum / 3;
		
		System.out.println("°´Ã¼ s3ÀÇ Á¤º¸");
		System.out.println("ÀÌ¸§ : "+ s3.name);
		System.out.println("±¹¾î : "+ s3.kor);
		System.out.println("¿µ¾î : "+ s3.eng);
		System.out.println("¼öÇÐ : "+ s3.math);
		System.out.println("ÃÑÁ¡ : "+ s3.sum);
		System.out.println("Æò±Õ : "+ s3.avg);
		System.out.println();
		
	}

}
