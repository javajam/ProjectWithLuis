package com.wewow.projectwithluis.detail;

/**
 * Created by eleroy on 5/10/2017.
 */

public class DetailPresenter implements DetailContract.Presenter{

    private DetailContract.View mView;

    DetailPresenter(DetailContract.View view) {
        mView = view;
    }

    @Override
    public void start() {

    }
}
