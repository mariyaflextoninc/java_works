package test.mariya.flexton.patientlogger;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class PatientLogger {
	private Logger log;
	private PatientDateVerifier patientDatVerify;
	
	public PatientLogger(){
		log = new Logger("patient_log.txt");
		patientDatVerify = new PatientDateVerifier();
	}
	
	public void processPatient( String patientName, GregorianCalendar checkUpDate ){
		try{
			patientDatVerify.verifyCheckUpDate(checkUpDate);
		}
		catch(CheckDateException e){

			log.writeLine(""+patientName+"\t"+e.toString());
			SimpleDateFormat dateFormat = new SimpleDateFormat("E MMM dd HH:mm:ss z yyyy");
			System.out.println (patientName + "\t" + dateFormat.format(checkUpDate.getTime()));
			
		}
	}
	
	
}
