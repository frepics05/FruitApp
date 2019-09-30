package com.example.mengenalbuah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

public class MenuScreen extends AppCompatActivity {

    private MovieAdapter movieAdapter;
    RecyclerView rvMain;
    ArrayList<ModelMovie> arrayList;

    private String[] id = {"1", "2", "3", "4", "5", "6", "7","8","9","10"};
    private String[] judulBuah = {"1. Jeruk", "2. Nanas", "3. Pear", "4. Anggur", "5. Semangka", "6. Strawberry", "7. Apel","8. Kiwi","9. Ceri","10. Alpukat"};
    private String[] subJudulBuah = {"Buah Impor", "Buah Impor", "Buah Impor", "Buah Impor", "Buah Impor", "Buah Impor", "Buah Impor","Buah Impor","Buah Impor","Buah Impor"};
    private int[] logo = {R.drawable.jeruk, R.drawable.nanas,R.drawable.pear,R.drawable.anggur,R.drawable.semangka,R.drawable.strawberry,R.drawable.apel,R.drawable.kiwi,R.drawable.ceri,R.drawable.alpukat};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_screen);

        arrayList = new ArrayList<>();
        rvMain = findViewById(R.id.rvMain);
        setData();
        rvMain.setHasFixedSize(true);
        movieAdapter = new MovieAdapter(arrayList);
        rvMain.setLayoutManager(new LinearLayoutManager(this));
        rvMain.setAdapter(movieAdapter);

    }

    private void setData(){
        int count = 0;
        for (String id : id){
            arrayList.add(new ModelMovie(id, judulBuah[count], subJudulBuah[count], logo[count]));
            count++;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_bar, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.about:
                startActivity(new Intent(MenuScreen.this, AboutActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }
}
