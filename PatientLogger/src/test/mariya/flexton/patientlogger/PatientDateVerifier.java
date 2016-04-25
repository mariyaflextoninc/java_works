package test.mariya.flexton.patientlogger;

import java.util.GregorianCalendar;

public class PatientDateVerifier {
	DateValidator dateVal; 
	CheckDateException checkObj;
	
	public PatientDateVerifier(){
		dateVal = new DateValidator();
	}
	
	public void verifyCheckUpDate( GregorianCalendar date ) throws CheckDateException{
		try{
		if( dateVal.isFutureDate(date) ){
		
			checkObj =  new CheckDateException(date," Remarks : \nInvalid date:Check-up date is in the future  ");
			throw checkObj;
		
		}
		if( dateVal.isLongerThanSixMonths(date)  ){
			
			checkObj = new CheckDateException(date," Remarks : \nInvalid date:Check-up date is longer than six months. \nPatient needs another check-up.  ");
			throw checkObj;
		}
		if( dateVal.isMonthDec(date)  ){
			
			checkObj = new CheckDateException(date," Remarks : \nPatient needs smallpox vaccination  ");
			throw checkObj;
		}
		}
		catch(NullPointerException n){
			System.out.println(n);
		}
	}

}
