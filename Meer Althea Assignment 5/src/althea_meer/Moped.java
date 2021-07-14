package althea_meer;

public class Moped {
	
	// make some constants for describing my moped's properties
	
	// these directions can be used for direction_facing
	public final static int NORTH = 0;
	public final static int EAST = 1;
	public final static int SOUTH = 2;
	public final static int WEST = 3;
	
	// make some private data fields for the properties of the moped
	private int gas; //this will be out of 20 (then converted to percent later)
	private int direction_facing;
	private boolean parked;
	private int street;
	private int ave;
	
	// first, a constructor to use for the default settings of my moped
	public Moped(int gas, int direction_facing, boolean parked, int street, int ave) {
		this.direction_facing = direction_facing;
		this.gas = gas;
		this.parked = parked;
		this.street = street;
		this.ave = ave;
	} // moped constructor
	
	//time to define some getters and setters
	
	public void setDirection(int direction_facing) {
		this.direction_facing = direction_facing;
	}
	public int getGas() {
		return gas;
	} // gas getter
	
	public int getDirection() {
		return direction_facing;
	} //direction getter
	
	public boolean getParked() {
		return parked;
	}// parked getter
	
	public int getStreet() {
		return street;
	} //street getter
	
	public int getAve() {
		return ave;
	} //ave getter
	
	//now, i'll create some methods so my moped can do its thing!
	
	// a method to fill the gas tank
	public void fillTank() {
		gas = 20;
	}// fill tank method
	
	//let's make some driving methods!
	public void upStreet() {
		street ++;
		gas -= 1.0/20;
	} //upstreet method
	
	public void downStreet() {
		street -= 1;
		gas -= 1.0/20;
	}//downstreet method
	
	public void upAve() {
		ave ++;
		gas -= 1.0/20;
	}//upave method
	
	public void downAve() {
		ave -= 1;
		gas -= 1.0/20;
	}//downave method
	
	//park method
	public void park() {
		parked = true;
	} //park method
	
	//printing method
	
	
	
	
	


		

	

} //moped class
