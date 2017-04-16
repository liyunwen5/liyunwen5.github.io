package com.lyw.mvp.presenter;

import java.util.List;

import com.lyw.mvp.bean.Girl;
import com.lyw.mvp.model.GirlModelImplv1;
import com.lyw.mvp.model.GrilModellmplv2;
import com.lyw.mvp.model.IGirlModel;
import com.lyw.mvp.model.IGirlModel.GirlOnLoadListter;
import com.lyw.mvp.view.IGirlView;

/**
 * girl presenter
 * ocp 开闭原则
 *
 */

public class GirlPresenterV1<T> extends BasePresenter<IGirlView>  {
	
	
	//model
	IGirlModel mIGirlModel;
//	IGirlModel mIGirlModel=new GirlModelImplv1();;
	/**
	 * bind view and model
	 */
	
	@Override
	public void fectch() {
		// TODO Auto-generated method stub
		//显示进度条
		getView().showLoading();
		
		//让model load data
		if(mIGirlModel!=null){
			mIGirlModel.LoadGirl(new IGirlModel.GirlOnLoadListter() {
				
				@Override
				public void onComplete(List<Girl> girls) {
					// TODO Auto-generated method stub
					//给view显示
					getView().showGirls(girls);
				}
			});
		}
		
	}
	/**
	 * 策略模式
	 * @param mGirlView
	 */
//	public void setmGirlView(IGirlView mGirlView) {
//		this.mGirlView = mGirlView;
//	}
	public void setGirlModel(int i){
		switch (i) {
		case 1:
			mIGirlModel=new GirlModelImplv1();
			break;
		case 2:
			mIGirlModel=new GrilModellmplv2();
			break;

		default:
			break;
		}
	}


}
