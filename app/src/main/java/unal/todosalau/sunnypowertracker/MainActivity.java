package unal.todosalau.sunnypowertracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private User user;
    private TextView textViewUsernameValue;
    private TextView textViewCurrentPowerOutputValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewUsernameValue = findViewById(R.id.textViewUsernameValue);
        textViewCurrentPowerOutputValue = findViewById(R.id.textViewCurrentPowerOutputValue);

        SolarPanelSystem solarPanelSystem = new SolarPanelSystem(100.0, 90.0);
        user = new User("User1", solarPanelSystem);

        updateUI();
    }

    private void updateUI() {
        textViewUsernameValue.setText(user.username);
        textViewCurrentPowerOutputValue.setText(String.format("%.2f kW", user.getSolarPanelSystem().getCurrentPowerOutput()));
    }
}