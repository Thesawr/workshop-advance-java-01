
public class CircularBuffer {
	
	private int cap;
	private String[] buff;
	private int writePointer;
	private int readPointer;
	
	//Default create
	public void create() {
		cap = 10;
		buff = new String[cap];
	}
	
	public void create(int size) {
		cap = size;
		buff = new String[cap];
	}
}
