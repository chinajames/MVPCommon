package edu.com.app.module.splash;

import edu.com.app.base.BasePresenter;
import edu.com.app.base.BaseView;

/**
 * Created by Anthony on 2016/5/31.
 * Class Note:
 * contract class for splash view & presenter
 */
public interface SplashContract {
    interface Presenter extends BasePresenter<View> {
        void initData();
    }

    interface View extends BaseView {
        void toMainActivity();
    }
}
