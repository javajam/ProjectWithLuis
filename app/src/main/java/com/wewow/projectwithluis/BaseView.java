package com.wewow.projectwithluis;

/**
 * The BaseView defines the abstract
 * method that every View in the app
 * should implement.
 */

public interface BaseView<T> {

    void setPresenter(T presenter);

}
