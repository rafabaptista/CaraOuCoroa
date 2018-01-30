package caraoucoroa.studio.com.caraoucoroa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView botaoJogarId;
    private String[] opcao = {"cara", "coroa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoJogarId = (ImageView)findViewById(R.id.botaoJogarId);

        botaoJogarId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random rdnMoeda = new Random();

                int numeroAleatorio = rdnMoeda.nextInt(2);

                Intent intentCaraCoroa = new Intent(MainActivity.this, DetalheActivity.class);
                intentCaraCoroa.putExtra("opcao", opcao[numeroAleatorio]);

                startActivity(intentCaraCoroa);

            }
        });
    }
}
