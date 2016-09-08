package com.reactnativecomponentdemos;

import com.facebook.react.ReactActivity;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.ReactRootView;
import com.facebook.react.shell.MainReactPackage;

import java.util.Arrays;
import java.util.List;

import com.reactnativecomponent.splashscreen.RCTSplashScreenPackage;    //import package
import com.reactnativecomponent.swiperefreshlayout.RCTSwipeRefreshLayoutPackage;    //import package

public class MainActivity extends ReactActivity {

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        return "ReactNativeComponentDemos";
    }

    /**
     * A subclass may override this method if it needs to use a custom {@link ReactRootView}.
     */
    @Override
    protected ReactRootView createRootView() {

        MainApplication mainApplication=(MainApplication)this.getApplication();
        mainApplication.setReactNativeHost( new ReactNativeHost(mainApplication) {
            @Override
            protected boolean getUseDeveloperSupport() {
                return BuildConfig.DEBUG;
            }

            @Override
            protected List<ReactPackage> getPackages() {
                return Arrays.<ReactPackage>asList(
                        new MainReactPackage(),
                        new RCTSplashScreenPackage(MainActivity.this),  //register Module
                        new RCTSwipeRefreshLayoutPackage()  //register Module
                );
            }

        });

        return super.createRootView();
    }

}