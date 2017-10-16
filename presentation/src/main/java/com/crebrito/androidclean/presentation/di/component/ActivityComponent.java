package com.crebrito.androidclean.presentation.di.component;

import android.app.Activity;
import com.crebrito.androidclean.presentation.di.module.ActivityModule;
import com.crebrito.androidclean.presentation.di.scope.ActivityScope;
import dagger.Component;

@ActivityScope
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

  Activity activity();
}
