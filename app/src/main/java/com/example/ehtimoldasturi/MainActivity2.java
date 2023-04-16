package com.example.ehtimoldasturi;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity2 extends AppCompatActivity implements UserAdapterAC2.SelectedUser {

    Toolbar toolbar;
    RecyclerView recyclerView;
    List<ModelRcycler> modelRcyclers = new ArrayList<>();
    TextView textViewSelectedChapterName;

    int getChemgeItemPosition;


    ConstraintLayout constraintLayout;
    UserAdapterAC2 userAdapter;
    ImageView imageViewc2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        imageViewc2 = findViewById(R.id.imageViewac2);

        // ruyhatni eloni va sozlanmasi
        recyclerView = findViewById(R.id.recyclerView1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));

        // tool bar sozlanmasi
//        toolbar = findViewById(R.id.toolBAr);
//        this.setSupportActionBar(toolbar);
        this.getSupportActionBar().setTitle("");
        // tanlangan chapter nomini activity2 da sarlavhaga yozish
        textViewSelectedChapterName = findViewById(R.id.textViewSelectedChapterName);
        getChemgeItemPosition = intent.getIntExtra("swimmers",1);

        //backround uchun liner layoutni aniqlash
        constraintLayout = findViewById(R.id.constraintLayout1);
        constraintLayout.setBackgroundColor(getResources().getColor(R.color.mycolor));

        switch (getChemgeItemPosition){
            case 1: {

                textViewSelectedChapterName.setText("Tеоретиечская часть");

                modelRcyclers.add(new ModelRcycler("Тема 1. Основные понятия и определения.",""));
                modelRcyclers.add(new ModelRcycler("Тема 2. События и операции над ними.",""));
                modelRcyclers.add(new ModelRcycler("Тема 3. Понятие вероятности события, его классическое и статистическое определения.",""));
                modelRcyclers.add(new ModelRcycler("Тема 4. Геометрическое и аксиоматическое определения вероятности",""));
                modelRcyclers.add(new ModelRcycler("Тема 5. Теоремы сложения и умножения вероятностей.",""));
                modelRcyclers.add(new ModelRcycler("Тема 6. Формулы полной вероятности и Байеса",""));
                modelRcyclers.add(new ModelRcycler("Тема 7. Последовательность независимых испытаний. ",""));
                modelRcyclers.add(new ModelRcycler("Тема 8. Локальная и интегральная теоремы Лапласа",""));
                modelRcyclers.add(new ModelRcycler("Тема 9. Случайные величины. Понятие случайной величины. Виды случайных величин.",""));
                modelRcyclers.add(new ModelRcycler("Тема 10. Дискретные случайные величины. Закон распределения. Виды дискретных распределений",""));
                modelRcyclers.add(new ModelRcycler("Тема 11-12. Числовые характеристики дискретных случайных величин и их свойства",""));
                modelRcyclers.add(new ModelRcycler("Тема 13-14. Функции распределения и плотности непрерывных случайных величин, их свойства",""));
                modelRcyclers.add(new ModelRcycler("Тема 15-16. Числовые характеристики непрерывных случайных величин. Виды непрерывных распределений",""));
                modelRcyclers.add(new ModelRcycler("Тема 17. Закон больших чисел и его практическое значение. Понятие о центральной предельной теореме",""));

            }break;
            case 2: {

                textViewSelectedChapterName.setText("Практическая часть");

                modelRcyclers.add(new ModelRcycler("1. Основные понятия теории вероятностей",""));
                modelRcyclers.add(new ModelRcycler("2. Классические теоремы теории вероятностей",""));
                modelRcyclers.add(new ModelRcycler("3. Повторные независимые испытания",""));
                modelRcyclers.add(new ModelRcycler("4. Случайная величина. Закон распределения случайной величины. Функция распределения",""));
                modelRcyclers.add(new ModelRcycler("5. Числовые характеристики дискретных случайных величин",""));
                modelRcyclers.add(new ModelRcycler("6. Плотность распределения вероятностей и числовые характеристики непрерывных случайных величин",""));
                modelRcyclers.add(new ModelRcycler("7. Основные законы распределения непрерывных случайных величин",""));
                modelRcyclers.add(new ModelRcycler("8. Закон больших чисел",""));

            }break;
        }

        userAdapter  = new UserAdapterAC2(modelRcyclers,  this);
        recyclerView.setAdapter(userAdapter);
    }

    @RequiresApi(api = Build.VERSION_CODES.P)
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu1,menu);
        MenuItem menuItem = menu.findItem(R.id.search_view);

        SearchView searchView = (SearchView)menuItem.getActionView();
        searchView.setMaxWidth(Integer.MAX_VALUE);


        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                userAdapter.getFilter().filter(newText);
                return true;
            }
        });
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id   = item.getItemId();
        if (id == R.id.search_view) return true;
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void selectedUser(ModelRcycler modelRcycler) {
        startActivity(new Intent(MainActivity2.this, MainActivity3.class).putExtra("data",modelRcycler.getLoadUrl()));
    }
}