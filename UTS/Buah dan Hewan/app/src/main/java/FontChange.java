import android.app.Application;

import com.example.ghozy.tugas.R;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by Ghozy on 3/29/2018.
 */

public class FontChange extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/cartoonist_kooky.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
        //....
    }
}