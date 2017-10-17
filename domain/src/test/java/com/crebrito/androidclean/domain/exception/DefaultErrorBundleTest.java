package com.crebrito.androidclean.domain.exception;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class DefaultErrorBundleTest {

  private static final String DEFAULT_ERROR_MESSAGE = "Unknown Error";
  private DefaultErrorBundle defaultErrorBundle;

  @Mock
  private Exception mockException;

  @Before
  public void setup() {
    this.defaultErrorBundle = new DefaultErrorBundle(mockException);
  }

  @Test
  public void testGetMessageIsCalledWhenExceptionIsNotNull() {
    this.defaultErrorBundle.getErrorMessage();

    verify(mockException).getMessage();
  }

  @Test
  public void testDefaultErrorMessageIsReturnedWhenExceptionIsNull() {
    this.defaultErrorBundle = new DefaultErrorBundle(null);

    assert (this.defaultErrorBundle.getErrorMessage().equals(DEFAULT_ERROR_MESSAGE));
  }

}
