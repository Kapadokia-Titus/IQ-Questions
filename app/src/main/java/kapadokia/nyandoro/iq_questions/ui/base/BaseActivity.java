package kapadokia.nyandoro.iq_questions.ui.base;


import android.app.ProgressDialog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.ViewDataBinding;

import javax.inject.Inject;

public abstract class BaseActivity<T extends ViewDataBinding, V extends BaseViewModel> extends AppCompatActivity {


    private ProgressDialog mProgressDialog;

    private T mViewDataBinding;

    @Inject
    protected V mViewModel;
}
