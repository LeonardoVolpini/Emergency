package model;

import java.time.LocalTime;

public class Patient implements Comparable<Patient>{

	public enum ColorCode{
		NEW, //in triage
		WHITE, YELLOW, RED, BLACK, //in sala d'attesa
		TREATING, //dentro lo studio medico
		OUT //a casa (abbandonato o curato)
	};
	private LocalTime arrivalTime;
	private ColorCode color;
	private int num;
	
	public Patient(LocalTime arrivalTime, ColorCode color, int num) {
		this.arrivalTime = arrivalTime;
		this.color = color;
		this.num=num;
	}

	public LocalTime getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(LocalTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public ColorCode getColor() {
		return color;
	}

	public void setColor(ColorCode color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "paziente numero: "+num+", arrivato all'ora: "+arrivalTime+", e con colore: "+color;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + num;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		if (num != other.num)
			return false;
		return true;
	}

	@Override
	public int compareTo(Patient other) {
		if (this.color.equals(other.color)) {
			return this.arrivalTime.compareTo(other.arrivalTime);
		} 
		else {
			if (this.color.equals(Patient.ColorCode.RED))
				return -1;
			else if (other.color.equals(Patient.ColorCode.RED))
				return 1;
			else if (this.color.equals(Patient.ColorCode.YELLOW))
				return -1;
			else
				return 1;
		}
	}
	
	

}
