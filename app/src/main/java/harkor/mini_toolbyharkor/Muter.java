package harkor.mini_toolbyharkor;

import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TimePicker;

import java.sql.Time;

public class Muter extends AppCompatActivity {
    //TimePicker timePicker=(TimePicker)findViewById(R.id.timePicker3);
    //SharedPreferences sharedPreferences=getSharedPreferences("harkor.mini_toolbyharkor",Context.MODE_PRIVATE);
    //sharedPreferences

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muter);



       // int hour=sharedPreferences.getInt("hour",0);
        //int minute=sharedPreferences.getInt("minute",0);

        //timePicker.setHour(hour);
        //timePicker.setMinute(minute);
    }
    public void save(){
        //int h=timePicker.getHour();
        //int m=timePicker.getMinute();
        //SharedPreferences.Editor editor;
        //editor=sharedPreferences.edit();
        //editor.putInt("hour",h);
        //editor.putInt("minute",m);

    }

    public void goBack(View view){
        System.exit(0);
    }
}
