package com.lyw.mvp.view;

import java.util.List;

import com.lyw.mvp.bean.Girl;

public interface IGirlView {
	/**
	 * ���ؽ�����
	 */
	void showLoading();
	/**
	 * ��ʾ����
	 * @param girls
	 */
	
	void showGirls(List<Girl> girls);

}
