package java8.optional;
/*

Case:
Soundcard is an optional hardware in any computer i.e. soundcard may or may not be there

In following code, we are checking
if Soundcard is present in Computer
if yes, if USB present in Soundcard
If yes, then return USB version


#Old Code Style:	
	String usbVersion = "UNKNOWN";
	if(computer != null){
	  Soundcard soundcard = computer.getSoundcard();
	  if(soundcard != null){
	    USB usb = soundcard.getUSB();
	    if(usb != null){
	      usbVersion = usb.getVersion();
	    }
	  }
	}

	

#New code Style:
	 	
//New code clearly shows that Soundcard is an optional field for Computer class
 it may or may not exists
	
public class Computer {
	private Optional<Soundcard> soundcard;  
	public Optional<Soundcard> getSoundcard() { ... }
		
}

public class Soundcard {
	private Optional<USB> usb;
	public Optional<USB> getUSB() { ... }
}

public class USB{
	public String getVersion(){ ... }
}
	
	
	
	
##Optional Uses##	

#Here is an empty Optional:
Optional<Soundcard> sc = Optional.empty(); 

#Here is an Optional which can hold only non null values
SoundCard obj = new Soundcard();
Optional<Soundcard> sc = Optional.of(obj);   // will get NPE here if obj is null

#Here is an Optional which can hold null value too
SoundCard obj = new Soundcard();
Optional<Soundcard> sc = Optional.ofNullable(obj); // will not get NPE if obj is null and Optional will be empty

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
*/	

