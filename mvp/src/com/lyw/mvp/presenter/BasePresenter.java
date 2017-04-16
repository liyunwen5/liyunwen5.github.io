package com.lyw.mvp.presenter;

import java.lang.ref.WeakReference;

/**
 * 
 * @author Thinkpad-e470
 *
 * @param <T> ��Ӧactivity����ӿ�
 */
public abstract class BasePresenter<T> {
	/**
	 * ��ȡ���ݳ��󷽷�
	 */
	public abstract void fectch();
	
	/**
	 * ���ڴ治������ͷ�
	 */
	protected  WeakReference<T> mViewRef;
	
	/**
	 * bind p with v
	 *  attach  ����
	 */
	public void attachView(T view){
		
		//viewһ�������� ,�����ͻ����Ȱ�model�ɵ�
		mViewRef=new WeakReference<T>(view);
	}
	
	/**
	 * �������
	 */
	public void detachView(){
		
		if(mViewRef!=null){
			mViewRef.clear();
			mViewRef=null;
			
		}
	}
	
	protected T getView(){
		
		return mViewRef.get();
	}

}
