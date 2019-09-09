package id.ac.polinema.tebakangka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

	//  TODO: deklarasikan variabel di sini
	private int genrand;
	private EditText guess;
	private Button guess_button;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// TODO: bind layout di sini
		this.guess = findViewById(R.id.number_input);
		this.guess_button = findViewById(R.id.guess_button);
		initRandomNumber();
	}

	// TODO: generate angka random di sini
	private void initRandomNumber() {
		Random number = new Random();
		this.genrand = number.nextInt(100 - 1) + 1;
	}

	public void handleGuess(View view) {
		// TODO: Tambahkan logika untuk melakukan pengecekan angka
		String input = this.guess.getText().toString();

		if (input.matches("")) {
			Toast.makeText(this, "Masukan Angka Terserah (1-100)!", Toast.LENGTH_SHORT).show();
		} else {
			int guess = Integer.parseInt(input);

			if (this.genrand == guess) {
				this.guess_button.setEnabled(false);
				Toast.makeText(this, R.string.right_answer, Toast.LENGTH_SHORT).show();
			} else if (guess < this.genrand) {
				Toast.makeText(this, R.string.lt_answer, Toast.LENGTH_SHORT).show();
			} else  {
				Toast.makeText(this, R.string.gt_answer, Toast.LENGTH_SHORT).show();
			}
		}
	}

	public void handleReset(View view) {
		// TODO: Reset tampilan
		this.guess.setText("");
		this.guess_button.setEnabled(true);
		this.initRandomNumber();
	}
}
