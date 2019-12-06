package br.com.intelipost.exception;

import java.util.Date;

public class ErrorDetails {
	private Date timestamp;
	private String message;
	private String details;

	public ErrorDetails(Date timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = this.pegarSomenteAMensagem(message);
		this.details = details;
	}

	private String pegarSomenteAMensagem(String msg) {
		String sa = msg.substring(msg.indexOf("default message ["));
		sa = sa.replaceAll("default message", "");
		sa = sa.replaceAll("]]", "]");
		return sa;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}
}