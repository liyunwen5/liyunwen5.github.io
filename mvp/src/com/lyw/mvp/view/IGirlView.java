package com.lyw.mvp.view;

import java.util.List;

import com.lyw.mvp.bean.Girl;

public interface IGirlView {
	/**
	 * 加载进度条
	 */
	void showLoading();
	/**
	 * 显示数据
	 * @param girls
	 */
	
	void showGirls(List<Girl> girls);

}
