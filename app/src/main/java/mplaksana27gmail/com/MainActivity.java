package mplaksana27gmail.com;

import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
//TODO: membuat tobol button
    Button bt1;
    Button bt2;
    EditText t2;
    EditText t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activty_main);

        bt1=(Button)findViewById(R.id.button);
        bt2=(Button)findViewById(R.id.button2);
        t2=(EditText)findViewById(R.id.editText2);
        t3=(EditText)findViewById(R.id.editText5);

        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
    }
    public void onClick(View v) {
        //TODO 5 : didalam onClick dibuat swicth dimana v adalah untuk menentukan tombol mana yang telah diclick
        switch (v.getId()){
            case (R.id.button):
                //TODO 6 : contoh jika tombol yang diklik merupakan komponen tombol dengan id button maka program akan menjalankan baris kode pada case R.id.button
                if ((t2.getText().toString().trim().toLowerCase()).equals("Bisri".toLowerCase()) && (t3.getText().toString().toLowerCase()).equals("165410054".toLowerCase())){
                    //TODO 7 : mengambil nilai dari edit text nama dan passord kemudian menyamakan kedua value tersebut berturut turut dengan nama dan NIM mahasiswa secara HardCode
                    Intent log = new Intent(MainActivity.this, ListActivity.class);
                    //TODO 8 : membuat intent untuk menuju  ListActivity
                    startActivity(log);
                    //TODO 9 : memulai intent yang menjalankan ListActivity
                }else {
                    Toast.makeText(getApplicationContext(),"Maaf Nama dan Password tidak benar",Toast.LENGTH_LONG).show();
                }
                break;
            case (R.id.button2):
                //TODO 10 : cara kerja yang hampir sma untuk case lainya
                Intent reg = new Intent(MainActivity.this, registrasy.class);
                startActivity(reg);
                break;
        }
    }
}
