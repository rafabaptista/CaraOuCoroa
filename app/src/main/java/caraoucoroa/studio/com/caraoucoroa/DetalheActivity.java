package caraoucoroa.studio.com.caraoucoroa;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DetalheActivity extends AppCompatActivity {

    private ImageView botaoVoltarId;
    private ImageView moedaId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

        botaoVoltarId = (ImageView)findViewById(R.id.botaoVoltarId);
        moedaId = (ImageView)findViewById(R.id.moedaId);

        Bundle opcaoCaraCoroa = getIntent().getExtras();

        if (opcaoCaraCoroa != null){

            String opcaoEscolhida = opcaoCaraCoroa.getString("opcao");

            if(opcaoEscolhida.equals("cara")){
                moedaId.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_cara));
            } else {
                moedaId.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_coroa));
            }
        }

        botaoVoltarId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DetalheActivity.this, MainActivity.class));
            }
        });

    }
}
