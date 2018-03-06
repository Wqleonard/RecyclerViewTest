package com.wangqian.recyclerviewtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
   private List<Fruit> fruitList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruit();
        RecyclerView recyclerView=findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        FruitAdapter adapter=new FruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);
    }
    private void initFruit(){
        for(int i=0;i<7;i++){
            Fruit apple=new Fruit("Apple",R.drawable.apple);
            Fruit oriange=new Fruit("Oriange",R.drawable.apple);
            Fruit juice=new Fruit("Juice",R.drawable.apple);
            Fruit banana=new Fruit("Banana",R.drawable.apple);
            fruitList.add(apple);
            fruitList.add(oriange);
            fruitList.add(juice);
            fruitList.add(banana);
        }
    }
}
