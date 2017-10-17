package com.crebrito.androidclean.presentation.di.component;

import android.content.Context;
import com.crebrito.androidclean.domain.executor.PostExecutionThread;
import com.crebrito.androidclean.domain.executor.ThreadExecutor;
import com.crebrito.androidclean.presentation.base.BaseActivity;
import com.crebrito.androidclean.presentation.di.module.ApplicationModule;
import dagger.Component;
import javax.inject.Singleton;

@Singleton @Component(modules = ApplicationModule.class) public interface ApplicationComponent {
  Context context();

  ThreadExecutor threadExecutor();

  PostExecutionThread postExecutionThread();

  void inject(BaseActivity activity);
}
