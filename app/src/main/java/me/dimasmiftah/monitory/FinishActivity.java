package me.dimasmiftah.monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/* Tanggal Pengerjaan : 7 Mei 2021
 * NIM                 : 10118087
 * Nama                : Dimas Miftahul Huda
 * Kelas               : IF-2
 */

public class FinishActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);

        String nickName = getIntent().getStringExtra(PersonalFormActivity.INPUT_NICKNAME);

        TextView textView = findViewById(R.id.finishTextMessage);
        String replace = textView.getText().toString().replace("kamu",nickName).replace("mu",nickName);
        textView.setText(String.valueOf(replace));
    }

    public void actFinish(View view) {
        finishAffinity();
        finishAndRemoveTask();
    }
}