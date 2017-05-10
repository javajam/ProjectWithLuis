package com.wewow.projectwithluis.home;

import com.wewow.projectwithluis.BasePresenter;
import com.wewow.projectwithluis.BaseView;

import java.util.List;

/**
 * This is the specific contract between the view
 * and the presenter.
 */

public interface HomeContract {

    interface View extends BaseView<Presenter> {
        void showResults(List<Character> results);
    }

    interface Presenter extends BasePresenter {
        void searchCharacter(String character);
    }
}
