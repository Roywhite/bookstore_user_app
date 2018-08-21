package com.xiaobai.lanya.view;

import com.xiaobai.lanya.R;
import com.xiaobai.lanya.R.layout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class GonggaolanFragment extends Fragment {
	
	private TextView mHead;
	private ImageView mCamaro;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.activity_gonggaolan_fragment, container, false);
		initView(view);
		initData();
		return view;
	}

	private void initData() {
		mHead.setText("公告栏");
		mCamaro.setImageResource(R.drawable.camaro_image);
	}

	private void initView(View view) {
		mHead = (TextView) view.findViewById(R.id.head_name_in_gonggao).findViewById(R.id.head_name);
		mCamaro = (ImageView) view.findViewById(R.id.head_name_in_gonggao).findViewById(R.id.head_camaro);
	}
}
