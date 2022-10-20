package com.example.clase08;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MenuActivity1 extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menyactivity1,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.favorite:
                Toast.makeText(this, "Corazon", Toast.LENGTH_SHORT).show();
            case R.id.search:
                Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}