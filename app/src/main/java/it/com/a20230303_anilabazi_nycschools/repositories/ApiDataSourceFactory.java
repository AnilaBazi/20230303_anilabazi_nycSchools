package it.com.a20230303_anilabazi_nycschools.repositories;

import androidx.lifecycle.MutableLiveData;
import androidx.paging.DataSource;
import androidx.paging.PageKeyedDataSource;

import it.com.a20230303_anilabazi_nycschools.models.SchoolDetails;

import javax.inject.Inject;

public class ApiDataSourceFactory extends DataSource.Factory {
    private ApiDataSource mApiDataSource;
    private MutableLiveData<PageKeyedDataSource<Integer, SchoolDetails>> dataSourceMutableLiveData = new MutableLiveData<>();

    @Inject
    public ApiDataSourceFactory(ApiDataSource apiDataSource) {
        this.mApiDataSource = apiDataSource;
    }

    @Override
    public DataSource create() {
        dataSourceMutableLiveData.postValue(mApiDataSource);
        return mApiDataSource;
    }
}
