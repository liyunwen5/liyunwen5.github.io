package com.lyw.mvp.model;

import java.util.ArrayList;
import java.util.List;

import com.lyw.mvp.R;
import com.lyw.mvp.bean.Girl;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;

/**
 * implementation 成就; 贯彻; implement的变形; 安装启用;
 * gril model implementation version two
 * @author Thinkpad-e470
 *
 */
public class GrilModellmplv2 implements IGirlModel {
	/**
	 *开始线程模式
	 */
	Handler handler=new Handler(Looper.getMainLooper());
	@Override
	public void LoadGirl(final GirlOnLoadListter listter) {
		// TODO Auto-generated method stub
		new Thread(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				Log.d("jason", "load from internet");
				final List<Girl> data=new ArrayList<Girl>();
				data.add(new Girl(R.drawable.ic_launcher, "1", "12"));
				data.add(new Girl(R.drawable.ic_launcher, "2", "22"));
				data.add(new Girl(R.drawable.ic_launcher, "3", "32"));
				data.add(new Girl(R.drawable.ic_launcher, "4", "42"));
				data.add(new Girl(R.drawable.ic_launcher, "5", "52"));
				data.add(new Girl(R.drawable.ic_launcher, "6", "62"));
				data.add(new Girl(R.drawable.ic_launcher, "7", "72"));
				data.add(new Girl(R.drawable.ic_launcher, "8", "8"));
				data.add(new Girl(R.drawable.ic_launcher, "9", "92"));
				data.add(new Girl(R.drawable.ic_launcher, "10", "102"));
				handler.post(new Runnable() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						//回调
						listter.onComplete(data);
						
					}
				});
			}
		}.start();

	}
	

}
