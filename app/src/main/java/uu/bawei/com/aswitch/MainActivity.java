package uu.bawei.com.aswitch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements SwitchView.OnChangedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //实例化WiperSwitch
        SwitchView wiperSwitch = (SwitchView)findViewById(R.id.wiperSwitch1);

        //设置初始状态为false
        wiperSwitch.setChecked(false);

        //设置监听
        wiperSwitch.setOnChangedListener(this);
    }
    public void OnChanged(SwitchView wiperSwitch, boolean checkState) {
        Log.e("log", "" + checkState);
    }
}
