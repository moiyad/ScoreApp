package course.elm.apllicationweek2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView Score;
    TextView Score2;
    TextView faull;
    TextView faull2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         Score = (TextView) findViewById(R.id.score);
         Score2 = (TextView) findViewById(R.id.score2);
         faull =(TextView)findViewById(R.id.faull);
        faull2 =(TextView)findViewById(R.id.faull2);
    }

    public void point3(View view) {
        int t = Integer.parseInt(Score.getText().toString());
        t = t + 3;
        Score.setText(String.valueOf(t));

    }

    public void point2(View view) {
        int t = Integer.parseInt(Score.getText().toString());
        t = t + 2;
        Score.setText(String.valueOf(t));
    }

    public void point1(View view) {
        int t = Integer.parseInt(Score.getText().toString());
        t++;
        Score.setText(String.valueOf(t));
    }

    public void reset(View view) {
        int t = Integer.parseInt(Score.getText().toString());
        int n = Integer.parseInt(Score2.getText().toString());
        int f = Integer.parseInt(faull.getText().toString());
        int d = Integer.parseInt(faull2.getText().toString());

        t = 0;
        n = 0;
        f = 0;
        d = 0;
        Score.setText(String.valueOf(t));
        Score2.setText(String.valueOf(n));
        faull.setText(String.valueOf(f));
        faull2.setText(String.valueOf(d));

    }

    public void point3t2(View view) {
        int t = Integer.parseInt(Score2.getText().toString());
        t = t + 3;
        Score2.setText(String.valueOf(t));

    }

    public void point2t2(View view) {
        int t = Integer.parseInt(Score2.getText().toString());
        t = t + 2;
        Score2.setText(String.valueOf(t));
    }

    public void point1t2(View view) {
        int t = Integer.parseInt(Score2.getText().toString());
        t++;
        Score2.setText(String.valueOf(t));
    }
    public void faull (View view){
        int t=Integer.parseInt(faull.getText().toString());
        t++;
        faull.setText(String.valueOf(t));
    }
    public void faull2 (View view){
        int t=Integer.parseInt(faull2.getText().toString());
        t++;
        faull2.setText(String.valueOf(t));

    }


    }

