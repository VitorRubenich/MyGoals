package dev.rubenichvitor.mygoals.fragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import dev.rubenichvitor.mygoals.databinding.ItemTypesBinding;

public class TypeListAdapter extends RecyclerView.Adapter<TypeListAdapter.ViewHolder> {

    private final List<String> mList;

    private ItemTypesBinding binding;

    public TypeListAdapter(List<String> list){
        mList = list;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ItemTypesBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String name = mList.get(position);
        holder.binding.activityTypeName.setText(name);
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ItemTypesBinding binding;

        public ViewHolder(ItemTypesBinding itemTypesBinding){
            super(itemTypesBinding.getRoot());
            this.binding = itemTypesBinding;
        }

    }
}
