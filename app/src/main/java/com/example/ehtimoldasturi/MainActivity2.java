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
            case 0: {

                textViewSelectedChapterName.setText("Tеоретиечская часть");

                modelRcyclers.add(new ModelRcycler("Тема 1. Основные понятия и определения.","https://github.com/asadbekakmedov2001/Ehtimol_dastur/raw/main/app/src/main/assets/tema1.docx"));
                modelRcyclers.add(new ModelRcycler("Тема 2. События и операции над ними.","https://github.com/asadbekakmedov2001/Ehtimol_dastur/raw/main/app/src/main/assets/tema2.docx"));
                modelRcyclers.add(new ModelRcycler("Тема 3. Понятие вероятности события, его классическое и статистическое определения.","https://github.com/asadbekakmedov2001/Ehtimol_dastur/raw/main/app/src/main/assets/tema3.docx"));
                modelRcyclers.add(new ModelRcycler("Тема 4. Геометрическое и аксиоматическое определения вероятности","https://github.com/asadbekakmedov2001/Ehtimol_dastur/raw/main/app/src/main/assets/tema4.docx"));
                modelRcyclers.add(new ModelRcycler("Тема 5. Теоремы сложения и умножения вероятностей.","https://github.com/asadbekakmedov2001/Ehtimol_dastur/raw/main/app/src/main/assets/tema5.docx"));
                modelRcyclers.add(new ModelRcycler("Тема 6. Формулы полной вероятности и Байеса","https://github.com/asadbekakmedov2001/Ehtimol_dastur/raw/main/app/src/main/assets/tema6.docx"));
                modelRcyclers.add(new ModelRcycler("Тема 7. Последовательность независимых испытаний. ","https://github.com/asadbekakmedov2001/Ehtimol_dastur/raw/main/app/src/main/assets/tema7.docx"));
                modelRcyclers.add(new ModelRcycler("Тема 8. Локальная и интегральная теоремы Лапласа","https://github.com/asadbekakmedov2001/Ehtimol_dastur/raw/main/app/src/main/assets/tema8.docx"));
                modelRcyclers.add(new ModelRcycler("Тема 9. Случайные величины. Понятие случайной величины. Виды случайных величин.","https://github.com/asadbekakmedov2001/Ehtimol_dastur/raw/main/app/src/main/assets/tema9.docx"));
                modelRcyclers.add(new ModelRcycler("Тема 10. Дискретные случайные величины. Закон распределения. Виды дискретных распределений","https://github.com/asadbekakmedov2001/Ehtimol_dastur/raw/main/app/src/main/assets/tema10.docx"));
                modelRcyclers.add(new ModelRcycler("Тема 11-12. Числовые характеристики дискретных случайных величин и их свойства","https://github.com/asadbekakmedov2001/Ehtimol_dastur/raw/main/app/src/main/assets/tema11_12.docx"));
                modelRcyclers.add(new ModelRcycler("Тема 13-14. Функции распределения и плотности непрерывных случайных величин, их свойства","https://github.com/asadbekakmedov2001/Ehtimol_dastur/raw/main/app/src/main/assets/tema13_14.docx"));
                modelRcyclers.add(new ModelRcycler("Тема 15-16. Числовые характеристики непрерывных случайных величин. Виды непрерывных распределений","https://github.com/asadbekakmedov2001/Ehtimol_dastur/raw/main/app/src/main/assets/tema15_16.docx"));
                modelRcyclers.add(new ModelRcycler("Тема 17. Закон больших чисел и его практическое значение. Понятие о центральной предельной теореме","https://github.com/asadbekakmedov2001/Ehtimol_dastur/raw/main/app/src/main/assets/tema17.docx"));

            }break;
            case 1: {

                textViewSelectedChapterName.setText("Практическая часть");

                modelRcyclers.add(new ModelRcycler("1. Основные понятия теории вероятностей","https://github.com/asadbekakmedov2001/Ehtimol_dastur/raw/main/app/src/main/assets/amaliy1.docx"));
                modelRcyclers.add(new ModelRcycler("2. Классические теоремы теории вероятностей","https://github.com/asadbekakmedov2001/Ehtimol_dastur/raw/main/app/src/main/assets/amaliy2.docx"));
                modelRcyclers.add(new ModelRcycler("3. Повторные независимые испытания","https://github.com/asadbekakmedov2001/Ehtimol_dastur/raw/main/app/src/main/assets/amaliy3.docx"));
                modelRcyclers.add(new ModelRcycler("4. Случайная величина. Закон распределения случайной величины. Функция распределения","https://github.com/asadbekakmedov2001/Ehtimol_dastur/raw/main/app/src/main/assets/amaliy4.docx"));
                modelRcyclers.add(new ModelRcycler("5. Числовые характеристики дискретных случайных величин","https://github.com/asadbekakmedov2001/Ehtimol_dastur/raw/main/app/src/main/assets/amaliy5.docx"));
                modelRcyclers.add(new ModelRcycler("6. Плотность распределения вероятностей и числовые характеристики непрерывных случайных величин","https://github.com/asadbekakmedov2001/Ehtimol_dastur/raw/main/app/src/main/assets/amaliy6.docx"));
                modelRcyclers.add(new ModelRcycler("7. Основные законы распределения непрерывных случайных величин","https://github.com/asadbekakmedov2001/Ehtimol_dastur/raw/main/app/src/main/assets/amaliy7.docx"));
                modelRcyclers.add(new ModelRcycler("8. Закон больших чисел","https://github.com/asadbekakmedov2001/Ehtimol_dastur/raw/main/app/src/main/assets/amaliy8.docx"));

            }break;
            case 3: {

                textViewSelectedChapterName.setText("Самостоятельная работа");

                modelRcyclers.add(new ModelRcycler("1. Самостоятельная работа","https://github.com/asadbekakmedov2001/Ehtimol_dastur/raw/main/app/src/main/assets/mus1.docx"));
                modelRcyclers.add(new ModelRcycler("2. Самостоятельная работа","https://github.com/asadbekakmedov2001/Ehtimol_dastur/raw/main/app/src/main/assets/mus2.docx"));
                modelRcyclers.add(new ModelRcycler("3. Самостоятельная работа","https://github.com/asadbekakmedov2001/Ehtimol_dastur/raw/main/app/src/main/assets/mus3.docx"));
                modelRcyclers.add(new ModelRcycler("4. Самостоятельная работа","https://github.com/asadbekakmedov2001/Ehtimol_dastur/raw/main/app/src/main/assets/mus4.docx"));
                modelRcyclers.add(new ModelRcycler("5. Самостоятельная работа","https://github.com/asadbekakmedov2001/Ehtimol_dastur/raw/main/app/src/main/assets/mus5.docx"));
                modelRcyclers.add(new ModelRcycler("6. Самостоятельная работа","https://github.com/asadbekakmedov2001/Ehtimol_dastur/raw/main/app/src/main/assets/mus6.docx"));
                modelRcyclers.add(new ModelRcycler("7. Самостоятельная работа","https://github.com/asadbekakmedov2001/Ehtimol_dastur/raw/main/app/src/main/assets/mus7.docx"));

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