// Application for designing television with some properties like Increase volume, Decrease volume, and changing channels.
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TelevisionTest {
	private Television tv;									// Object creation.
	@Before
	public void setUp() {
		tv = new Television();
		tv.setState(true);									// True denotes the Television is ON and false denotes OFF.
		tv.setChannel(0);									// Default channel;
		tv.setNewChannel(45);
		tv.setNewChannel(47);								// Changing channels.
		tv.increaseVolume();
		tv.increaseVolume();
		tv.increaseVolume();								// Increasing the volume(By incrementing volume.)
		tv.decreaseVolume();								// Decreasing the volume.
	}
	@Test	
	public void currentState() {
		assertTrue(tv.isState());
	}
	@Test
	public void currentChannel() {
		assertEquals(47, tv.currentChannel());
	}
	@Test
	public void currentVolume() {
		assertEquals(2, tv.currentVolume());
	}
}
