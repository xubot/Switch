package uu.bawei.com.aswitch;

import android.app.Application;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

/**
 * Created by Administrator on 2017/3/10.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        ImageLoaderConfiguration build = new ImageLoaderConfiguration.Builder(this).build();
        ImageLoader.getInstance().init(build);

    }
}
