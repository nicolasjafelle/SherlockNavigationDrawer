package com.sherlock.navigationdrawer.demo;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

import com.actionbarsherlock.app.SherlockFragmentActivity;

public class MainActivity extends SherlockFragmentActivity {

	private static final int CONTENT_VIEW_ID = 666;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		FrameLayout frame = new FrameLayout(this);
		frame.setId(CONTENT_VIEW_ID);
		setContentView(frame, new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));

		if (savedInstanceState == null) {
			setInitialFragment();
		}
	}


	private void setInitialFragment() {
		FragmentManager fragmentManager = getSupportFragmentManager();
		FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
		fragmentTransaction.add(CONTENT_VIEW_ID, MainFragment.newInstance()).commit();
	}

}
