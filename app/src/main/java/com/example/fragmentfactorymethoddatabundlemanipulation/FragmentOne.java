package com.example.fragmentfactorymethoddatabundlemanipulation;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentOne extends Fragment {

    private static final String ARG_NAME ="name" ;
    private static final String ARG_NUMBER ="number" ;


    public static FragmentOne newInstance(String name, String number){
        FragmentOne fragOne= new FragmentOne();
        Bundle args=new Bundle();
        args.putString(ARG_NAME,name);
        args.putString(ARG_NUMBER,number);
        fragOne.setArguments(args);
        return fragOne;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_one,container,false);
        TextView name=v.findViewById(R.id.name);
        TextView number=v.findViewById(R.id.number);
        if (getArguments()!=null){
            name.setText(getArguments().getString(ARG_NAME));
            number.setText(getArguments().getString(ARG_NUMBER));
        }
        return v;
    }
}
