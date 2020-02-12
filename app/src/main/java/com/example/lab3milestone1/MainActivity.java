package com.example.lab3milestone1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openDialog();
            }
        });
    }

    private void openDialog() {
        Lab3DialogFragment exampleDialog = new Lab3DialogFragment();
        exampleDialog.show(getSupportFragmentManager(), "example dialog");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.lab3_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                Toast.makeText(this, "Icon(Item 1)", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item2:
                Toast.makeText(this, "Item 2", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item3:
                Toast.makeText(this, "Item 3", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.subitem3_1:
                Toast.makeText(this, "Item 3.1", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.subitem3_2:
                Toast.makeText(this, "Item 3.2", Toast.LENGTH_SHORT).show();
                return true;

            default: return super.onOptionsItemSelected(item);
        }
    }
}
