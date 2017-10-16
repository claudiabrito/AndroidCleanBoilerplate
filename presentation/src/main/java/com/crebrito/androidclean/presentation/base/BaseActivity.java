package com.crebrito.androidclean.presentation.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import com.crebrito.androidclean.presentation.AndroidCleanApplication;
import com.crebrito.androidclean.presentation.di.component.ApplicationComponent;
import com.crebrito.androidclean.presentation.di.module.ActivityModule;

public abstract class BaseActivity extends AppCompatActivity {

  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    this.getApplicationComponent().inject(this);

    setContentView(getLayoutResource());

  }

  protected ApplicationComponent getApplicationComponent() {
    return ((AndroidCleanApplication) getApplication()).getComponent();
  }

  protected ActivityModule getModule() {
    return new ActivityModule(this);
  }

  public abstract int getLayoutResource();
}
