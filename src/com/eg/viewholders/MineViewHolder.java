package com.eg.viewholders;

import com.eg.app.R;
import com.pj.core.BaseActivity;
import com.pj.core.viewholders.HttpViewHolder;

import android.view.View;

/**
 * 我的
 * @author luzhenwen
 *
 */
public class MineViewHolder extends MainHolder.MarkableViewHolder{

	public MineViewHolder(BaseActivity activity) {
		super(activity);
		// TODO Auto-generated constructor stub
		setLayoutResource(R.layout.mine);
	}
	
	@Override
	protected void initialize(BaseActivity activity, View view) {
		// TODO Auto-generated method stub
		super.initialize(activity, view);
		getNavigationBar().setTitle(R.string.title_mine);
	}

	@Override
	protected void onApplyView(View view) {
		// TODO Auto-generated method stub
		
	}

}
