package mcs.service.rest.test;

public class Cars {
String make;
String model;
String year;

public Cars(String year, String make, String model){
	this.year = year;
	this.make = make;
	this.model = model;
}

public String getMake() {
	return make;
}
public void setMake(String make) {
	this.make = make;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getYear() {
	return year;
}
public void setYear(String year) {
	this.year = year;
}
}
