package com.vicram.barcastore;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ContactFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_contact, container, false);

        TextView contactInfo = view.findViewById(R.id.contactInfo);
        contactInfo.setText("Alamat: Camp Nou, Barcelona, Spanyol\n" +
                "Email: @barcastore.com\n" +
                "Telepon: +34 123 456 789");

        return view;
    }
}
