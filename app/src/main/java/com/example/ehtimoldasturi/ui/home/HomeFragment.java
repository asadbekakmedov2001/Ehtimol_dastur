package com.example.ehtimoldasturi.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.ehtimoldasturi.MainActivity2;
import com.example.ehtimoldasturi.MainActivity3;
import com.example.ehtimoldasturi.R;
import com.example.ehtimoldasturi.databinding.FragmentHomeBinding;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment implements UserAdapter.SelectedUser {

    private FragmentHomeBinding binding;

    RecyclerView recyclerView;
    List<ModelRcycler> modelRcyclers = new ArrayList<>();
    UserAdapter userAdapter;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // ruyhatni eloni va sozlanmasi
        recyclerView = root.findViewById(R.id.recyclerView1);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(requireContext(),0));

        initial();

        userAdapter  = new UserAdapter(modelRcyclers,  this);
        recyclerView.setAdapter(userAdapter);

        return root;
    }

    private void initial() {
        modelRcyclers.add(new ModelRcycler(R.drawable.rasm1,"Tеоретиечская часть                                             ","",""));
        modelRcyclers.add(new ModelRcycler(R.drawable.rasm2,"Практическая часть                                              ","",""));
        modelRcyclers.add(new ModelRcycler(R.drawable.rasm3,"Приложение                                                        ","","https://github.com/asadbekakmedov2001/Ehtimol_dastur/raw/main/app/src/main/assets/ilova.docx"));
        modelRcyclers.add(new ModelRcycler(R.drawable.test_icon,"Тесты                                                          ","","https://github.com/asadbekakmedov2001/Ehtimol_dastur/raw/main/app/src/main/assets/test.docx"));
        modelRcyclers.add(new ModelRcycler(R.drawable.images,"Глоссарий                                                      ","","https://github.com/asadbekakmedov2001/Ehtimol_dastur/raw/main/app/src/main/assets/glossary.doc"));

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void selectedUser(ModelRcycler modelRcycler) {


//
        if (modelRcycler.getLessonName().toLowerCase().startsWith("приложение") ||
                modelRcycler.getLessonName().toLowerCase().startsWith("тесты") ||
                modelRcycler.getLessonName().toLowerCase().startsWith("глоссарий")
        ){
//
            startActivity(new Intent(getContext(), MainActivity3.class).putExtra("data",modelRcycler.getLoadUrl()));
        }
        else {
            startActivity(new Intent(getContext(), MainActivity2.class).putExtra("swimmers",modelRcyclers.indexOf(modelRcycler)));
        }

    }

//    @Override
//    public void onPause() {
//        super.onPause();
//        modelRcyclers.clear();
//    }

    @Override
    public void onStart() {
        super.onStart();
        modelRcyclers.clear();
        initial();
    }
}