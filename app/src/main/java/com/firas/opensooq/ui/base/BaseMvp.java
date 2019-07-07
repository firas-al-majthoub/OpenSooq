package com.firas.opensooq.ui.base;

public interface BaseMvp {
    interface Presenter {
        void resume();

        void destroy();

        void setView(View view);
    }

    interface View {
        void initPresenter();
    }
}
