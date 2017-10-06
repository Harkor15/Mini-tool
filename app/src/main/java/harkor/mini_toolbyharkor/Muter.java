package harkor.mini_toolbyharkor;

import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;

import java.sql.Time;

public class Muter extends AppCompatActivity {



    TextView tw1;
    int AV = android.os.Build.VERSION.SDK_INT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muter);
        SharedPreferences sharedPreferences;
        sharedPreferences=getSharedPreferences("harkor.mini_toolbyharkor",Context.MODE_PRIVATE);
        TimePicker timePicker;
        timePicker=(TimePicker)findViewById(R.id.timePicker3);
        tw1=(TextView)findViewById(R.id.timen);
        int hour=sharedPreferences.getInt("hour",100);
        int minute=sharedPreferences.getInt("minute",0);
        if(hour==100) { //time is not set
            tw1.setText(R.string.notSetMuter);
            hour=0;
            Log.d("hour=100","Nie było nic!");
        }
        if(AV<23){
            timePicker.setCurrentHour(hour);   //API <23!
            timePicker.setCurrentMinute(minute);  // API <23!
        }else{
            timePicker.setHour(hour);   //API +23!
            timePicker.setMinute(minute);  // API +23!
        }

    }
    public void save(View view){
        SharedPreferences sharedPreferences;
        sharedPreferences=getSharedPreferences("harkor.mini_toolbyharkor",Context.MODE_PRIVATE);
        TimePicker timePicker;
        timePicker=(TimePicker)findViewById(R.id.timePicker3);
        int h;
        int m;
        if(AV<23){
            h=timePicker.getCurrentHour();   //API <23!
            m=timePicker.getCurrentMinute();  // API <23!
        }else{
            h=timePicker.getHour();   //API +23!
            m=timePicker.getMinute();  // API +23!
        }Log.d("Pobralo: ",h+" "+m);

        SharedPreferences.Editor editor;
        editor=sharedPreferences.edit();
        editor.putInt("hour",h);
        editor.putInt("minute",m);
        editor.commit();

        //TESTY
        Log.d("Zapis","TAK");
        int a=sharedPreferences.getInt("hour",0);
        int b=sharedPreferences.getInt("minutes",0);
        Log.d("Zapis",a+" "+b   );
    }
    public void goBack(View view){
        System.exit(0);
    }
}
