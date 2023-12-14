package com.example.myapplication4stableversion;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {
    private TabLayout tablayout;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        tablayout=findViewById(R.id.tab_lay);
        ViewPager2 viewpage2 = findViewById(R.id.view_pager_2);
        ArrayList<BackInterface> fragments = new ArrayList<>();
        fragments.add(new BackInterface() {
            @Override
            public Fragment back() {
                return new FirstFragment();
            }
        });
        fragments.add(() -> new SecondFragment());
        fragments.add(() -> new ThirdFragment());
        Adapter2 adapter = new Adapter2(this, fragments);
        viewpage2.setAdapter(adapter);

        new TabLayoutMediator(tablayout, viewpage2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                if(position == 0){
                    tab.setText("页面1");
                }else if(position == 1){
                    tab.setText("页面2");
                }else{
                    tab.setText("页面3");
                }
            }
        }).attach();
    }
}