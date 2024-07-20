package model;

public class CheckTime {

	private static long start;
	private static long end;
	
	public CheckTime() {		
		start = System.currentTimeMillis();
	}
	
	public String calculateElapse(String Copy) {
		
		end = System.currentTimeMillis();
		long elapsedTime = end - start;
		long hours;
		long minutes;
		long seconds;
		String returnString = new String();
		if (elapsedTime > 60000) {
			minutes = (elapsedTime / 1000) / 60;
			seconds = (elapsedTime / 1000) % 60;
			if (minutes > 60) {
				hours = minutes / 60;
				minutes = minutes % 60;
				returnString = Copy + " function complete, elapsed time " + hours + " hour(s) " + minutes + " minute(s) " + seconds + " second(s).";
			} else {
				returnString = Copy + " function complete, elapsed time " + minutes + " minute(s) " + seconds + " second(s).";
			}
		} else {
			returnString = Copy + " function complete, elapsed time " + elapsedTime / 1000 + " second(s).";
		}
		
		return returnString;
	}

	public String calculateElapse(String Copy, String fileName, int counter) {
		
		end = System.currentTimeMillis();
		long elapsedTime = end - start;
		long hours;
		long minutes;
		long seconds;
		String returnString = new String();
		if (elapsedTime > 60000) {
			minutes = (elapsedTime / 1000) / 60;
			seconds = (elapsedTime / 1000) % 60;
			if (minutes > 60) {
				hours = minutes / 60;
				minutes = minutes % 60;
				returnString = Copy + " " + fileName + " function complete, elapsed time " + hours + " hour(s) " + minutes + " minute(s) " + seconds + " second(s).";
			} else {
				returnString = Copy + " " + fileName + " function complete, elapsed time " + minutes + " minute(s) " + seconds + " second(s).";
			}
		} else {
			returnString = Copy + " " + fileName + " function complete, elapsed time " + elapsedTime / 1000 + " second(s).";
		}
		
		return returnString;
	}
}