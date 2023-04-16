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
        modelRcyclers.add(new ModelRcycler(R.drawable.rasm1,"Тема 1. XVII ВЕК КАК КУЛЬТУРНАЯ ЭПОХА                         ","","https://github.com/asadbekakmedov2001/RuschaBir/raw/main/app/src/main/assets/%D0%A2%D0%B5%D0%BC%D0%B01.docx"));
        modelRcyclers.add(new ModelRcycler(R.drawable.rasm2,"Тема 2. БАРОККО В ЛИТЕРАТУРЕ ИСПАНИИ.ИСПАНСКАЯ ПОЭЗИЯ.         ","","https://github.com/asadbekakmedov2001/RuschaBir/raw/main/app/src/main/assets/%D0%A2%D0%B5%D0%BC%D0%B02.docx"));
        modelRcyclers.add(new ModelRcycler(R.drawable.rasm3,"Тема 3. ПРОЗА ИСПАНСКОГО БАРОККО                               ","","https://github.com/asadbekakmedov2001/RuschaBir/raw/main/app/src/main/assets/%D0%A2%D0%B5%D0%BC%D0%B03.docx"));
        modelRcyclers.add(new ModelRcycler(R.drawable.rasm4,"Тема 4. ДРАМАТУРГИЯ ИСПАНИИ. ТВОРЧЕСТВО ПЕДРО КАЛЬДЕРОН.       ","","https://github.com/asadbekakmedov2001/RuschaBir/raw/main/app/src/main/assets/%D0%A2%D0%B5%D0%BC%D0%B04.docx"));
        modelRcyclers.add(new ModelRcycler(R.drawable.rasm5,"Тема 5. ЛИТЕРАТУРА БАРОККО ВО ФРАНЦИИ.                         ","","https://github.com/asadbekakmedov2001/RuschaBir/raw/main/app/src/main/assets/%D0%A2%D0%B5%D0%BC%D0%B05.docx"));
        modelRcyclers.add(new ModelRcycler(R.drawable.rasm6,"Тема 6. ФРАНЦУЗСКОЙ ЛИТЕРАТУРЫ XVII ВЕКА.                      ","","https://github.com/asadbekakmedov2001/RuschaBir/raw/main/app/src/main/assets/%D0%A2%D0%B5%D0%BC%D0%B06.docx"));
        modelRcyclers.add(new ModelRcycler(R.drawable.rasm7,"Тема 7. ФРАНЦУЗСКИЙ ДРАМАТУРГИЯ. ТРАГЕДИЯ.                     ","","https://github.com/asadbekakmedov2001/RuschaBir/raw/main/app/src/main/assets/%D0%A2%D0%B5%D0%BC%D0%B07.docx"));
        modelRcyclers.add(new ModelRcycler(R.drawable.rasm8,"Тема 8. КОМЕДИИ МОЛЬЕРА.                                       ","","https://github.com/asadbekakmedov2001/RuschaBir/raw/main/app/src/main/assets/%D0%A2%D0%B5%D0%BC%D0%B08.docx"));
        modelRcyclers.add(new ModelRcycler(R.drawable.rasm9,"Тема 9. ПОЭЗИЯ ФРАНЦУЗСКОГО КЛАССИЦИЗМА.                       ","","https://github.com/asadbekakmedov2001/RuschaBir/raw/main/app/src/main/assets/%D0%A2%D0%B5%D0%BC%D0%B09.docx"));
        modelRcyclers.add(new ModelRcycler(R.drawable.rasm10,"Тема 10. АНГЛИЙСКАЯ ЛИТЕРАТУРА XVII ВЕКА.                      ","","https://github.com/asadbekakmedov2001/RuschaBir/raw/main/app/src/main/assets/%D0%A2%D0%B5%D0%BC%D0%B010.docx"));
        modelRcyclers.add(new ModelRcycler(R.drawable.rasm11,"Тема 11. НЕМЕЦКАЯ ЛИТЕРАТУРА XVII ВЕКА. ПОЭЗИЯ.                ","","https://github.com/asadbekakmedov2001/RuschaBir/raw/main/app/src/main/assets/%D0%A2%D0%B5%D0%BC%D0%B011.docx"));
        modelRcyclers.add(new ModelRcycler(R.drawable.rasm12,"Тема 12. НЕМЕЦКАЯ ДРАМАТУРГИЯ И ПРОЗА.                         ","","https://github.com/asadbekakmedov2001/RuschaBir/raw/main/app/src/main/assets/%D0%A2%D0%B5%D0%BC%D0%B012.docx"));
        modelRcyclers.add(new ModelRcycler(R.drawable.test_icon,"Тесты                                                          ","","https://github.com/asadbekakmedov2001/RuschaBir/raw/main/app/src/main/assets/%D0%A2%D0%B5%D1%81%D1%82%D1%8B.docx"));
        modelRcyclers.add(new ModelRcycler(R.drawable.images,"Глоссарий                                                      ","","https://github.com/asadbekakmedov2001/RuschaBir/raw/main/app/src/main/assets/glossary.docx"));

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void selectedUser(ModelRcycler modelRcycler) {


//
            startActivity(new Intent(getContext(), MainActivity3.class).putExtra("data",modelRcycler.getLoadUrl()));


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