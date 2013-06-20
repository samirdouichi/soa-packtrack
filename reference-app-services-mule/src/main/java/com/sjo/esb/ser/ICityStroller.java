package com.sjo.esb.ser;


public interface ICityStroller {

	//could use a better algorithm here or real test data for better results
	public abstract GpsCoord generateNextCoord();

	public abstract GpsCoord getCurrentCoord();

}