package edu.washington.calebk4.lifecounter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private View.OnClickListener mCorkyListener = new View.OnClickListener() {
        public void onClick(View v) {
            switch(v.getId()){
                case R.id.playeroneplus:
                    //do something
                    break;
                case R.id.playeroneminus:
                    //do something
                    break;
                case R.id.playeroneplusfive:
                    //do something
                    break;
                case R.id.playeroneminusfive:
                    //do something
                    break;
                case R.id.playertwoplus:
                    //do something
                    break;
                case R.id.playertwominus:
                    //do something
                    break;
                case R.id.playertwoplusfive:
                    //do something
                    break;
                case R.id.playerthreeplus:
                    //do something
                    break;
                case R.id.playerthreeminus:
                    //do something
                    break;
                case R.id.playerthreeplusfive:
                    //do something
                    break;
                case R.id.playerthreeminusfive:
                    //do something
                    break;
                case R.id.playerfourplus:
                    //do something
                    break;
                case R.id.playerfourminus:
                    //do something
                    break;
                case R.id.playerfourplusfive:
                    //do something
                    break;
                case R.id.playerfourminusfive:
                    //do something
                    break;


            }
        }
    };
}
