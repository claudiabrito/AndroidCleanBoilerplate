package com.crebrito.androidclean.presentation.di.module;

import android.app.Activity;
import com.crebrito.androidclean.presentation.di.scope.ActivityScope;
import dagger.Module;
import dagger.Provides;

@Module public class ActivityModule {

  private final Activity activity;

  public ActivityModule(Activity activity) {
    this.activity = activity;
  }

  @ActivityScope @Provides Activity provideActivity() {
    return this.activity;
  }
}
