package com.greatlearning.services;
/**
 * @author Rahul Dubey
 *
 */
public class ServiceExceptions extends Exception {
	/**
	 * 
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
