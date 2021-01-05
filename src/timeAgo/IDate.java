package timeAgo;

import java.util.Date;

public class IDate extends Date{
	
	private static final long serialVersionUID = 1L;

	public IDate(long milliseconds) {
		super(milliseconds);
		
	}
	
	public String timeAgoString() {
		Date now = new Date();
		long millisecondsAgo = (now.getTime() - this.getTime());
		long secondsAgo =  millisecondsAgo/1000;
		long minutesAgo = secondsAgo/60;
		long hoursAgo = minutesAgo/60;
		
		long amount=0;
		String unit="";
		
		if(secondsAgo < 60) {
			amount = secondsAgo;
			unit = "second";
		}else if(minutesAgo < 60) {
			amount = minutesAgo;
			unit = "minute";
		}else if(hoursAgo < 24) {
			amount = hoursAgo;
			unit = "hour";
		}
		if(amount>1) unit = unit +"s";
		
		return amount + " "+ unit +" ago";
	}
}


