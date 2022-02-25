package by.belyuk.third_project.exception;

public class SomeException extends Exception {
  public SomeException() {
    super();
  }

  public SomeException(String message) {
    super(message);
  }

  public SomeException(String message, Throwable cause) {
    super(message, cause);
  }

  public SomeException(Throwable cause) {
    super(cause);
  }
}
