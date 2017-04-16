package com.lyw.mvp.presenter;

import java.util.List;

import com.lyw.mvp.bean.Girl;
import com.lyw.mvp.model.GrilModellmplv2;
import com.lyw.mvp.model.IGirlModel;
import com.lyw.mvp.view.IGirlView;

/**
 * girl presenter
 * ocp ����ԭ��
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
		//��ʾ������
		getView().showLoading();
		
		//��model load data
		if(mIGirlModel!=null){
			mIGirlModel.LoadGirl(new IGirlModel.GirlOnLoadListter() {
				
				@Override
				public void onComplete(List<Girl> girls) {
					// TODO Auto-generated method stub
					//��view��ʾ
					getView().showGirls(girls);
				}
			});
		}
		
	}
	
	

}
