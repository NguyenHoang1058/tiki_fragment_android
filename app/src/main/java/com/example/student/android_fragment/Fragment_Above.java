package com.example.student.android_fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import static android.R.attr.onClick;

/**
 * Created by Student on 10/15/2020.
 */

public class Fragment_Above extends Fragment {
    Button btnApplyDiscount;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_above, container, false);
            btnApplyDiscount = (Button) view.findViewById(R.id.btnApplyDiscount);
                btnApplyDiscount.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getActivity(), "Clicked", Toast.LENGTH_SHORT).show();
                    }
                });
        return view;
    }
}
