package com.android.inspirationhourglass

import android.os.Bundle
import android.support.wearable.activity.WearableActivity

class WearMainActivity : WearableActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_wear_main)

		// Enables Always-on
		setAmbientEnabled()
	}
}
