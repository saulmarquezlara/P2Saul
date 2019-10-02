package SML.edu.TESOEM.TICS.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class frm2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm2);
    }
    public void siguiente2(View v) {
        Intent siguiente2 = new Intent(this, frm3Activity.class);
        startActivity(siguiente2);

    }
}
