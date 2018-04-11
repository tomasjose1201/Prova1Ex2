package tom.ufpr.br.drinkmixer;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MasterActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_master);

        String[] candidatos = new String[]{"Albert Einstein \n(Partido dos Físicos)",
                "Nikola Tesla \n(Partido Energético)",
                "Alan Turing \n (Partido da Computação)"};
        ArrayAdapter<String> array = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, candidatos);
        setListAdapter(array);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);
        Intent it = new Intent(this, DetailActivity.class);
        it.putExtra("idCand", position);
        startActivity(it);
    }
}
