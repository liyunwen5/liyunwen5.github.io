package com.lyw.mvp.ui;


import com.lyw.mvp.presenter.BasePresenter;
import android.app.Activity;
import android.os.Bundle;
/**
 * 
 * @author Thinkpad-e470
 *
 *<V> IGrilView �ӿ�
 *<T>
 */
public abstract class BaseActivity<V,T extends BasePresenter<V>> extends Activity{
	protected T mPresenter;
	@SuppressWarnings("unchecked")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		//����presenter
		mPresenter = createPresenter();
		
		//����view
		mPresenter.attachView((V)this);
	}
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		
		//�������
		mPresenter.detachView();
		super.onDestroy();
	}
	/**
	 * create presenter ������ʵ�־��幹������
	 */
	protected abstract T createPresenter();

}
