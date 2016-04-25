package test.mariya.flexton.patientlogger;

import java.util.GregorianCalendar;

public class PatentTester {

	public static void main(String[] args) {
		PatientLogger pl = new PatientLogger();
		pl.processPatient("Flosh Gordon", new GregorianCalendar(2016, 07, 02, 13, 35));
		pl.processPatient("Wonder Woman", new GregorianCalendar(2005, 01, 12, 10, 15));
		pl.processPatient("Robin Hood", new GregorianCalendar(2004, 11, 25, 9, 22));
		pl.processPatient("Super Girl", new GregorianCalendar(2012, 07, 20, 23, 01));
		pl.processPatient("Captain America", new GregorianCalendar(2012, 4, 5, 7, 21));
		//pl.closeLog();
	}

}
