package dev.rubenichvitor.mygoals.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import dev.rubenichvitor.mygoals.R;
import dev.rubenichvitor.mygoals.databinding.FragmentTypeListBinding;

public class TypeListFragment extends Fragment {

    private FragmentTypeListBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentTypeListBinding.inflate(inflater, container, false);
//        insertListeners();
        populateView();
        return binding.getRoot();
    }
    private void insertListeners(){
        binding.btnAddActivityType.setOnClickListener( v -> replaceFragment());
    }
    private void replaceFragment(){
        AddTypeFragment addTypeFragment = new AddTypeFragment();
        FragmentManager fragmentManager = getParentFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.fragment_container_view_tag, addTypeFragment)
                .commit();
    }

    private void populateView(){
        List<String> fakeList = Arrays.asList(
                "Riding", "Swimming", "Running"
                );

         //TODO mock list
        TypeListAdapter typeListAdapter = new TypeListAdapter(fakeList);
        binding.recyclerViewTypes.setLayoutManager(new LinearLayoutManager(binding.getRoot().getContext()));
        binding.recyclerViewTypes.setAdapter(typeListAdapter);
    }
}
