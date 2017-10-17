package com.crebrito.androidclean.domain.exception;

public class DefaultErrorBundle implements ErrorBundle {

  private static final String DEFAULT_ERROR_MESSAGE = "Unknown Error";
  private final Exception exception;

  public DefaultErrorBundle(Exception exception) {
    this.exception = exception;
  }

  @Override public Exception getException() {
    return this.exception;
  }

  @Override public String getErrorMessage() {
    return (this.exception != null) ? exception.getMessage() : DEFAULT_ERROR_MESSAGE;
  }
}
