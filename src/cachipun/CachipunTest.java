package cachipun;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CachipunTest {

	@Test
	void paperStoneTest() {
		Cachipun game=new Cachipun();
		
		Hand winner = game.play(Hand.PAPER, Hand.STONE);
		
		assertEquals(Hand.PAPER, winner);
	}
	
	@Test
	void paperScissorTest() {
		Cachipun game=new Cachipun();
		
		Hand winner = game.play(Hand.PAPER, Hand.SCISSOR);
		
		assertEquals(Hand.SCISSOR, winner);
	}
	
	@Test
	void stoneScissorTest() {
		Cachipun game=new Cachipun();
		
		Hand winner = game.play(Hand.STONE, Hand.SCISSOR);
		
		assertEquals(Hand.STONE, winner);
	}
	// add more test to ensure a correct functionality
}


