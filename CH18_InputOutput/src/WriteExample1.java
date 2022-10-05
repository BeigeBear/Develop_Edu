import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample1 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
//		byte[] data = "ABC".getBytes();
//		byte[] data = "안녕하세요".getBytes("EUC-KR"); // 10바이트
		byte[] data = "안녕하세요".getBytes("UTF-8"); // 15바이트
		
		for(int i = 0; i<data.length; i++) {
			os.write(data[i]);
		}
		System.out.println(data.length);
		os.flush();
		os.close();

	}

}
