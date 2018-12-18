
public class Television {
	public boolean state;									
	public int channel = 0;									// Channel value initially.
	public int volume = 0;									// Volume value initially.
	int newChannel = 0;	
	public boolean isState() {								// For getting current state for Television(ON/OFF);
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	public int getChannel() {								// Getting the channel value in integer.
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getNewChannel() {
		return newChannel;
	}
	public void setNewChannel(int newChannel) {						// For storing new channel value.
		if(isState() == true) {
			this.newChannel = newChannel;
		}
		else {
			this.newChannel = 0;
		}
	}
	public int currentChannel() {									// To get current channel after changed.
		if(getNewChannel() > 0) {
			return getNewChannel();
		}
		else {
			return getChannel();
		}
	}
	public int increaseVolume() {										// Increasing the volume by incrementing 1.
			if(isState() == true && currentChannel() > 0) {
				this.volume++;
			}
		return this.volume;
	}
	public int decreaseVolume() {										// Decreasing the volume by decrementing 1.
		if(isState() == true && currentChannel() > 0) {
			this.volume--;
		}
		return this.volume;
	}
	public int currentVolume() {									//  Current volume after increased and decreased volume.
		return this.volume;
	}
}
