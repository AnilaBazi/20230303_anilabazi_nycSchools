package it.com.a20230303_anilabazi_nycschools.ui.school;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.paging.PagedList;

import it.com.a20230303_anilabazi_nycschools.NYCApplication;
import it.com.a20230303_anilabazi_nycschools.models.SchoolDetails;
import it.com.a20230303_anilabazi_nycschools.repositories.AppRepository;

import javax.inject.Inject;

public class SchoolListViewModel extends ViewModel {

    @Inject
    AppRepository appRepository;

    public SchoolListViewModel() {
        NYCApplication.getApplication().getAppComponent().inject(this);
    }

    public LiveData<PagedList<SchoolDetails>> getSchoolDetailsList() {
        return appRepository.getSchoolDetailsList();
    }
}
