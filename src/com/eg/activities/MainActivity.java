package com.eg.activities;

import com.eg.app.R;
import com.eg.viewholders.LoginViewHolder;
import com.pj.core.viewholders.NavigationViewHolder;
import com.pj.core.viewholders.ViewHolder;

import android.os.Bundle;

public class MainActivity extends EGActivity {

	@SuppressWarnings("deprecation")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		NavigationViewHolder.NavigationViewParams.NavigationBarBackgroundResource = R.color.main_bar_background;
		NavigationViewHolder.NavigationViewParams.NavigationContentBackgroundResource = R.color.main_content_background;
		ViewHolder.NavigationBarParams.TitleTextColor = getResources().getColor(R.color.main_bar_text_color);
		ViewHolder.NavigationBarParams.GobackButtonPlainTextColor = getResources().getColor(R.color.main_bar_text_color);
		ViewHolder.NavigationBarParams.ItemButtonPlainTextColor = getResources().getColor(R.color.main_bar_text_color);
		
		ViewHolder.NavigationBarParams.GobackButtonPressedTextColor = getResources().getColor(R.color.main_bar_text_focus_color);
		ViewHolder.NavigationBarParams.ItemButtonPlainTextColor = getResources().getColor(R.color.main_bar_text_focus_color);
		
		ViewHolder viewHolder = new LoginViewHolder(this);
		NavigationViewHolder navigationViewHolder = new NavigationViewHolder(viewHolder);
		setContentView(navigationViewHolder);
	}
}
