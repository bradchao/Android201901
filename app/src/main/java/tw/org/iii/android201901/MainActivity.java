package tw.org.iii.android201901;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashSet;
import java.util.TreeSet;

public class MainActivity extends AppCompatActivity {
    private TextView lottery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lottery = findViewById(R.id.lottery);
    }

    public void createLottery(View view){
        TreeSet<Integer> set = new TreeSet<>();
        while (set.size() < 6){
            set.add((int)(Math.random()*49+1));
        }
        lottery.setText(set.toString());
    }


}
