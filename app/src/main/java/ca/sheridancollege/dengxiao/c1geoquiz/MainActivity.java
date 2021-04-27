package ca.sheridancollege.dengxiao.c1geoquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import ca.sheridancollege.dengxiao.c1geoquiz.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private Button btnTrue;
    private Button btnFalse;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //binding
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        btnTrue = binding.btnTrue;
        btnFalse = binding.btnFalse;

        btnTrue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //click true button, then
                Toast.makeText(MainActivity.this,R.string.correct_toast, Toast.LENGTH_LONG).show();
            }
        });

        btnFalse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //click false button, then
                Toast.makeText(MainActivity.this,R.string.incorrect_toast, Toast.LENGTH_LONG).show();
            }
        });

    }
}