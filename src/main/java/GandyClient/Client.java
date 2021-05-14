package GandyClient;

public class Client {
	private static final Client INSTANCE = new Client();
	public static final Client getInstance () {
		return INSTANCE;
	}
	
	private GandyClientRP RichPresence = new GandyClientRP();
	
	public void init () {
		// beginning of this.startGame in Minecraft.java
		System.out.println("GandyClient Loading");
	}
	
	public void start () {
		// end of this.startGame in Minecraft.java
		RichPresence.start();
	}
	
	public void shutdown () {
		// client shutdown
	}
	
	public GandyClientRP getRichPresence () {
		return RichPresence;
	}
}
