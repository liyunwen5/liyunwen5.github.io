package com.lyw.mvp.model;

import java.util.ArrayList;
import java.util.List;

import com.lyw.mvp.R;
import com.lyw.mvp.bean.Girl;

/** implementation 成就; 贯彻; implement的变形; 安装启用;
 * gril model implementation version one
 * @author Thinkpad-e470
 *
 */
public class GirlModelImplv1 implements IGirlModel {

	@Override
	public void LoadGirl(GirlOnLoadListter listter) {
		// TODO Auto-generated method stub
		List<Girl> data=new ArrayList<Girl>();
		data.add(new Girl(R.drawable.ic_launcher, "1", "2"));
		data.add(new Girl(R.drawable.ic_launcher, "2", "2"));
		data.add(new Girl(R.drawable.ic_launcher, "3", "2"));
		data.add(new Girl(R.drawable.ic_launcher, "4", "2"));
		data.add(new Girl(R.drawable.ic_launcher, "5", "2"));
		data.add(new Girl(R.drawable.ic_launcher, "6", "2"));
		data.add(new Girl(R.drawable.ic_launcher, "7", "2"));
		data.add(new Girl(R.drawable.ic_launcher, "8", "2"));
		data.add(new Girl(R.drawable.ic_launcher, "9", "2"));
		data.add(new Girl(R.drawable.ic_launcher, "10", "2"));
		/**
		 * 回掉监听
		 */
		listter.onComplete(data);
	}

}
