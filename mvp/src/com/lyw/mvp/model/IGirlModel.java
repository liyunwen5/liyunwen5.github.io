package com.lyw.mvp.model;

import java.util.List;

import com.lyw.mvp.bean.Girl;

//单一值职责任
public interface IGirlModel {
	/**
	 * 加载数据
	 * @param listter
	 */
	
	void LoadGirl( GirlOnLoadListter listter);
	/**
	 * 加载完成监听
	 * @author Thinkpad-e470
	 *
	 */
	
	interface GirlOnLoadListter{
		
		void onComplete(List<Girl> girls);
	}

}
