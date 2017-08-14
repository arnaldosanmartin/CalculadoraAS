package co.edu.uninorte.calculadoraas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class segundo extends AppCompatActivity {
    TextView lector;
    int resultado = 0 , swp=0, swo=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        lector= (TextView) findViewById(R.id.textView);
    }

    public void digitar0(View view) {
        if(swp==1) {
            lector.setText(lector.getText() + "0");
        }else{
            lector.setText("0");
            swp=1;
        }
    }

    public void operar(View view) {
        if(swo==0){
            resultado= resultado + Integer.parseInt(lector.getText().toString());
            lector.setText(String.valueOf(resultado));
        }else{
            if(swo==1) {
                resultado = resultado - Integer.parseInt(lector.getText().toString());
                lector.setText(String.valueOf(resultado));
            }else {
                lector.setText(String.valueOf(resultado));
            }
        }
        swp=0;
    }

    public void digitar3(View view) {
        if(swp==1) {
            lector.setText(lector.getText() + "3");
        }else{
            lector.setText("3");
            swp=1;
        }
    }

    public void digitar2(View view) {
        if(swp==1) {
            lector.setText(lector.getText() + "2");
        }else{
            lector.setText("2");
            swp=1;
        }
    }

    public void digitar1(View view) {
        if(swp==1) {
            lector.setText(lector.getText() + "1");
        }else{
            lector.setText("1");
            swp=1;
        }
    }

    public void restar(View view) {
        resultado=Integer.parseInt(lector.getText().toString());
        swo=1;
        swp=0;
    }

    public void digitar6(View view) {
        if(swp==1) {
            lector.setText(lector.getText() + "6");
        }else{
            lector.setText("6");
            swp=1;
        }
    }

    public void digitar5(View view) {
        if(swp==1) {
            lector.setText(lector.getText() + "5");
        }else{
            lector.setText("5");
            swp=1;
        }
    }

    public void digitar4(View view) {
        if(swp==1) {
            lector.setText(lector.getText() + "4");
        }else{
            lector.setText("4");
            swp=1;
        }
    }

    public void sumar(View view) {
        resultado=Integer.parseInt(lector.getText().toString());
        swo=0;
        swp=0;
    }

    public void digitar7(View view) {
        if(swp==1) {
            lector.setText(lector.getText() + "7");
        }else{
            lector.setText("7");
            swp=1;
        }
    }

    public void digitar8(View view) {
        if(swp==1) {
            lector.setText(lector.getText() + "8");
        }else{
            lector.setText("8");
            swp=1;
        }
    }

    public void digitar9(View view) {
        if(swp==1) {
            lector.setText(lector.getText() + "9");
        }else{
            lector.setText("9");
            swp=1;
        }
    }

    public void borrar(View view) {
        resultado=0;
        lector.setText(String.valueOf(resultado));
        swo=2;
        swp=0;
    }
}
