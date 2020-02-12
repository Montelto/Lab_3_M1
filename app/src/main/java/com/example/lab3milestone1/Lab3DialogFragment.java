package com.example.lab3milestone1;

import android.app.Dialog;
import android.os.Bundle;
import android.app.AlertDialog;
import android.content.DialogInterface;

import androidx.appcompat.app.AppCompatDialogFragment;

public class Lab3DialogFragment extends AppCompatDialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Information")
                .setMessage("This is a Dialog")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
        return builder.create();
    }
}
