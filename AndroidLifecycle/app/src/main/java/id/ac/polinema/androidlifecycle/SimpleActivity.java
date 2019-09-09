package id.ac.polinema.androidlifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class SimpleActivity extends AppCompatActivity {

    // Mendeklarasikan atribut dengan nama nameInput dengan tipe EditText
    private EditText nameInput;

    // Mendeklarasikan atribut dengan nama outputText dengan tipe TextView
    private TextView outputText;

    public void handleSubmit(View view) {
        String name = nameInput.getText().toString();
        outputText.setText("Hello " + name);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);
        nameInput = findViewById(R.id.input_name);
        outputText = findViewById(R.id.text_output);
    }


}
