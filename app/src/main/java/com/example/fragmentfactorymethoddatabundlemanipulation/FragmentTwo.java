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

public class FragmentTwo extends Fragment {

    private static final String ARG_NAME ="name" ;
    private static final String ARG_NUMBER ="number" ;


    public static FragmentTwo newInstance(String name, String number){
        FragmentTwo fragTwo= new FragmentTwo();
        Bundle args=new Bundle();
        args.putString(ARG_NAME,name);
        args.putString(ARG_NUMBER,number);
        fragTwo.setArguments(args);
        return fragTwo;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_two,container,false);
        TextView name=v.findViewById(R.id.name);
        TextView number=v.findViewById(R.id.number);
        if (getArguments()!=null){
            name.setText(getArguments().getString(ARG_NAME));
            number.setText(getArguments().getString(ARG_NUMBER));
        }

        return v;
    }
}
