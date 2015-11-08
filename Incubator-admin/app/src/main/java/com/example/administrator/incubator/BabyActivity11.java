package com.example.administrator.incubator;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Administrator on 2015-11-08.
 */
public class BabyActivity11 extends Activity {
    TextView Name, Sex, Ssn, Bloodtype, State, Parent, Temperature, Humidity, Heartbeat, Sound;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.baby11);


        Person baby = (Person) getIntent().getExtras().getParcelable("key");

        Name=(TextView)findViewById(R.id.textViewNameValue);
        Name.setText(baby.babyName);

        Sex=(TextView)findViewById(R.id.textViewSexValue);
        Sex.setText(baby.sex);

        Ssn=(TextView)findViewById(R.id.textViewSSNValue);
        Ssn.setText(baby.ssn);

        Bloodtype=(TextView)findViewById(R.id.textViewBloodTypeValue);
        Bloodtype.setText(baby.bloodType);

        State=(TextView)findViewById(R.id.textViewStateValue);
        State.setText(baby.state);

        Parent=(TextView)findViewById(R.id.textViewParentValue);
        Parent.setText(baby.parentName);

        Temperature=(TextView)findViewById(R.id.textViewTemperatureValue);
        Temperature.setText(baby.temperature);

        Humidity=(TextView)findViewById(R.id.textViewHumidityValue);
        Humidity.setText(baby.humidity);

        Heartbeat=(TextView)findViewById(R.id.textViewHeartBeatValue);
        Heartbeat.setText(baby.heartbeat);

        Sound=(TextView)findViewById(R.id.textViewSoundValue);
        Sound.setText(baby.sound);

    }
}

