package com.parousia.shopper.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;

import com.parousia.shopper.R;

public class ShopperSplashScreen extends ShopperScreen {

	private static String LOGTAG = "SplashScreen";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splashscreen);

	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		goNext();
		return true;
	}

	protected void goNext() {
		Intent intent = new Intent(this, ShopperMenuScreen.class);
		startActivity(intent);

	}

}
