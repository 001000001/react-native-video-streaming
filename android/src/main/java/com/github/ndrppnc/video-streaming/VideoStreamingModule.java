package com.github.ndrppnc.video-streaming;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.WritableMap;

/**
 * Created by Andrei Papancea on 02/19/18.
 */
public class VideoStreamingModule extends ReactContextBaseJavaModule {
    private ReactContext mReactContext;

    private static VideoStreamingModule instance = null;

    public static VideoStreamingModule initVideoStreamingModule(ReactApplicationContext reactContext) {
        instance = new VideoStreamingModule(reactContext);
        return instance;
    }

    public static VideoStreamingModule getInstance() {
        return instance;
    }

    protected VideoStreamingModule(ReactApplicationContext reactContext) {
        super(reactContext);
        mReactContext = reactContext;
    }

    @Override
    public String getName() {
        return "VideoStreamingModule";
    }
}
