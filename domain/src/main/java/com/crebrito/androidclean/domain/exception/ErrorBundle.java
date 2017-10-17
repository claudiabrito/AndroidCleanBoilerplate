package com.crebrito.androidclean.domain.exception;

public interface ErrorBundle {
  Exception getException();

  String getErrorMessage();
}
