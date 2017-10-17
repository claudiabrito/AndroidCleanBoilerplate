package com.crebrito.androidclean.domain.executor;

import io.reactivex.Scheduler;

public interface PostExecutionThread {
  Scheduler scheduler();
}
