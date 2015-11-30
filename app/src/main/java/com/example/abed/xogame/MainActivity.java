package com.example.abed.xogame;





import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int p = 1;
    int x=0;
    int cunt=0;
    TextView txt ;
    Button [] Indexarray= new Button[9];

    public void press(View v){
        cunt++;
        Button b1 = (Button)findViewById(v.getId());
        txt = (TextView) findViewById(R.id.textView);
        if(p==1){
            b1.setText("X");
            p=2;
            txt.setText("2nd Player !");
        }
        else {
            txt.setText("1st Player !");
            b1.setText("O");
            p = 1;
        }
        check();

        b1.setEnabled(false);
    }


    private void check() {
        String s;
        if (p == 1)
            s = "2nd Player ";
        else
            s = "First Player ";
        txt = (TextView) findViewById(R.id.textView);
        Indexarray[0] = (Button) findViewById(R.id.button1);
        Indexarray[1] = (Button) findViewById(R.id.button2);
        Indexarray[2] = (Button) findViewById(R.id.button3);
        Indexarray[3] = (Button) findViewById(R.id.button4);
        Indexarray[4] = (Button) findViewById(R.id.button5);
        Indexarray[5] = (Button) findViewById(R.id.button6);
        Indexarray[6] = (Button) findViewById(R.id.button7);
        Indexarray[7] = (Button) findViewById(R.id.button8);
        Indexarray[8] = (Button) findViewById(R.id.button9);

        if (Indexarray[0].getText() != ""
                && Indexarray[0].getText() == Indexarray[1].getText()
                && Indexarray[1].getText() == Indexarray[2].getText()) {
            txt.setText(s + "Win ");
            x = 1;
        } else if (Indexarray[3].getText() != ""
                && Indexarray[3].getText() == Indexarray[4].getText() &&
                Indexarray[4].getText() == Indexarray[5].getText()) {
            txt.setText(s + "Win !");
            x = 1;
        } else if (Indexarray[6].getText() != ""
                && Indexarray[6].getText() == Indexarray[7].getText()
                && Indexarray[7].getText() == Indexarray[8].getText()) {
            txt.setText(s + "Win" );
            x = 1;
        } else if (Indexarray[0].getText() != ""
                && Indexarray[0].getText() == Indexarray[3].getText()
                && Indexarray[3].getText() == Indexarray[6].getText()) {
            txt.setText(s + "Winner !");
            x = 1;
        } else if (Indexarray[1].getText() != ""
                && Indexarray[1].getText() == Indexarray[4].getText()
                && Indexarray[4].getText() == Indexarray[7].getText()) {
            txt.setText(s + "Win !");
            x = 1;
        }
        else
        if (Indexarray[2].getText() != ""
                && Indexarray[2].getText() == Indexarray[5].getText()
                && Indexarray[5].getText() == Indexarray[8].getText()) {
            txt.setText(s + "Win !");
            x = 1;
        }
        else
        if (Indexarray[0].getText() != ""
                && Indexarray[0].getText() == Indexarray[4].getText()
                && Indexarray[4].getText() == Indexarray[8].getText()) {
            txt.setText(s + "Win !");
            x = 1;
        } else if (Indexarray[2].getText() != ""
                && Indexarray[2].getText() == Indexarray[4].getText()
                && Indexarray[4].getText() == Indexarray[6].getText()) {
            txt.setText(s + "Win !");
            x = 1;
        }
        if (x == 1) {
            for (int i = 0; i < Indexarray.length; i++)
                Indexarray[i].setEnabled(false);

            Button loop1 = (Button) findViewById(R.id.Play);
            loop1.setVisibility((int)View.VISIBLE);

        }

        if(cunt>8){
            Button l = (Button) findViewById(R.id.Play);
            l.setVisibility((int)View.VISIBLE);
        }


    }
    public void tictac(View v){

        p=1;
        x=0;
        cunt=0;
        for(int i = 0 ;i < Indexarray.length;i++) {
            Indexarray[i].setEnabled(true); Indexarray[i].setText("");
        }
        txt.setText("1st play");Button loop1 = (Button) findViewById(R.id.Play);
        loop1.setVisibility((int) View.INVISIBLE);
    }

}
