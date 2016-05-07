package com.eg.viewholders;

import com.eg.app.R;
import com.pj.core.BaseActivity;

import android.view.View;

/**
 * 更多
 * @author luzhenwen
 *
 */
public class MoreViewHolder extends MainHolder.MarkableViewHolder{

	public MoreViewHolder(BaseActivity activity) {
		super(activity);
		// TODO Auto-generated constructor stub
		setLayoutResource(R.layout.more);
	}
	
	@Override
	protected void initialize(BaseActivity activity, View view) {
		// TODO Auto-generated method stub
		super.initialize(activity, view);
		getNavigationBar().setTitle(R.string.title_more);
	}

	@Override
	protected void onApplyView(View view) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getMarkId() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName();
	}

}
