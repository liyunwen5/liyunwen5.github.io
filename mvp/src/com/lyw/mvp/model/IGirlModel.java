package com.lyw.mvp.model;

import java.util.List;

import com.lyw.mvp.bean.Girl;

//��һְֵ����
public interface IGirlModel {
	/**
	 * ��������
	 * @param listter
	 */
	
	void LoadGirl( GirlOnLoadListter listter);
	/**
	 * ������ɼ���
	 * @author Thinkpad-e470
	 *
	 */
	
	interface GirlOnLoadListter{
		
		void onComplete(List<Girl> girls);
	}

}
