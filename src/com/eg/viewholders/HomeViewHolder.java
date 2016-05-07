package com.eg.viewholders;

import com.eg.app.R;
import com.pj.core.BaseActivity;

import android.view.View;

/**
 * 首页
 * @author luzhenwen
 *
 */
public class HomeViewHolder extends MainHolder.MarkableViewHolder{

	public HomeViewHolder(BaseActivity activity) {
		super(activity);
		// TODO Auto-generated constructor stub
		setLayoutResource(R.layout.home);
	}
	
	@Override
	protected void initialize(BaseActivity activity, View view) {
		// TODO Auto-generated method stub
		super.initialize(activity, view);
		getNavigationBar().setTitle(R.string.title_home);
	}

	@Override
	protected void onApplyView(View view) {
		// TODO Auto-generated method stub
		
	}

}
