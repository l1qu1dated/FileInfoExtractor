import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class tester {
	

	@Test
	void test() {
		InfoExtractor.openFile();
		
		String name = InfoExtractor.getName();
		assertEquals(name, "test.txt");
		
		long size = InfoExtractor.getSize();
		assertEquals(size, 12);
	
	}

}
