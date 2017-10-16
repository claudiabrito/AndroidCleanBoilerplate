package com.crebrito.androidclean.presentation.di.component;

import android.content.Context;
import com.crebrito.androidclean.presentation.di.module.ApplicationModule;
import dagger.Component;
import javax.inject.Singleton;

@Singleton @Component(modules = ApplicationModule.class) public interface ApplicationComponent {
  Context context();
}
