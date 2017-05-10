package com.wewow.projectwithluis.detail;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

/**
 * Created by eleroy on 5/10/2017.
 */

public class DetailActivity extends AppCompatActivity implements DetailContract.View{

    @Inject
    private DetailContract.Presenter mPresenter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void setPresenter(DetailContract.Presenter presenter) {
        mPresenter = presenter;
    }
}
