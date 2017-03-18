package com.simple.server.config;

public enum ErrorType {
	PubTask("PubTask"), SubTask("SubTask"), WriteTask("WriteTask"),	UNKNOWN("UNKNOWN");
	
	private final String value;

	ErrorType(String value) {
		this.value = value;
	}

	public static ErrorType fromValue(String value) {
		if (value != null) {
			for (ErrorType err : values()) {
				if (err.value.equals(value)) {
					return err;
				}
			}
		}	
		return getDefault();
	}

	public String toValue() {
		return value;
	}

	public static ErrorType getDefault() {
		return UNKNOWN;
	}
	
}
