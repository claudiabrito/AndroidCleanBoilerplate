package com.crebrito.androidclean.presentation.di.module;

import android.content.Context;
import com.crebrito.androidclean.presentation.AndroidCleanApplication;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

@Module public class ApplicationModule {

  private final AndroidCleanApplication application;

  public ApplicationModule(AndroidCleanApplication application) {
    this.application = application;
  }

  @Singleton @Provides Context provideContext() {
    return this.application;
  }
}
