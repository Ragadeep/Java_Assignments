
public class Television {
	public static boolean state;
	public static int channel = 0;
	public int volume = 0;
	int newChannel = 0;
	public static boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	public int getChannel() {
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
	public static int changeChannel(int newChannel) {
		if(isState() == true) {
			channel = newChannel;
			return channel;
		}
		return channel;
	}
	public int changeVolume() {
		int newVolume = 0;
		if(isState() == true) {
			volume = newVolume;
		}
		return volume;
	}
}
