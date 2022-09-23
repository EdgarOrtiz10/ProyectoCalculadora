package com.example.proyectocalculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.proyectocalculadora.R;

public class MainActivity extends AppCompatActivity {

    TextView tvResultado;
    float numero1 = 0.0f;
    float numero2 = 0.0f;
    String operacion = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResultado = findViewById(R.id.tvResultado);

    }

    public void EscribirSiete(View view) {
        float valor  = Float.parseFloat(tvResultado.getText().toString());
        if (valor == 0.0f) {
            tvResultado.setText("7");
        } else {
            tvResultado.setText(tvResultado.getText() + "7");
        }
    }

    public void EscribirOcho(View view) {
        float valor = Float.parseFloat(tvResultado.getText().toString());
        if (valor == 0.0f) {
            tvResultado.setText("8");
        } else {
            tvResultado.setText(tvResultado.getText() + "8");
        }
    }

    public void EscribirNueve(View view) {
        float valor = Float.parseFloat(tvResultado.getText().toString());
        if (valor == 0.0f) {
            tvResultado.setText("9");
        } else {
            tvResultado.setText(tvResultado.getText() + "9");
        }
    }

    public void EscribirCuatro(View view) {
        float valor = Float.parseFloat(tvResultado.getText().toString());
        if (valor == 0.0f) {
            tvResultado.setText("4");
        } else {
            tvResultado.setText(tvResultado.getText() + "4");
        }
    }

    public void EscribirCinco(View view) {
        float valor = Float.parseFloat(tvResultado.getText().toString());
        if (valor == 0.0f) {
            tvResultado.setText("5");
        } else {
            tvResultado.setText(tvResultado.getText() + "5");
        }
    }

    public void EscribirSeis(View view) {
        float valor = Float.parseFloat(tvResultado.getText().toString());
        if (valor == 0.0f) {
            tvResultado.setText("6");
        } else {
            tvResultado.setText(tvResultado.getText() + "6");
        }
    }

    public void EscribirUno(View view) {
        float valor = Float.parseFloat(tvResultado.getText().toString());
        if (valor== 0.0f) {
            tvResultado.setText("1");
        } else {
            tvResultado.setText(tvResultado.getText() + "1");
        }
    }

    public void EscribirDos(View view) {
        float valor = Float.parseFloat(tvResultado.getText().toString());
        if (valor == 0.0f) {
            tvResultado.setText("2");
        } else {
            tvResultado.setText(tvResultado.getText() + "2");
        }
    }

    public void EscribirTres(View view) {
        float valor = Float.parseFloat(tvResultado.getText().toString());
        if (valor == 0.0f) {
            tvResultado.setText("3");
        } else {
            tvResultado.setText(tvResultado.getText() + "3");
        }
    }

    public void EscribirCero(View view) {
        float valor = Float.parseFloat(tvResultado.getText().toString());
        if (valor == 0.0f) {
            tvResultado.setText("0");
        } else {
            tvResultado.setText(tvResultado.getText() + "0");
        }
    }

    //Operaciones
    public void OperacionDividir(View view) {
        operacion = "/";
        GuadarNumero1(view);

    }

    public void OperacionMultiplicar(View view) {
        operacion = "*";
        GuadarNumero1(view);

    }

    public void OperacionResta(View view) {
        operacion = "-";
        GuadarNumero1(view);

    }

    public void OperacionSuma(View view) {
        operacion = "+";
        GuadarNumero1(view);


    }

    public void OperacionPorcentaje(View view) {
        operacion = "%";
        GuadarNumero1(view);


    }

    //Guadar valores
    public void GuadarNumero1(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        tvResultado.setText("0");
    }

    //Limpiar resultados
    public void LimpiarResultado(View view) {
        tvResultado.setText("0");
        numero1 = 0.0f;
        numero2 = 0.0f;
        operacion = "";
    }

    public void LimpiarUltimo(View view) {
        String text = tvResultado.getText().toString();
        tvResultado.setText(text.substring(0,text.length() - 1));
        numero1 = 0.0f;
        numero2 = 0.0f;
        operacion = "";


    }



    //Resultado
    public void MostrarResultado(View view) {
        numero2 = Float.parseFloat(tvResultado.getText().toString());
        if (operacion.equals("/")) {
            if (numero2 == 0.0f) {
                tvResultado.setText("0");
                Toast.makeText(this, "Operación no valida", Toast.LENGTH_LONG).show();
            } else {
                float result = numero1 / numero2;
                tvResultado.setText(result + "");
            }
        } else if (operacion.equals("*")) {
            float result = numero1 * numero2;
            tvResultado.setText(result + "");

        } else if (operacion.equals("+")) {
            float result = numero1 + numero2;
            tvResultado.setText(result + "");

        } else if (operacion.equals("-")) {
            float result = numero1 - numero2;
            tvResultado.setText(result + "");

        }else if (operacion.equals("%")) {
            float result = numero1 * 0.100f;
            tvResultado.setText(result + " ");
        }

        numero1 = 0.0f;
        numero2 = 0.0f;
        operacion = "";

    }


}






