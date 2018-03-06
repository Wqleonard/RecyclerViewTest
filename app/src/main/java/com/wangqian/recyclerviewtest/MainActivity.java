package com.wangqian.recyclerviewtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
   private List<Fruit> fruitList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruit();
        RecyclerView recyclerView=findViewById(R.id.recycler_view);
        StaggeredGridLayoutManager layoutManager=new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);
//        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
//        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);
        FruitAdapter adapter=new FruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);
    }
    private String getRandomLengthName(String name){
        Random random=new Random();
        int length=random.nextInt(20)+1;
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<length;i++){
            builder.append(name);
        }
        return builder.toString();
    }
    private void initFruit(){
        for(int i=0;i<7;i++){
            Fruit apple=new Fruit(getRandomLengthName("Apple"),R.drawable.apple);
            Fruit oriange=new Fruit(getRandomLengthName("Oriange"),R.drawable.apple);
            Fruit juice=new Fruit(getRandomLengthName("Juice"),R.drawable.apple);
            Fruit banana=new Fruit(getRandomLengthName("Banana"),R.drawable.apple);
            fruitList.add(apple);
            fruitList.add(oriange);
            fruitList.add(juice);
            fruitList.add(banana);
        }
    }
}
