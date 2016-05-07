package com.eg.viewholders;

import com.eg.app.R;
import com.eg.viewholders.MainHolder.Markable;
import com.eg.viewholders.MainHolder.MarkableViewHolder;
import com.pj.core.BaseActivity;
import com.pj.core.viewholders.TabViewHolder;
import com.pj.core.viewholders.ViewHolder;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * 抢单
 * @author luzhenwen
 *
 */
public class GrabbingViewHolder extends TabViewHolder implements Markable{

	public GrabbingViewHolder(BaseActivity activity) {
		super(activity,activity.defaultInflater().inflate(R.layout.grabbing, (ViewGroup)activity.getRootViewHolder().getView(), false));
	}
	
	@Override
	protected void initialize(BaseActivity activity, View view) {
		// TODO Auto-generated method stub
		super.initialize(activity, view);
		getNavigationBar().setTitle(R.string.title_grabbing);
	}

	@Override
	protected void onApplyView(View view) {
		super.onApplyView(view);
		// TODO Auto-generated method stub
		MarkableViewHolder v1 = new WaitingGrabbingViewHolder(getActivity());
		MarkableViewHolder v2 = new GrabbedViewHolder(getActivity());
		
		for (MarkableViewHolder v : new MarkableViewHolder[]{v1,v2}) {
			View tabItem = getActivity().defaultInflater().inflate(R.layout.grabbing_tag_item, getTabHost().getTabWidget(), false);
			TextView t = (TextView) tabItem.findViewById(R.id.textView);
			t.setText(v.getNavigationBar().getTitle());
			addTab(v.getMarkId(), tabItem, v);
		}
	}
	
	@Override
	public String getMarkId() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName();
	}
	
	@Override
	protected void changeTitle(ViewHolder viewHolder) {
		// do nothing
	}
}
