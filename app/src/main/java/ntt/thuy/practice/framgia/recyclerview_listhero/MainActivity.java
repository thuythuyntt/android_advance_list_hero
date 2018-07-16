package ntt.thuy.practice.framgia.recyclerview_listhero;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mListHero;
    private HeroAdapter mAdapter;
    private List<Hero> mHeroes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeView();
    }

    private void initializeView() {
        getArrayData();
        mListHero = findViewById(R.id.recycler_hero);
        mAdapter = new HeroAdapter(mHeroes);
        LinearLayoutManager lm = new LinearLayoutManager(this);
        lm.setOrientation(LinearLayoutManager.VERTICAL);
        mListHero.setLayoutManager(lm);
        mListHero.setAdapter(mAdapter);
    }

    private void getArrayData() {
        mHeroes = new ArrayList<>();
        mHeroes.add(new Hero(getString(R.string.name_1), R.drawable.antman));
        mHeroes.add(new Hero(getString(R.string.name_2), R.drawable.captain_america));
        mHeroes.add(new Hero(getString(R.string.name_3), R.drawable.deadpool));
        mHeroes.add(new Hero(getString(R.string.name_4), R.drawable.flash));
        mHeroes.add(new Hero(getString(R.string.name_5), R.drawable.ironman));
        mHeroes.add(new Hero(getString(R.string.name_6), R.drawable.spider_man));
        mHeroes.add(new Hero(getString(R.string.name_7), R.drawable.super_man));
        mHeroes.add(new Hero(getString(R.string.name_8), R.drawable.wolverine));
    }
}
