package com.eg.viewholders;

import com.eg.app.R;
import com.pj.core.BaseActivity;
import com.pj.core.viewholders.HttpViewHolder;

import android.view.View;

public class RegisterViewHolder extends HttpViewHolder {

	public RegisterViewHolder(BaseActivity activity) {
		super(activity);
		// TODO Auto-generated constructor stub
		setLayoutResource(R.layout.register);
	}
	@Override
	protected void initialize(BaseActivity activity, View view) {
		// TODO Auto-generated method stub
		super.initialize(activity, view);
		getNavigationBar().setTitle(R.string.login_label_pregister);
	}

	@Override
	protected void onApplyView(View view) {
		// TODO Auto-generated method stub

	}

}
