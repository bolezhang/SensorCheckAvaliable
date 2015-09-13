package com.example.bole.sensorcheckavaliable;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    private SensorManager mSensorManager;
    private String checkResult = "Result:\n";
    private TextView tvResult;
    private Button btnCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResult = (TextView) findViewById(R.id.tvResult);
        btnCheck = (Button) findViewById(R.id.btnCheck);
        btnCheck.setOnClickListener(new onClickListenerImp());
        // sensorCheck();
    }

    class onClickListenerImp implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub
            sensorCheck();
        }
    }

    private void sensorCheck() {
        mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);

        // ACCELEROMETER
        if (mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER) != null) {
            checkResult = checkResult + "加速传感器: YES\n";
        } else {
            checkResult = checkResult + "加速传感器: NO\n";
        }

        // AMBIENT_TEMPERATURE
        if (mSensorManager.getDefaultSensor(Sensor.TYPE_AMBIENT_TEMPERATURE) != null) {
            checkResult = checkResult + "温度计: YES\n";
        } else {
            checkResult = checkResult + "温度计: NO\n";
        }

        // GAME_ROTATION_VECTOR
        if (mSensorManager.getDefaultSensor(Sensor.TYPE_GAME_ROTATION_VECTOR) != null) {
            checkResult = checkResult + "游戏旋转矢量传感器: YES\n";
        } else {
            checkResult = checkResult + "游戏旋转矢量传感器: NO\n";
        }

        // GEOMAGNETIC_ROTATION_VECTOR
        if (mSensorManager
                .getDefaultSensor(Sensor.TYPE_GEOMAGNETIC_ROTATION_VECTOR) != null) {
            checkResult = checkResult + "地磁旋转矢量传感器: YES\n";
        } else {
            checkResult = checkResult + "地磁旋转矢量传感器: NO\n";
        }

        // GRAVITY
        if (mSensorManager.getDefaultSensor(Sensor.TYPE_GRAVITY) != null) {
            checkResult = checkResult + "重力传感器: YES\n";
        } else {
            checkResult = checkResult + "重力传感器: NO\n";
        }

        // GYROSCOPE
        if (mSensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE) != null) {
            checkResult = checkResult + "陀螺仪: YES\n";
        } else {
            checkResult = checkResult + "陀螺仪: NO\n";
        }

        // GYROSCOPE_UNCALIBRATED
        if (mSensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE_UNCALIBRATED) != null) {
            checkResult = checkResult + "未校准陀螺仪: YES\n";
        } else {
            checkResult = checkResult + "未校准陀螺仪: NO\n";
        }

        // LIGHT
        if (mSensorManager.getDefaultSensor(Sensor.TYPE_LIGHT) != null) {
            checkResult = checkResult + "光线传感器: YES\n";
        } else {
            checkResult = checkResult + "光线传感器: NO\n";
        }

        // LINEAR_ACCELERATION
        if (mSensorManager.getDefaultSensor(Sensor.TYPE_LINEAR_ACCELERATION) != null) {
            checkResult = checkResult + "加速度传感器: YES\n";
        } else {
            checkResult = checkResult + "加速度传感器: NO\n";
        }

        // MAGNETIC_FIELD
        if (mSensorManager.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD) != null) {
            checkResult = checkResult + "磁场传感器: YES\n";
        } else {
            checkResult = checkResult + "磁场传感器: NO\n";
        }

        // MAGNETIC_FIELD_UNCALIBRATED
        if (mSensorManager
                .getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD_UNCALIBRATED) != null) {
            checkResult = checkResult + "未校准磁场传感器: YES\n";
        } else {
            checkResult = checkResult + "未校准磁场传感器: NO\n";
        }

        // ORIENTATION
        if (mSensorManager.getDefaultSensor(Sensor.TYPE_ORIENTATION) != null) {
            checkResult = checkResult + "方向传感器: YES\n";
        } else {
            checkResult = checkResult + "方向传感器: NO\n";
        }

        // PRESSURE
        if (mSensorManager.getDefaultSensor(Sensor.TYPE_PRESSURE) != null) {
            checkResult = checkResult + "压力传感器: YES\n";
        } else {
            checkResult = checkResult + "压力传感器: NO\n";
        }

        // PROXIMITY
        if (mSensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY) != null) {
            checkResult = checkResult + "距离传感器: YES\n";
        } else {
            checkResult = checkResult + "距离传感器: NO\n";
        }

        // RELATIVE_HUMIDITY
        if (mSensorManager.getDefaultSensor(Sensor.TYPE_RELATIVE_HUMIDITY) != null) {
            checkResult = checkResult + "相对湿度传感器: YES\n";
        } else {
            checkResult = checkResult + "相对湿度传感器: NO\n";
        }

        // ROTATION_VECTOR
        if (mSensorManager.getDefaultSensor(Sensor.TYPE_ROTATION_VECTOR) != null) {
            checkResult = checkResult + "旋转矢量传感器: YES\n";
        } else {
            checkResult = checkResult + "旋转矢量传感器: NO\n";
        }

        // SIGNIFICANT_MOTION
        if (mSensorManager.getDefaultSensor(Sensor.TYPE_SIGNIFICANT_MOTION) != null) {
            checkResult = checkResult + "显著运动传感器: YES\n";
        } else {
            checkResult = checkResult + "显著运动传感器: NO\n";
        }

        // STEP_COUNTER
        if (mSensorManager.getDefaultSensor(Sensor.TYPE_STEP_COUNTER) != null) {
            checkResult = checkResult + "计步传感器: YES\n";
        } else {
            checkResult = checkResult + "计步传感器: NO\n";
        }

        // STEP_DETECTOR
        if (mSensorManager.getDefaultSensor(Sensor.TYPE_STEP_DETECTOR) != null) {
            checkResult = checkResult + "步伐探测器: YES\n";
        } else {
            checkResult = checkResult + "步伐探测器: NO\n";
        }

        // TEMPERATURE
        if (mSensorManager.getDefaultSensor(Sensor.TYPE_TEMPERATURE) != null) {
            checkResult = checkResult + "温度传感器: YES\n";
        } else {
            checkResult = checkResult + "温度传感器: NO\n";
        }

        tvResult.setText(checkResult);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}