package it.com.a20230303_anilabazi_nycschools;

import android.app.Application;

import it.com.a20230303_anilabazi_nycschools.di.AppComponent;
import it.com.a20230303_anilabazi_nycschools.di.AppModule;
import it.com.a20230303_anilabazi_nycschools.di.DaggerAppComponent;

public class NYCApplication extends Application {

    private static NYCApplication application;

    private AppComponent appComponent;  // Instance for Dagger 2 Component

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;

        // Instantiate instance for Dagger 2 Component
      appComponent = DaggerAppComponent.builder().appModule(new AppModule()).build();
       appComponent.inject(this);
    }

    public static NYCApplication getApplication() {
        return application;
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
