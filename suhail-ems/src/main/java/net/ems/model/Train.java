package net.ems.model;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "trains")
public class Train {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int trainId;
	@Column(name = "train_name")
	private String name;
	
	@Column(name = "source_stn")
	private String sourceStn;
	
	@Column(name = "destination_stn")
	private String destinationStn;
	
	@Column(name = "departure_time")
	private String departureTime;
	
	@Column(name = "arrival_time")
	private String arrivalTime;
	
	@Column(name = "date")
	private String date;

	public int getTrainId() {
		return trainId;
	}

	public void setTrainId(int trainId) {
		this.trainId = trainId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSourceStn() {
		return sourceStn;
	}

	public void setSourceStn(String sourceStn) {
		this.sourceStn = sourceStn;
	}

	public String getDestinationStn() {
		return destinationStn;
	}

	public void setDestinationStn(String destinationStn) {
		this.destinationStn = destinationStn;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	public Train() {
		
	}
	public Train(int trainId, String name, String sourceStn, String destinationStn, String departureTime,
			String arrivalTime, String date) {
		super();
		this.trainId = trainId;
		this.name = name;
		this.sourceStn = sourceStn;
		this.destinationStn = destinationStn;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.date = date;
	}
	
	
}
