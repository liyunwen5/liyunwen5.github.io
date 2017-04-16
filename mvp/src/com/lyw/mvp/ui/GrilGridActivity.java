package com.lyw.mvp.ui;

import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.Toast;

import com.lyw.mvp.R;
import com.lyw.mvp.adaper.CommonAdapter;
import com.lyw.mvp.adaper.ViewHolder;
import com.lyw.mvp.bean.Girl;
import com.lyw.mvp.presenter.GirlPresenterV2;
import com.lyw.mvp.view.IGirlView;

public class GrilGridActivity extends BaseActivity<IGirlView,GirlPresenterV2<IGirlView>> implements IGirlView {
	private GridView mGridView;
	private CommonAdapter mAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.grid_view);
		 mGridView=(GridView) findViewById(R.id.gridView1);
//		 //中间者
 		mPresenter.fectch();
	}


	@Override
	public void showLoading() {
		// TODO Auto-generated method stub
		Toast.makeText(this, "正在拼命加载中", 1).show();
		
	}

	@Override
	public void showGirls(List<Girl> girls) {
		// TODO Auto-generated method stub
//		listview.setAdapter(new GirlAdaper(this));
		mGridView
		.setAdapter(mAdapter = new CommonAdapter<Girl>(
				getApplicationContext(), girls,
				R.layout.adapter_view) {
			@Override
			public void convert(ViewHolder helper,
					Girl gril) {
				helper.setImageResource(R.id.imageView1,
						gril.getInt1());
				helper.setText(R.id.title2,gril.getStr1());
				helper.setText(R.id.title3,gril.getStr2());
			}
		});
		
		
	}


	@Override
	protected GirlPresenterV2 createPresenter() {
		// TODO Auto-generated method stub
		return new GirlPresenterV2( );
	}

}
