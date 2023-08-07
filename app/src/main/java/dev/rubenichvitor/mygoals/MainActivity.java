package dev.rubenichvitor.mygoals;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;

import dev.rubenichvitor.mygoals.databinding.ActivityDefaultNoMarginBinding;
import dev.rubenichvitor.mygoals.fragment.AddTypeFragment;
import dev.rubenichvitor.mygoals.fragment.TypeListFragment;

public class MainActivity extends AppCompatActivity {

    private ActivityDefaultNoMarginBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDefaultNoMarginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment();
    }

    private void replaceFragment(){
        TypeListFragment addTypeFragment = new TypeListFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.fragment_container_view_tag, addTypeFragment)
                .commit();
    }

    private void configureActionBar(){
        Toolbar tb = binding.toolbar;
        getSupportActionBar().setTitle("Inicio");
    }
}