package exception; 

public class NotEqualNodeException extends Exception{

	private String message; 

	public NotEqualNodeException(String message) {
		super(message); 
		this.message = message;

	}

	public String getMessage() {
		return message;

	}

}
