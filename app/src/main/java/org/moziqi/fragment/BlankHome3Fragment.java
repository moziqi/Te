package org.moziqi.fragment;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import moziqi.te.R;

/**
 * A simple {@link Fragment} subclass.
 *
 */
public class BlankHome3Fragment extends Fragment {


    public BlankHome3Fragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("BlankHome3Fragment", "onCreate");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("BlankHome3Fragment","onResume");
    }


    @Override
    public void onPause() {
        super.onPause();
        Log.e("BlankHome3Fragment","onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e("BlankHome3Fragment","onStop");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("BlankHome3Fragment","onDestroy");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank_home3, container, false);
    }


}
