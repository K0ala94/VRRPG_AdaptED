package com.GergoMuller.Swarm;


import android.app.Application;

import hu.bme.aut.adapted.gamelib.util.GameLibDaggerWrapper;

public class VRGameApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        GameLibDaggerWrapper.initInjector(this, 131);
    }
}
