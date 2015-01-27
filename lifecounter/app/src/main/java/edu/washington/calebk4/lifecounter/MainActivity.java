package edu.washington.calebk4.lifecounter;

import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState != null) {
            String lifeone = savedInstanceState.getString("playeronelifecount");
            String lifetwo = savedInstanceState.getString("playertwolifecount");
            String lifethree = savedInstanceState.getString("playerthreelifecount");
            String lifefour = savedInstanceState.getString("playerfourlifecount");
            TextView edit = (TextView) findViewById(R.id.playeronelifecount);
            TextView edit2 = (TextView) findViewById(R.id.playertwolifecount);
            TextView edit3 = (TextView) findViewById(R.id.playerthreelifecount);
            TextView edit4 = (TextView) findViewById(R.id.playerfourlifecount);
            edit.setText(lifeone);
            edit2.setText(lifetwo);
            edit3.setText(lifethree);
            edit4.setText(lifefour);
        }
        //player one
        Button playeroneplus = (Button) findViewById(R.id.playeroneplus);
        playeroneplus.setOnClickListener(this);
        Button playeroneminus = (Button) findViewById(R.id.playeroneminus);
        playeroneminus.setOnClickListener(this);
        Button playeroneplusfive = (Button) findViewById(R.id.playeroneplusfive);
        playeroneplusfive.setOnClickListener(this);
        Button playeroneminusfive = (Button) findViewById(R.id.playeroneminusfive);
        playeroneminusfive.setOnClickListener(this);
        //player two
        Button playertwoplus = (Button) findViewById(R.id.playertwoplus);
        playertwoplus.setOnClickListener(this);
        Button playertwominus = (Button) findViewById(R.id.playertwominus);
        playertwominus.setOnClickListener(this);
        Button playertwoplusfive = (Button) findViewById(R.id.playertwoplusfive);
        playertwoplusfive.setOnClickListener(this);
        Button playertwominusfive = (Button) findViewById(R.id.playertwominusfive);
        playertwominusfive.setOnClickListener(this);
        //player three
        Button playerthreeplus = (Button) findViewById(R.id.playerthreeplus);
        playerthreeplus.setOnClickListener(this);
        Button playerthreeminus = (Button) findViewById(R.id.playerthreeminus);
        playerthreeminus.setOnClickListener(this);
        Button playerthreeplusfive = (Button) findViewById(R.id.playerthreeplusfive);
        playerthreeplusfive.setOnClickListener(this);
        Button playerthreeminusfive = (Button) findViewById(R.id.playerthreeminusfive);
        playerthreeminusfive.setOnClickListener(this);
        //player four
        Button playerfourplus = (Button) findViewById(R.id.playerfourplus);
        playerfourplus.setOnClickListener(this);
        Button playerfourminus = (Button) findViewById(R.id.playerfourminus);
        playerfourminus.setOnClickListener(this);
        Button playerfourplusfive = (Button) findViewById(R.id.playerfourplusfive);
        playerfourplusfive.setOnClickListener(this);
        Button playerfourminusfive = (Button) findViewById(R.id.playerfourminusfive);
        playerfourminusfive.setOnClickListener(this);

    }


    public void onClick(View v){
        switch(v.getId()){
            case R.id.playeroneplus:
                setText(1, "+", 1);
                break;
            case R.id.playeroneminus:
                setText(1, "-", 1);
                break;
            case R.id.playeroneplusfive:
                setText(1, "+", 5);
                break;
            case R.id.playeroneminusfive:
                setText(1, "-", 5);
                break;
            case R.id.playertwoplus:
                setText(2, "+", 1);
                break;
            case R.id.playertwominus:
                setText(2, "-", 1);
                break;
            case R.id.playertwoplusfive:
                setText(2, "+", 5);
                break;
            case R.id.playertwominusfive:
                setText(2, "-", 5);
                break;
            case R.id.playerthreeplus:
                setText(3, "+", 1);
                break;
            case R.id.playerthreeminus:
                setText(3, "-", 1);
                break;
            case R.id.playerthreeplusfive:
                setText(3, "+", 5);
                break;
            case R.id.playerthreeminusfive:
                setText(3, "-", 5);
                break;
            case R.id.playerfourplus:
                setText(4, "+", 1);
                break;
            case R.id.playerfourminus:
                setText(4, "-", 1);
                break;
            case R.id.playerfourplusfive:
                setText(4, "+", 5);
                break;
            case R.id.playerfourminusfive:
                setText(4, "-", 5);
                break;
        }
    }
    /*private View.OnClickListener onClickListener = new View.OnClickListener() {
        public void onClick(View v) {

        }
    };*/

    private void setText (int id, String op, int num){
        TextView edit = null;
        if (id == 1){
            edit = (TextView) findViewById(R.id.playeronelifecount);
        } else if (id==2) {
            edit = (TextView) findViewById(R.id.playertwolifecount);
        } else if (id==3){
            edit = (TextView) findViewById(R.id.playerthreelifecount);
        } else {
            edit = (TextView) findViewById(R.id.playerfourlifecount);
        }
        Integer number = Integer.parseInt(edit.getText().toString());
        if (op.equals("+")){
            number += num;
            edit.setText(number.toString());
        } else {
            number -= num;
            edit.setText(number.toString());
            if (number <= 0) {
                TextView set = (TextView) findViewById(R.id.textView);
                set.setText("Player " + id + " Loses!!");
            }
        }
    }


    @Override
    public void onSaveInstanceState (Bundle outState) {
        TextView edit = (TextView) findViewById(R.id.playeronelifecount);
        TextView edit2 = (TextView) findViewById(R.id.playertwolifecount);
        TextView edit3 = (TextView) findViewById(R.id.playerthreelifecount);
        TextView edit4 = (TextView) findViewById(R.id.playerfourlifecount);
        System.out.println(edit.getText().toString());
        outState.putString("playeronelifecount", edit.getText().toString());
        outState.putString("playertwolifecount", edit2.getText().toString());
        outState.putString("playerthreelifecount", edit3.getText().toString());
        outState.putString("playerfourlifecount", edit4.getText().toString());
        super.onSaveInstanceState(outState);
    }

}
