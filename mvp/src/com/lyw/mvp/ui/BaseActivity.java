package com.lyw.mvp.ui;


import com.lyw.mvp.presenter.BasePresenter;
import android.app.Activity;
import android.os.Bundle;
/**
 * 
 * @author Thinkpad-e470
 *
 *<V> IGrilView 接口
 *<T>
 */
public abstract class BaseActivity<V,T extends BasePresenter<V>> extends Activity{
	protected T mPresenter;
	@SuppressWarnings("unchecked")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		//创建presenter
		mPresenter = createPresenter();
		
		//关联view
		mPresenter.attachView((V)this);
	}
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		
		//解除关联
		mPresenter.detachView();
		super.onDestroy();
	}
	/**
	 * create presenter 子类来实现具体构建过程
	 */
	protected abstract T createPresenter();

}
