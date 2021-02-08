package AdvanceJava.workshop01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CircularBufferTest {
	
	@Test
	@DisplayName("Default = 10")
	public void create_buffer_with_default_size() {
		CircularBuffer circularBuffer = new CircularBuffer();
        circularBuffer.create();
        int size = circularBuffer.getSize();
        
        //Validate
        assertEquals(10, size);
	}
}
