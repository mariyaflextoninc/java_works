package test.mariya.flexton.patientlogger;

import java.util.GregorianCalendar;

	
public class CheckDateException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private GregorianCalendar checkDate;
	private String msg;
	
	public CheckDateException(  GregorianCalendar checkDate1, String msg){
	
		this.checkDate =  checkDate1 ;
		this.msg = msg;
	}
	
	public String toString(){
		
		return checkDate + msg;
	}

}
