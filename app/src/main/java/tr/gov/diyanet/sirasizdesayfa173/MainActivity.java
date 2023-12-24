package tr.gov.diyanet.sirasizdesayfa173;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editText1=findViewById(R.id.editTextText1);
        EditText editText2=findViewById(R.id.editTextText2);
        Button button1=findViewById(R.id.button1);
        Button button2=findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selamVer(editText1.getText().toString());
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selamVer(editText1.getText().toString(),editText2.getText().toString());
            }
        });
    }
    private void selamVer(String isim){
        Toast.makeText(this, "Merhaba "+isim, Toast.LENGTH_SHORT).show();
    }
    private void selamVer(String isim,String soyisim){
        Toast.makeText(this, "İyi günler "+isim+" "+soyisim, Toast.LENGTH_SHORT).show();
    }
}