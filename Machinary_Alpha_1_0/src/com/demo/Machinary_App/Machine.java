package com.demo.Machinary_App;

import java.util.HashMap;
import java.util.List;

public class Machine{
	// DATA STORED IN SQLite
	// if you edit this, you should edit the helper
	private long 	id; 			//Required
	private String 	name; 			//Required
	private String 	list; 			//Required
	private int 	year;
	private int 	lastGrease;
	private int 	lastMaintenance;
	private String 	color;
	// TODO implement these data types
	private long 	picture;
	private long 	thumbnail;
	private long 	dateAdded;
	// Part List
	// Greasing Intervals
	// Service Intervals
	// Interval Settings
	// Comments List

	public Machine(long id, String name, String list, int year, int lastGrease, int lastMaintenance, String color) {
		this.id = id;
		this.name = name;
		this.list = list;
		this.year = year;
		this.lastGrease = lastGrease;
		this.lastMaintenance = lastMaintenance;
		this.color = color;
	}

	public Machine() {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getList() {
		return list;
	}

	public void setList(String list) {
		this.list = list;
	}

	public long getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public long getPicture() {
		return picture;
	}

	public void setPicture(long picture) {
		this.picture = picture;
	}

	public long getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(long Thumbnail) {
		this.thumbnail = Thumbnail;
	}

	public long getLastGrease() {
		return lastGrease;
	}

	public void setLastGrease(int lastGrease) {
		this.lastGrease = lastGrease;
	}

	public long getLastMaintenance() {
		return lastMaintenance;
	}

	public void setLastMaintenance(int lastMaintenance) {
		this.lastMaintenance = lastMaintenance;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	/*// Will be used by the ArrayAdapter in the ListView
	@Override
	public String toString() {
		return name;
	}*/

	// TODO static function machine to cursor

}