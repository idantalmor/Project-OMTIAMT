package com.example.omtiamt.Model;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.example.omtiamt.Login;
import com.example.omtiamt.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.List;

public class homePageFragment extends Fragment {
    List<String> catData;
    View view;
    FirebaseAuth mAuth;

    public homePageFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static homePageFragment newInstance(String param1, String param2) {
        homePageFragment fragment = new homePageFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mAuth = FirebaseAuth.getInstance();

        }
public void onStart() {
    super.onStart();
    FirebaseUser user = mAuth.getCurrentUser();
    if(user == null){
        startActivity(new Intent(homePageFragment.this.getContext(), Login.class));
    }
}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home_page, container, false);

        return inflater.inflate(R.layout.fragment_home_page, container, false);


    }

    }
