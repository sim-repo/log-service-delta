package com.simple.server.config;

public enum OperationType {
	MSG_READ("MSG_READ"),
	MSG_WRITE("MSG_WRITE"),
	MSG_NOTIFY("MSG_NOTIFY"),
	SQL_WRITE("SQL_WRITE"),	
	SQL_READ("SQL_READ"),
	CLASSIFICATOR_WRITE("CLASSIFICATOR_WRITE"),
	ANY_READ("ANY_READ"),
	ANY_WRITE("ANY_WRITE"),
	UNKNOWN("UNKNOWN");
	
	
	private final String value;

	OperationType(String value) {
		this.value = value;
	}

	public static OperationType fromValue(String value) {
		if (value != null) {
			for (OperationType operation : values()) {
				if (operation.value.equals(value)) {
					return operation;
				}
			}
		}
		return getDefault();
	}

	public String toValue() {
		return value;
	}

	public static OperationType getDefault() {
		return UNKNOWN;
	}
}
