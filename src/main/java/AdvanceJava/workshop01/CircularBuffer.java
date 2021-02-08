
public class CircularBuffer {
	
	private int cap = 10;
	private int current = 0;
	private String[] buff;
	private int writePointer = 0;
	
	//Default create
	public void create() {
		buff = new String[cap];
	}
	
	public void create(int size) {
		cap = size;
		buff = new String[cap];
	}
	
	public int getSize() {
		return cap;
	}
	
	public void write(String input) throws Exception {
		int start = writePointer;
		
		current++;
		
		if(current == cap) {
			throw new Exception("FullBufferException");
		}
		
		buff[start] = input;
		writePointer++;
	}
	
	public boolean isEmpty() {
		for(int i=0; i<buff.length; i++) {
			if(buff[i] != null) {
				return false;
			}
		}
		return true;
	}
	
}
