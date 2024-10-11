package com.example.appantitristeza;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView tvShowNumero;
    private ImageView imvSmile;
    private Button btCliqueAqui;

    private final String TAG = "CLIQUE";
    private int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.tv_numero), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        tvShowNumero = findViewById(R.id.tv_shownumero);
        imvSmile = findViewById(R.id.imv_smile);
        btCliqueAqui = findViewById(R.id.bt_cliqueaqui);

        CountClick();

    }

    private void CountClick() {
        btCliqueAqui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                contador ++;
                tvShowNumero.setText( String.valueOf(contador) );

                switch (contador){
                    case 10:
                        imvSmile.setImageResource(R.drawable.smile02);
                        break;
                        case 20:
                            imvSmile.setImageResource(R.drawable.smile03);
                            break;
                            case 30:
                                imvSmile.setImageResource(R.drawable.smile04);
                                break;
                                case 40:
                                    imvSmile.setImageResource(R.drawable.smile05);
                                    break;
                                    case 50:
                                        imvSmile.setImageResource(R.drawable.smile06);
                                        break;
                                        case 60:
                                            imvSmile.setImageResource(R.drawable.smile07);
                                            break;
                                            case 70:
                                                imvSmile.setImageResource(R.drawable.smile08);
                                                break;
                                                case 80:
                                                    imvSmile.setImageResource(R.drawable.smile09);
                                                    break;
                                                    case 90:
                                                        imvSmile.setImageResource(R.drawable.smile10);
                                                        break;
                                                        case 100:
                                                            imvSmile.setImageResource(R.drawable.smile11);
                                                            break;
                }
            }
        });
    }

    public void ZerarTudo (View view){
        contador = 0;
        tvShowNumero.setText(String.valueOf(contador));
        imvSmile.setImageResource(R.drawable.smile01);
    }

}