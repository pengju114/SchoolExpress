package com.eg.viewholders;

import com.eg.app.R;
import com.pj.core.BaseActivity;
import com.pj.core.ui.TabItemBackroundDrawable;
import com.pj.core.viewholders.HttpViewHolder;
import com.pj.core.viewholders.TabViewHolder;
import com.pj.core.viewholders.ViewHolder;

import android.graphics.Color;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainHolder extends TabViewHolder {

	public MainHolder(BaseActivity activity) {
		super(activity, activity.defaultInflater().inflate(R.layout.main, (ViewGroup)activity.getRootViewHolder().getView(), false));
		// TODO Auto-generated constructor stub
	}
	

	@Override
	protected void onApplyView(View view) {
		// TODO Auto-generated method stub
		super.onApplyView(view);
		
		MarkableViewHolder v1 = new HomeViewHolder(getActivity());
		MarkableViewHolder v5 = new PublishViewHolder(getActivity());
		GrabbingViewHolder v2 = new GrabbingViewHolder(getActivity());
		MarkableViewHolder v3 = new MineViewHolder(getActivity());
		MarkableViewHolder v4 = new MoreViewHolder(getActivity());
		
		for (ViewHolder v : new ViewHolder[]{v1,v5,v2,v3,v4}) {
			StateListDrawable drawable = new StateListDrawable();
			TabItemBackroundDrawable plain = new TabItemBackroundDrawable();
			TabItemBackroundDrawable focus = new TabItemBackroundDrawable();
			plain.setTintEndColor(Color.TRANSPARENT);
			drawable.addState(new int[]{android.R.attr.state_pressed}, focus);
			drawable.addState(new int[]{android.R.attr.state_selected}, focus);
			drawable.addState(new int[]{}, plain);
			TextView item = (TextView) getActivity().defaultInflater().inflate(R.layout.tab_item, getTabHost().getTabWidget(), false);
			item.setText(v.getNavigationBar().getTitle());
			item.setBackgroundDrawable(drawable);
			addTab(((Markable)v).getMarkId(), item , v);
		}
	}
	
	
	@Override
	public void onTabChanged(String tabId) {
		// TODO Auto-generated method stub
		super.onTabChanged(tabId);
		getNavigationBar().setTitle(getCurrentTabPage().getNavigationBar().getTitle());
	}
	
	public static interface Markable{
		public String getMarkId();
	}
	
	public static abstract class MarkableViewHolder extends HttpViewHolder implements Markable{
		public MarkableViewHolder(BaseActivity activity) {
			super(activity);
			// TODO Auto-generated constructor stub
		}

		@Override
		public String getMarkId(){
			return getClass().getSimpleName();
		}
	}
}
