package com.example.omtiamt.Model.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.omtiamt.Model.Recylers.MySavedProductsListFragment;
import com.example.omtiamt.Model.Recylers.ProductByCategories;
import com.example.omtiamt.R;


public class ProductIWantFragment extends Fragment {
    View view;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.fragment_product_i_want, container, false);
        String Name = ProductIWantFragmentArgs.fromBundle(getArguments()).getName();
        //MySavedProductsListFragment fragment = (MySavedProductsListFragment) getChildFragmentManager().findFragmentById(R.id.productIwant);
        //fragment.SetmyName(Name);
        return view;
    }
}