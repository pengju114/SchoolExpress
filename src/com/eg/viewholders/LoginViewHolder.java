package com.eg.viewholders;

import com.eg.app.R;
import com.pj.core.BaseActivity;
import com.pj.core.viewholders.HttpViewHolder;
import com.pj.core.viewholders.ViewHolder;

import android.view.View;
import android.widget.EditText;

public class LoginViewHolder extends HttpViewHolder implements View.OnClickListener {

	private EditText nameText;
	private EditText passText;

	public LoginViewHolder(BaseActivity activity) {
		super(activity);
		// TODO Auto-generated constructor stub
		setLayoutResource(R.layout.login);
	}
	
	@Override
	protected void initialize(BaseActivity activity, View view) {
		// TODO Auto-generated method stub
		super.initialize(activity, view);
		getNavigationBar().setTitle(R.string.login_label_login);
	}

	@Override
	protected void onApplyView(View view) {
		// TODO Auto-generated method stub
		nameText = findViewById(R.id.login_text_name);
		passText = findViewById(R.id.login_text_password);

		assignClickListener(this, R.id.login_btn_dologin, R.id.login_label_register, R.id.login_label_forget_pwd);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.login_btn_dologin:
			ViewHolder mainHolder = new MainHolder(getActivity());
			getNavigationViewHolder().setHolder(mainHolder, true);
			break;

		case R.id.login_label_register:
			ViewHolder regHolder = new RegisterViewHolder(getActivity());
			getNavigationViewHolder().push(regHolder, true);
			break;
		case R.id.login_label_forget_pwd:

			break;
		default:
			break;
		}
	}

}
