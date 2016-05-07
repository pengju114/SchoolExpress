package com.eg.activities;

import com.eg.app.R;
import com.pj.core.BaseActivity;

import android.os.Bundle;

public class EGActivity extends BaseActivity {
	@SuppressWarnings("deprecation")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setSystemBarTintColor(defaultResources().getColor(R.color.main_bar_background));
	}
}
