package com.alterdialog.pc.alterdialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import Dialog.AlertDialog;

public class MainActivity extends AppCompatActivity {
    AlertDialog transactionDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void showDialogMls() {
        if (transactionDialog != null && transactionDialog.isShowing()) return;

        transactionDialog = AlertDialog.create(this);
        transactionDialog
                .setTitleText(R.string.title_scan_not_success)
                .setType(R.string.label_title_dialog)
                .setRightButton(R.string.title_confirm_detail_qr_yes, new AlertDialog.ClickListener() {
                    @Override
                    public void onClick() {
                        transactionDialog.dismiss();

                    }
                })
                .setLeftButton(R.string.title_confirm_detail_qr_no, new AlertDialog.ClickListener() {
                    @Override
                    public void onClick() {
                        transactionDialog.dismiss();
                        finish();
                    }
                });
        if (transactionDialog != null && transactionDialog.isShowing()) {
            transactionDialog.dismiss();
        } else {
            transactionDialog.show();
        }
    }
}
