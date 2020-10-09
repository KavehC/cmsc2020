/** 
*The purpose of this class is to model a television
*Kaveh Chakrhabi
*10/9/2020
*/

public class Television {
	private String MANUFACTURER;
	private int SCREEN_SIZE = 0;
	private boolean powerOn = false;
	private int channel = 2;
	private int volume = 20;
	
	/**
	 * Has the user set the brand name and screen size 
	 * @param brand
	 * @param size
	 */
	public Television(String brand, int size) {
		MANUFACTURER = brand;
		SCREEN_SIZE = size;
	}
	
	/**
	 * Sets the Channel to a given int
	 * @param channel
	 */
	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	/**
	 * Changes the power from on to off and off to on
	 */
	public void power() {
		if(powerOn)
			powerOn = false;
		if(!powerOn)
			powerOn = true;
	}
	
	/**
	 * Increases the volume by one
	 */
	public void increaseVolume() {
		volume++;
	}
	
	/**
	 * Decreases the volume by one
	 */
	public void decreaseVolume() {
		volume--;
	}
	
	/**
	 * Gets the current value stored in channel
	 * @return
	 */
	public int getChannel() {
		return channel;
	}
	
	/**
	 * Gets the current volume
	 * @return
	 */
	public int getVolume() {
		return volume;
	}
	
	/**
	 * Gets the tv's manufactures name
	 * @return
	 */
	public String getManufacturer() {
		return MANUFACTURER;
	}
	
	/**
	 * Gets the tv's screen size
	 * @return
	 */
	public int getScreenSize() {
		return SCREEN_SIZE;
	}
}
