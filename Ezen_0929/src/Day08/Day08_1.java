package Day08;

public class Day08_1 {
	
	// main method - thread
	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("iphone pro 11", "black", 10);
		
		// field from Cellphone is not private so I can access to this value
		// if I mark it as a private, I need to use getter / setter
		System.out.println("model : " + dmbCellPhone.model);
		System.out.println("color : " + dmbCellPhone.color);
		// field of DmbCellPhone
		System.out.println("channel : " + dmbCellPhone.channel);
		
		// call method which is inherited from CellPhone 
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("Hi");
		dmbCellPhone.receiveVoice("Hi, I am an Apple");
		dmbCellPhone.sendVoice("nice to meet you");
		dmbCellPhone.hangUp();
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
		
	}

}
