package com.eg.viewholders;

import com.eg.app.R;
import com.eg.viewholders.MainHolder.MarkableViewHolder;
import com.pj.core.BaseActivity;

import android.view.View;

public class GrabbedViewHolder extends MarkableViewHolder {

	public GrabbedViewHolder(BaseActivity activity) {
		super(activity);
		// TODO Auto-generated constructor stub
		setLayoutResource(R.layout.grabbed);
	}
	
	@Override
	protected void initialize(BaseActivity activity, View view) {
		// TODO Auto-generated method stub
		super.initialize(activity, view);
		getNavigationBar().setTitle(R.string.title_grabbed_list);
	}

	@Override
	protected void onApplyView(View view) {
		// TODO Auto-generated method stub

	}

}
