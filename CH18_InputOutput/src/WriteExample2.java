import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample2 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
//		byte[] data = "ABC".getBytes();
		byte[] data = "안녕하세요".getBytes("EUC-KR"); // 10바이트
//		byte[] data = "djkd".getBytes(); // 15바이트
		
		os.write(data, 0, 7);
		os.flush();
		os.close();

	}

}
