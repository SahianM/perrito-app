package cl.desafiolatam.perritoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        /*
        RecyclerView dogsRecycleView = findViewById(R.id.dogList);
        RecyclerView.LayoutManager linearList = new LinearLayoutManager();
        dogsRecycleView.setLayoutManager(linearList);
        dogsRecycleView.setAdapter(// incorporar adaptador);
        */
    }
}
