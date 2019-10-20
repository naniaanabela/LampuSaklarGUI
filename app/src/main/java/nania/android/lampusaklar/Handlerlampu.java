package nania.android.lampusaklar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Handlerlampu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handler);
    }

    public void ON(View view) {
        Intent intent = new Intent(this, Nyala.class);
        startActivity(intent);
    }

    public void OFF(View view) {
        Intent intent = new Intent(this, Mati.class);
        startActivity(intent);
    }
}
