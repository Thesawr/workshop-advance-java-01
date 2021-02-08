package AdvanceJava.workshop01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CircularBufferTest {
	
	CircularBuffer circularBuffer = new CircularBuffer();
	
	@Test
	@DisplayName("Default = 10")
	public void create_buffer_with_default_size() {
		CircularBuffer circularBuffer = new CircularBuffer();
        circularBuffer.create();
        int size = circularBuffer.getSize();
        
        //Validate
        assertEquals(10, size);
	}
	
	@Test
	@DisplayName("Specific = 5")
	public void create_buffer_with_s_size() {
		CircularBuffer circularBuffer = new CircularBuffer();
        circularBuffer.create(5);
        int size = circularBuffer.getSize();
        
        //Validate
        assertEquals(5, size);
	}
	
    @Test
    public void write_A_B_and_read_A_B_then_buffer_is_empty() {
        circularBuffer.create();
        circularBuffer.write("A");
        circularBuffer.write("B");
        circularBuffer.read();
        circularBuffer.read();
        assertTrue(circularBuffer.isEmpty());
    }

    @Test
    public void write_A_B_should_read_A_B() {
        circularBuffer.create();
        circularBuffer.write("A");
        circularBuffer.write("B");
        assertEquals("A", circularBuffer.read());
        assertEquals("B", circularBuffer.read());
    }

    @Test
    public void write_A_should_read_A() {
        circularBuffer.create();
        circularBuffer.write("A");
        String result = circularBuffer.read();
        assertEquals("A", result);
    }

    @Test
    @DisplayName("หลังจากสร้าง buffer แล้วเพิ่มข้อมูลเข้าไป ผลที่ได้ buffer ต้องไม่ว่าง")
    public void after_created_and_write_data_should_be_not_empty() {
        circularBuffer.create();
        circularBuffer.write("A");
        boolean status = circularBuffer.isEmpty();
        assertFalse(status);
    }

    @Test
    @DisplayName("หลังจากสร้าง buffer แล้ว buffer จะต้องว่างเสมอ")
    public void after_created_should_be_empty() {
        circularBuffer.create();
        boolean status = circularBuffer.isEmpty();
        assertTrue(status);
    }
    
    @Test
    public void read_exceed_write_should_be_null() {
    	circularBuffer.create();
        circularBuffer.write("A");
        circularBuffer.write("B");
        circularBuffer.read();
        circularBuffer.read();
        String status = circularBuffer.read();;
        assertEquals(null, status);
    }

}
