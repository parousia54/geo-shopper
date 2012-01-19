package com.parousia.shopper.view.component;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.parousia.shopper.R;
import com.parousia.shopper.models.ShopperListItem;

public class ShopperListsViewAdapter extends BaseAdapter {

	Context context;
	ArrayList<ShopperListItem> listItem;

	public ShopperListsViewAdapter(Context context,
			ArrayList<ShopperListItem> listItem) {
		super();
		this.context = context;
		this.listItem = listItem;
	}

	@Override
	public int getCount() {
		return listItem.size();
	}

	@Override
	public Object getItem(int position) {
		return listItem.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		if (convertView == null) {
			LayoutInflater inflater = (LayoutInflater) context
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView = inflater.inflate(R.layout.listitem, null);
		}
		TextView listTitle = (TextView) convertView.findViewById(R.id.listtext);
		listTitle.setText(listItem.get(position).getListHeader());
			return null;
	}
}
