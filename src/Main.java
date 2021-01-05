import timeAgo.IDate;

public class Main {
	public static void main(String[] args) {
		
		long secondsAgo = 2*60; // dos minutos atras
		
		IDate creationDate = new IDate(System.currentTimeMillis() - secondsAgo*1000);
		
		System.out.println(creationDate.timeAgoString());
	}
}


