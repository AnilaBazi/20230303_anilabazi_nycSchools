package it.com.a20230303_anilabazi_nycschools.di;

import it.com.a20230303_anilabazi_nycschools.NYCApplication;
import it.com.a20230303_anilabazi_nycschools.repositories.ApiDataSourceFactory;
import it.com.a20230303_anilabazi_nycschools.ui.details.SchoolDetailsViewModel;
import it.com.a20230303_anilabazi_nycschools.ui.school.SchoolListViewModel;
import it.com.a20230303_anilabazi_nycschools.ui.school.adapter.SchoolViewModel;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    void inject(NYCApplication application);

    void inject(ApiDataSourceFactory apiDataSourceFactory);

    void inject(SchoolListViewModel schoolListViewModel);

    void inject(SchoolViewModel schoolViewModel);

    void inject(SchoolDetailsViewModel schoolDetailsViewModel);

}
