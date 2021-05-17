package model;

import java.time.LocalTime;

public class Event implements Comparable<Event>{

	public enum EventType{
		ARRIVAL, //arrivo nuovo paziente, entra in triage
		TRIAGE, // e' finito il triage, entro in sala d'attesa
		TIMEOUT, // passa un certo tempo di attesa
		FREE_STUDIO, // si e' liberato uno studio, chiamiamo qualche paziente
		TREATED, //paziente curato
		TICK //timer pre controllare se ci sono studi vuoti
	};
	
	private LocalTime time; //marcatura temporale dell'evento stesso
	private EventType type;
	private Patient patient;
	
	public Event(LocalTime time, EventType type, Patient patient) {
		this.time = time;
		this.type = type;
		this.patient = patient;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public EventType getType() {
		return type;
	}

	public void setType(EventType type) {
		this.type = type;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	@Override
	public int compareTo(Event other) {
		return this.time.compareTo(other.time);
	}

	@Override
	public String toString() {
		return "Event [time=" + time + ", type=" + type + ", patient=" + patient + "]";
	}
	
	
}
