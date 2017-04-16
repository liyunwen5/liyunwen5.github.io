package com.lyw.mvp.ui;

import java.util.List;

import com.lyw.mvp.R;
import com.lyw.mvp.adaper.CommonAdapter;
import com.lyw.mvp.adaper.ViewHolder;
import com.lyw.mvp.bean.Girl;
import com.lyw.mvp.presenter.GirlPresenterV1;
import com.lyw.mvp.ui.BaseActivity;
import com.lyw.mvp.view.IGirlView;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

public class GrilListActivity extends BaseActivity<IGirlView, GirlPresenterV1<IGirlView>> implements IGirlView{
	private ListView listview;
	private CommonAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview =(ListView) findViewById(R.id.listView1);

     
        //中间者 让他戳发加载数据
        mPresenter.setGirlModel(2);;
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
		listview
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
	protected GirlPresenterV1 createPresenter() {
		// TODO Auto-generated method stub
		return new GirlPresenterV1();
	}


    
}
