package com.parousia.shopper.view;

import java.util.ArrayList;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.parousia.shopper.R;

public class ShopperMenuScreen extends ShopperScreen {

	private static String LOGTAG = "MenuScreen";

	@Override
	protected void onCreate(Bundle bundle) {
		super.onCreate(bundle);
		setContentView(R.layout.menuscreen);

		GridView menuGrid = (GridView) findViewById(R.id.menugrid);
		menuGrid.setAdapter(new CustomAdapter(this));

	}

	public class CustomAdapter extends BaseAdapter {

		private Context mContext;

		private ArrayList<String> menuItemTxtArray;
		private int[] menuItemIconArray;

		// references to our images
		private Integer[] mThumbIds = { R.drawable.ic_list, 
										R.drawable.ic_location};

		public CustomAdapter(Context c) {
			mContext = c;
			menuItemTxtArray = new ArrayList<String>();
			menuItemTxtArray.add("MY\nLISTS");
			menuItemTxtArray.add("MY\nLOCATIONS");

		}

		@Override
		public int getCount() {
			return menuItemTxtArray.size();
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			LinearLayout tileLayout;
			ImageView imageView;
			TextView textView;
			if (convertView == null) {// if it's not recycled, initialize some
										// attributes
				tileLayout = new LinearLayout(mContext);
				tileLayout.setLayoutParams(new GridView.LayoutParams(
						ViewGroup.LayoutParams.WRAP_CONTENT,
						ViewGroup.LayoutParams.WRAP_CONTENT));
				tileLayout.setPadding(6, 6, 6, 6);
				tileLayout.setOrientation(LinearLayout.VERTICAL);
			} else {
				tileLayout = (LinearLayout) convertView;
				return tileLayout;
			}
			imageView = new ImageView(mContext);
			imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
			imageView.setPadding(2, 2, 2, 2);
			imageView.setImageResource(mThumbIds[position]);
			textView = new TextView(mContext);
			textView.setText(menuItemTxtArray.get(position));
			textView.setTypeface(Typeface.MONOSPACE,Typeface.BOLD);
			textView.setGravity(Gravity.CENTER_HORIZONTAL);
			tileLayout.addView(imageView);
			tileLayout.addView(textView);
			return tileLayout;
		}
	}
}