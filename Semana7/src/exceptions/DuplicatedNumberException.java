package exceptions;

public class DuplicatedNumberException extends RuntimeException {

	private String message;

	public DuplicatedNumberException(String message) {
		super(message);
		this.message = message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}