package tom.ufpr.br.drinkmixer;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        int candId = 3;
        Intent it = getIntent();
        String[] candidatos = new String[]{"Albert Einstein \n(Partido dos Físicos)",
                "Nikola Tesla \n(Partido Energético)",
                "Alan Turing \n (Partido da Computação)"};
        Integer[] imageId = {
                R.drawable.albert,
                R.drawable.nikola,
                R.drawable.alan
        };

        EditText candBox = (EditText) findViewById(R.id.candEditText);
        ImageView imagem = (ImageView) findViewById(R.id.img);


        if(it!=null)
            candId = it.getIntExtra("idCand", 3);

        if(candId == 3) {
            candBox.setText("");
            Toast.makeText(this, "Candidato não encontrado.", Toast.LENGTH_LONG).show();
        } else {
            imagem.setImageResource(imageId[candId]);
            candBox.setText(candidatos[candId]);
        }
    }

    public void confirmaVoto() {
            Toast.makeText(this, "Voto confirmado!", Toast.LENGTH_LONG).show();
    }
}
