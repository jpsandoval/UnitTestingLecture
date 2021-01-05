package timeAgo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IDateTest {

	@Test
	void twoSecondsAgoTest() {
		// set up
		long secondsAgo = 2;
		IDate creationDate = new IDate(System.currentTimeMillis() - secondsAgo*1000);
		
		// stimulus
		String result = creationDate.timeAgoString();
		
		// verification
		assertEquals(result,"2 seconds ago");
	}
	
	@Test
	void threeMinutesAgoTest() {
		// set up
		long secondsAgo = 3*60;
		IDate creationDate = new IDate(System.currentTimeMillis() - secondsAgo*1000);
		
		// stimulus
		String result = creationDate.timeAgoString();
		
		// verification
		assertEquals(result,"3 minutes ago");
	}
	
	@Test
	void fourHoursAgoTest() {
		// set up
		long secondsAgo = 4*60*60;
		IDate creationDate = new IDate(System.currentTimeMillis() - secondsAgo*1000);
		
		// stimulus
		String result = creationDate.timeAgoString();
		
		// verification
		assertEquals(result,"3 hours ago");
	}
}


