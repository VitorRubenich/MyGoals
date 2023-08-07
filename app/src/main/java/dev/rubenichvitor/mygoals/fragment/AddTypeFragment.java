package dev.rubenichvitor.mygoals.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import dev.rubenichvitor.mygoals.databinding.FragmentAddTypeActivityBinding;

public class AddTypeFragment extends Fragment {

    private FragmentAddTypeActivityBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentAddTypeActivityBinding.inflate(inflater, container, false);
        insertListeners();
        return binding.getRoot();
    }

    private void insertListeners(){
        binding.btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(binding.inputTypeActivity.getEditText().getText().toString() != ""){
                    //TODO CADASTRAR
                    callToast();
                }
            }
        });
    }

    private void callToast(){
        Toast.makeText(binding.getRoot().getContext(), "Cadastrado", Toast.LENGTH_LONG).show();
    }
}
