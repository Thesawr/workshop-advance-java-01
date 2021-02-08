package AdvanceJava.workshop01;


public class CircularBuffer {
	
	public static final int DEFAULT_SIZE = 10;
	
	    // Variables
    private String[] buffers;
    private int writePointer;
    private int readPointer;
    private int actualSize;

    // Constructor
    public CircularBuffer() {}

    // Methods
    // Public
    public void create() {
        create(DEFAULT_SIZE);
    }

    public void create(int size) {
        buffers = new String[size];
    }

    public int getSize() {
        return buffers.length;
    }

    public boolean isEmpty() {
        return writePointer - readPointer == 0;
    }

    public void write(String input) throws Exception {
        
    	//Check if buffer is full or not
    	if (actualSize == buffers.length) { 
            throw new Exception("FullBufferException"); 
        } 
    	
        int index = writePointer % buffers.length; 

        buffers[index] = input;
        
        actualSize++;   
        writePointer++; 
    }

    public String read() {
        return buffers[readPointer++];
    }

}
