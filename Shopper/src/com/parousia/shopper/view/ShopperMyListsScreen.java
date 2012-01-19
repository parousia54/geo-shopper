package com.parousia.shopper.view;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.parousia.shopper.R;

public class ShopperMyListsScreen extends ShopperScreen {

	private static String LOGTAG = "MyListsScreen";

	@Override
	protected void onCreate(Bundle bundle) {
		super.onCreate(bundle);
		setContentView(R.layout.mylistsscreen);
		
		ListView mylists = (ListView)findViewById(R.id.mylists);
		String[] values = new String[] { "Android", "iPhone", "WindowsMobile",
				"Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
				"Linux", "OS/2" };
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, values);
		mylists.setAdapter(adapter);
	}
	
	

}
