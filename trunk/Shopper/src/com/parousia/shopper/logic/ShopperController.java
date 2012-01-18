package com.parousia.shopper.logic;

import com.parousia.shopper.network.ShopperCommunicator;

import android.app.Application;

public class ShopperController extends Application {

	private static ShopperController instance;
	private ShopperCommunicator communicator;
	private ShopperApplicationState applicationState;

	public static ShopperController getInstance() {
		if (instance == null) {
			instance = new ShopperController();
		}
		return instance;
	}

	@Override
	public void onCreate() {
		super.onCreate();
		instance = this;
		setCommunicator(new ShopperCommunicator());
		setApplicationState(new ShopperApplicationState());
	}

	@Override
	public void onTerminate() {
		// TODO Auto-generated method stub
		super.onTerminate();
		// release(); for tracker
	}

	public ShopperCommunicator getCommunicator() {
		return communicator;
	}

	private void setCommunicator(ShopperCommunicator shopperCommunicator) {
		this.communicator = shopperCommunicator;
	}

	public ShopperApplicationState getApplicationState() {
		return applicationState;
	}

	private void setApplicationState(
			ShopperApplicationState shopperApplicationState) {
		this.applicationState = shopperApplicationState;
	}

}
