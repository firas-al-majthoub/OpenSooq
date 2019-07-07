package com.firas.opensooq.ui.base;

public abstract class BasePresenter<V extends BaseMvp.View> implements BaseMvp.Presenter {
    protected V mView;

    @Override
    public void setView(BaseMvp.View view) {
        mView = (V) view;
    }

    @Override
    public void resume() {
    }

    @Override
    public void destroy() {
        mView = null;
    }
}
