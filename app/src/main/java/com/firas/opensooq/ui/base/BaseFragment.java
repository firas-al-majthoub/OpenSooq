package com.firas.opensooq.ui.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public abstract class BaseFragment<P extends BaseMvp.Presenter> extends Fragment implements BaseMvp.View {

    protected P mPresenter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        initPresenter();
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    protected void buildMVP(BaseMvp.View view, P presenter) {
        mPresenter = presenter;
        mPresenter.setView(view);
    }

    @Override
    public void onResume() {
        super.onResume();
        mPresenter.resume();
    }

    @Override
    public void onDestroy() {
        mPresenter.destroy();
        super.onDestroy();
    }

}
