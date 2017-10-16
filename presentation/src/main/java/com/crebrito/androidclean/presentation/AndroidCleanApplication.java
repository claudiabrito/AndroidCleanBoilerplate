package com.crebrito.androidclean.presentation;

import android.app.Application;
import com.crebrito.androidclean.presentation.di.component.ApplicationComponent;
import com.crebrito.androidclean.presentation.di.component.DaggerApplicationComponent;
import com.crebrito.androidclean.presentation.di.module.ApplicationModule;
import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

public class AndroidCleanApplication extends Application {

  private ApplicationComponent component;

  @Override public void onCreate() {
    super.onCreate();
    setupDagger();
    setupLeakCanary();
  }

  private void setupDagger() {
    component =
        DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(this)).build();
  }

  protected RefWatcher setupLeakCanary() {
    if (LeakCanary.isInAnalyzerProcess(this)) {
      return RefWatcher.DISABLED;
    }
    return LeakCanary.install(this);
  }

  public ApplicationComponent getComponent() {
    return this.component;
  }
}
