package com.greatlearning.services;
/**
 * @author Rahul Dubey
 *
 */
public class ServiceExceptions extends Exception {
	/**
	 * Data members: - String message : To store the Exception Message.
	 * Parameterized Constructor: to intialize the exception message
	 * Metchods: - String toString(): overrided the toString() to print the custom exceptions.
	 */
	private static final long serialVersionUID = 1L;
	private String message="";
	public ServiceExceptions(String msg) {
		this.message=msg;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.message;
	}
	

}
