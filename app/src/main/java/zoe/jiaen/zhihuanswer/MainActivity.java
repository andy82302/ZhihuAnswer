package zoe.jiaen.zhihuanswer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void qq_health(View v){
        startActivity(new Intent(this,QQHealthActivity.class));
    }
    public void air_conditioning(View v){
        startActivity(new Intent(this,AirActivity.class));
    }
}
