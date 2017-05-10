package com.wewow.projectwithluis.home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.wewow.projectwithluis.R;

import java.util.List;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements HomeContract.View {

    @Inject
    private HomeContract.Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doSearch(View view) {
        mPresenter.searchCharacter("Thor");
    }

    @Override
    public void setPresenter(HomeContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void showResults(List<Character> results) {
        // TODO display results in RecyclerView
    }
}
