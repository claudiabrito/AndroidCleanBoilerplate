package com.crebrito.androidclean.data.executor;

import com.crebrito.androidclean.domain.executor.ThreadExecutor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton public class JobExecutor implements ThreadExecutor {

  private final ThreadPoolExecutor executor;

  @Inject public JobExecutor() {
    this.executor =
        new ThreadPoolExecutor(3, 5, 10, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(),
            new JobThreadFactory());
  }

  @Override public void execute(Runnable runnable) {
    this.executor.execute(runnable);
  }

  private static class JobThreadFactory implements ThreadFactory {

    private int threadCounter;

    @Override public Thread newThread(Runnable runnable) {
      return new Thread(runnable, "android_thread_" + threadCounter++);
    }
  }
}
