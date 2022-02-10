package com.dinner.Games.Exception;

public class GameNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public GameNotFoundException(String message) {
		super(message);
	}

}
