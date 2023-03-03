package it.com.a20230303_anilabazi_nycschools.ui.details;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import it.com.a20230303_anilabazi_nycschools.NYCApplication;
import it.com.a20230303_anilabazi_nycschools.models.SatScores;
import it.com.a20230303_anilabazi_nycschools.models.SchoolDetails;
import it.com.a20230303_anilabazi_nycschools.repositories.AppRepository;

import javax.inject.Inject;

public class SchoolDetailsViewModel extends ViewModel {

    @Inject
    AppRepository appRepository;
    private SchoolDetails schoolDetails;

    public SchoolDetailsViewModel() {
        NYCApplication.getApplication().getAppComponent().inject(this);
    }

    public LiveData<SatScores> getSatScore(String dbn) {
        return appRepository.getSatScore(dbn);
    }

    public SchoolDetails getSchoolDetails() {
        return schoolDetails;
    }

    public void setSchoolDetails(SchoolDetails schoolDetails) {
        this.schoolDetails = schoolDetails;
    }

}
