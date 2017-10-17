package com.crebrito.androidclean.presentation.di.module;

import android.content.Context;
import com.crebrito.androidclean.data.executor.JobExecutor;
import com.crebrito.androidclean.domain.executor.PostExecutionThread;
import com.crebrito.androidclean.domain.executor.ThreadExecutor;
import com.crebrito.androidclean.presentation.UIThread;
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

  @Singleton @Provides ThreadExecutor provideThreadExecutor(JobExecutor jobExecutor) {
    return jobExecutor;
  }

  @Singleton @Provides PostExecutionThread providePostExecutionThread(UIThread uiThread) {
    return uiThread;
  }
}
