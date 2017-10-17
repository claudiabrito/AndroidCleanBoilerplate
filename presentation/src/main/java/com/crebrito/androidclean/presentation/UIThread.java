package com.crebrito.androidclean.presentation;

import com.crebrito.androidclean.domain.executor.PostExecutionThread;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton public class UIThread implements PostExecutionThread {

  @Inject public UIThread() {
  }

  @Override public Scheduler scheduler() {
    return AndroidSchedulers.mainThread();
  }
}
