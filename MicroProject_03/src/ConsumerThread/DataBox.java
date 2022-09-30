package ConsumerThread;

public class DataBox {
	private String data;

	public synchronized String getData() {
		if(this.data == null) {
			try {
				wait();
			} catch(InterruptedException e) {}
		}
		String returnValue = data;
		System.out.println("ConsummerThread가 읽은 데이터 : "+returnValue);
		data = null;
		notify();
		return returnValue;
	}

	public synchronized void setData(String data) {
		this.data = data;
	}
}
