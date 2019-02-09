package com.mmb.moalertdialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MoAlertDialog {

    private Context context;
    private Activity activity;

    private Dialog dialog;

    private TextView dilog_title;
    private TextView dialog_content;
    private LinearLayout dilog_back;
    private LinearLayout dilog_back2;
    private LinearLayout dilog_header;
    private LinearLayout bg;
    private ImageView diolg_icon;
    private Button dilog_button;

    public MoAlertDialog(Context context) {
        this.context = context;
        activity = (Activity) context;
        dialog = new Dialog(context);
    }

    private void initViews() {
        dilog_title = dialog.findViewById(com.mmb.moalertdialog.R.id.dilog_title);
        dialog_content = dialog.findViewById(com.mmb.moalertdialog.R.id.dialog_content);
        dilog_back = dialog.findViewById(com.mmb.moalertdialog.R.id.dilog_back1);
        dilog_back2 = dialog.findViewById(com.mmb.moalertdialog.R.id.dilog_back2);
        bg = dialog.findViewById(com.mmb.moalertdialog.R.id.bg);
        dilog_header = dialog.findViewById(com.mmb.moalertdialog.R.id.dilog_header);
        diolg_icon = dialog.findViewById(com.mmb.moalertdialog.R.id.diolg_icon);
        dilog_button = dialog.findViewById(com.mmb.moalertdialog.R.id.dilog_button);
        dilog_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

    }

    public void showSuccessDialog(String dilogTitle, String dialogContent) {

        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE); // before
        dialog.setContentView(com.mmb.moalertdialog.R.layout.success_dialog);

        dialog.show();
        initViews();
        dilog_title.setText(dilogTitle);
        dialog_content.setText(dialogContent);

    }

    public void showErrorDialog(String dilogTitle, String dialogContent) {

        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE); // before
        dialog.setContentView(com.mmb.moalertdialog.R.layout.error_dialog);

        dialog.show();
        initViews();
        dilog_title.setText(dilogTitle);
        dialog_content.setText(dialogContent);

    }

    // set background colors
    public void setDialogHeaderColor(int color) {
        dilog_header.setBackgroundColor(color);
    }

    public void setDialogBackgroundColor(int color) {
        dilog_back.setBackgroundColor(color);
        dilog_back2.setBackgroundColor(color);
        bg.setBackgroundColor(color);
    }

    // Button Config methods
    public void setDialogButtonText(String text) {
        dilog_button.setText(text);
    }

    public void setDialogButtonBack(int backResource) {
        dilog_button.setBackgroundResource(backResource);
    }

    public void setDialogButtonTextColor(int color) {
        dilog_button.setTextColor(color);
    }

    // Tests Config methods
    public void setDialogTitleTextColor(int color) {
        dilog_title.setTextColor(color);
    }

    public void setDialogContentTextColor(int color) {
        dialog_content.setTextColor(color);
    }

    public void setDilogIcon(int vectorDrawble) {
        diolg_icon.setImageResource(vectorDrawble);
    }

    public void setDialogCancelable(boolean cancelable) {
        dialog.setCancelable(cancelable);
    }

    public void dismis() {
        dialog.dismiss();
    }

    public void setOnButtonClickListener(View.OnClickListener listener) {
        dilog_button.setOnClickListener(listener);
    }

    public void setDialogIconAnimation(Animation animation){
        diolg_icon.setAnimation(animation);
    }

}


