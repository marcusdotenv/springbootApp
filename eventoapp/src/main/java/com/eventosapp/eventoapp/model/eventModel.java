package com.eventosapp.eventoapp.model;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="event_table")
public class eventModel implements Serializable{

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  
  private long id;
  private String eventName;
  private String eventDate;
  private String eventPlace;
  private int sizeEvent;


  public long getId() {
    return this.id;
  }
  public void setId(long id) {
    this.id = id;
  }
  public String getEventName() {
  	return this.eventName;
  }
  public void setEventName(String eventName) {
  	this.eventName = eventName;
  }
  public String getEventDate() {
    return this.eventDate;
  }
  public void setEventDate(String eventDate) {
    this.eventDate = eventDate;
  }
  public int getSizeEvent() {
    return this.sizeEvent;
  }
  public void setSizeEvent(int sizeEvent) {
    this.sizeEvent = sizeEvent;
  }
  public String getEventPlace() {
  	return this.eventPlace;
  }
  public void setEventPlace(String eventPlace) {
  	this.eventPlace = eventPlace;
  }
  

}