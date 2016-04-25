package test.mariya.flexton.patientlogger;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.annotation.Generated;

public class DateValidator{
	Calendar now = new GregorianCalendar();
	
	public boolean isFutureDate( GregorianCalendar date ){
		if( date == null ){
			return false;
		}
		
		int result = now.compareTo( date );
		if( result > 0 ){
			
			return true;
		}
		return false;
		
	}
	
	public boolean isMonthDec( GregorianCalendar date ){
		if( date == null ){
			return false;
		}
		if( date.get(Calendar.MONTH) == 12 ){
			return true;
		}
		return false;
	}
	
	public boolean isLongerThanSixMonths( GregorianCalendar date ){
		
		if( date == null ){
			return false;
		}
		
		int yearDiff  = date.get( Calendar.YEAR ) - now.get( Calendar.YEAR );
		int monthDiff = yearDiff * 12 + date.get( Calendar.MONTH ) - now.get( Calendar.MONTH );
		
		if( monthDiff > 6 ){
			return true;
		}
		
		return false;
	}

}
