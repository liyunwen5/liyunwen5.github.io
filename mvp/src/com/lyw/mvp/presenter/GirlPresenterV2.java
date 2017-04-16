package com.lyw.mvp.presenter;

import java.util.List;

import com.lyw.mvp.bean.Girl;
import com.lyw.mvp.model.GrilModellmplv2;
import com.lyw.mvp.model.IGirlModel;
import com.lyw.mvp.view.IGirlView;

/**
 * girl presenter
 * ocp 开闭原则
 * @param <T>
 *
 */

public class GirlPresenterV2<T> extends BasePresenter<IGirlView>{
	
	
	//model
	IGirlModel mIGirlModel=new GrilModellmplv2();;
	
	
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
	
	

}
