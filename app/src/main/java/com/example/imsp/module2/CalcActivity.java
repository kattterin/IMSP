package com.example.imsp.module2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.imsp.R;

public class CalcActivity extends AppCompatActivity {
    EditText et1;
    EditText et2;
    EditText et3;
    EditText et4;
    Button BtnPlus;
    Button BtnMinus;
    Button BtnMulp;
    Button BtnDivi;
    TextView Tvden;
    TextView Tvnum;
    Fraction f1 = new Fraction(0, 1);
    Fraction f2 = new Fraction(0, 1);


    public void readv() {
        int a = Integer.parseInt(et1.getText().toString());
        int b = Integer.parseInt(et2.getText().toString());
        int a2 = Integer.parseInt(et3.getText().toString());
        int b2 = Integer.parseInt(et4.getText().toString());
        this.f1 = new Fraction(a, b);
        this.f2 = new Fraction(a2, b2);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc); // ФОРМА КАЛЬКУЛЯТОРА
//        Toast.makeText(this, "on create", Toast.LENGTH_SHORT).show();
        et1 = this.findViewById(R.id.et1);
        et2 = this.findViewById(R.id.et2);
        et3 = this.findViewById(R.id.et3);
        et4 = this.findViewById(R.id.et4);
        Tvden = this.findViewById(R.id.Tvden);
        Tvnum = this.findViewById(R.id.Tvnum);

        BtnPlus = this.findViewById(R.id.BtnPlus);
        BtnMinus = this.findViewById(R.id.BtnMinus);
        BtnMulp = this.findViewById(R.id.BtnMulp);
        BtnDivi = this.findViewById(R.id.BtnDivi);
        BtnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                readv();
                Fraction sum = f1.add(f2);
                show(sum);
            }

        });
        BtnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                readv();
                Fraction difference = f1.sub(f2);
                show(difference);

//                Toast.makeText(CalcActivity.this, difference.toString(), Toast.LENGTH_SHORT).show();
            }
        });

        BtnMulp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                readv();
                Fraction mulp = f1.mulp(f2);
                show(mulp);
            }
        });

        BtnDivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                readv();
                Fraction divi = f1.divi(f2);
                show(divi);
            }
        });
    }

    private void show(Fraction sum) {
        if (sum.getDenomirator() == 1) {
            Tvnum.setText(String.valueOf(sum.getNumerator()));
        } else {
            Tvnum.setText(String.valueOf(sum.getNumerator()));
            Tvden.setText(sum.getDenomirator() + " ");
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "on start", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "on pause", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "on resume", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "on destroy", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "on stop", Toast.LENGTH_SHORT).show();

    }
}
