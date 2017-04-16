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
 * ocp ����ԭ��
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
	/**
	 * ����ģʽ
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
