package it.com.a20230303_anilabazi_nycschools.ui.school.adapter;

import androidx.recyclerview.widget.RecyclerView;

import it.com.a20230303_anilabazi_nycschools.databinding.SchoolListItemBinding;

public class SchoolPagedViewHolder extends RecyclerView.ViewHolder {

    private SchoolListItemBinding itemBinding;

    SchoolPagedViewHolder(SchoolListItemBinding itemBinding) {
        super(itemBinding.getRoot());
        this.itemBinding = itemBinding;
    }

    void bind(SchoolViewModel schoolViewModel) {
        this.itemBinding.setViewModel(schoolViewModel);
    }

    public SchoolListItemBinding getItemBinding() {
        return itemBinding;
    }
}
