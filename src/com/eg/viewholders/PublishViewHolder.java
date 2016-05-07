package com.eg.viewholders;

import com.eg.app.R;
import com.eg.viewholders.MainHolder.MarkableViewHolder;
import com.pj.core.BaseActivity;

import android.view.View;

public class PublishViewHolder extends MarkableViewHolder {

	public PublishViewHolder(BaseActivity activity) {
		super(activity);
		// TODO Auto-generated constructor stub
		setLayoutResource(R.layout.grabbed);
	}
	
	@Override
	protected void initialize(BaseActivity activity, View view) {
		// TODO Auto-generated method stub
		super.initialize(activity, view);
		getNavigationBar().setTitle(R.string.title_publish);
	}

	@Override
	protected void onApplyView(View view) {
		// TODO Auto-generated method stub

	}

}
