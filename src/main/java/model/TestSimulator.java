package model;

public class TestSimulator {

	public static void main(String[] args) {
		
		Simulator sim = new Simulator();
		sim.init();
		sim.run();

		System.out.println("Pazienti che hanno abbandonato: "+sim.getPatientsAbandoned());
		System.out.println("Pazienti morti: "+sim.getPatientsDead());
		System.out.println("Pazienti curati: "+sim.getPatientsTreated());
		
	}

}
