package com.example.practica4;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView timerTextView;
    CountDownTimer countDownTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timerTextView = findViewById(R.id.timerTextView);
        startTimer();
    }

    private void startTimer() {
        countDownTimer = new CountDownTimer(5000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timerTextView.setText("Tiempo restante: " + millisUntilFinished / 1000 + " segundos");
            }

            @Override
            public void onFinish() {
                startActivity(new Intent(MainActivity.this, MainActivity2.class));
            }
        }.start();
    }
}
