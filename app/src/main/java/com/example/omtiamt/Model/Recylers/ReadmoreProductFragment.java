package com.example.omtiamt.Model.Recylers;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.omtiamt.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ReadmoreProductFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ReadmoreProductFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_readmore_product, container, false);
    }
}