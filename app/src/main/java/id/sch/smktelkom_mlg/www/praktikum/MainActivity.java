package id.sch.smktelkom_mlg.www.praktikum;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editCelcius, editReamur, editKelvin;
    Button btnKonvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editCelcius = findViewById(R.id.editCelcius);
        editKelvin = findViewById(R.id.editKelvin);
        editReamur = findViewById(R.id.editReamur);
        btnKonvert = findViewById(R.id.btnKonvert);
    }

    public void konversisuhu(View view) {
        try {
            int nCelcius = Integer.parseInt(editCelcius.getText().toString());
            double nKelvin = nCelcius + 273;
            double nReamur = nCelcius * 0.8;

            editKelvin.setText(String.valueOf(nKelvin));
            editReamur.setText(String.valueOf(nReamur));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void keluar(View view) {
        System.exit(0);
    }
}

