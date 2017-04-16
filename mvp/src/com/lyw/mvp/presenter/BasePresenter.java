package com.lyw.mvp.presenter;

import java.lang.ref.WeakReference;

/**
 * 
 * @author Thinkpad-e470
 *
 * @param <T> 对应activity抽象接口
 */
public abstract class BasePresenter<T> {
	/**
	 * 获取数据抽象方法
	 */
	public abstract void fectch();
	
	/**
	 * 当内存不足可以释放
	 */
	protected  WeakReference<T> mViewRef;
	
	/**
	 * bind p with v
	 *  attach  贴上
	 */
	public void attachView(T view){
		
		//view一个落引用 ,这样就会首先把model干掉
		mViewRef=new WeakReference<T>(view);
	}
	
	/**
	 * 解除管理
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
