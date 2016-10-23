package com.example.rewards.ruactive;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements SensorEventListener {

    private SensorManager mSensorManager;
    private Sensor mySteps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // mySteps.setType(Sensor.TYPE_STEP_COUNTER);
        mSensorManager = (SensorManager)getSystemService(SENSOR_SERVICE);
        mySteps = mSensorManager.getDefaultSensor(Sensor.TYPE_STEP_COUNTER);
    }

    protected void onResume() {
        super.onResume();
        mSensorManager.registerListener(this, mySteps, SensorManager.SENSOR_DELAY_NORMAL);
    }

    protected void onPause() {
        super.onPause();
        mSensorManager.unregisterListener(this);
    }


    public void onAccuracyChanged(Sensor sensor, int accuracy) {
    }

    public void onSensorChanged(SensorEvent event) {


    }


}
//stepcounter