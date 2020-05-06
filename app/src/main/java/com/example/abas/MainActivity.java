package com.example.abas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.ViewParent;

import com.example.abas.Fragments.HomeFragment;
import com.example.abas.Fragments.InscricoesFragment;
import com.example.abas.Fragments.Test3Fragment;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

public class MainActivity extends AppCompatActivity {
   private SmartTabLayout smartTabLayout;
   private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     // remover a linha da action bar
        getSupportActionBar().setElevation(0);
        //criar as referencias
        smartTabLayout = findViewById(R.id.viewPagerTab);
        viewPager = findViewById(R.id.viewPager);

        //configurar adapter para abas
        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(),
                FragmentPagerItems.with(this)
                    .add("Home", HomeFragment.class)
                     .add("Incricoes", InscricoesFragment.class)
                     .add("test" , Test3Fragment.class)
                        .create()
        );

        //vamos fazer a configuração da view pager
        viewPager.setAdapter(adapter);
        smartTabLayout.setViewPager(viewPager);
    }
}
