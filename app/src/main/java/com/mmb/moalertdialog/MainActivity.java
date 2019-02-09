package com.mmb.moalertdialog;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MoAlertDialog dialog = new MoAlertDialog(this);
        dialog.showSuccessDialog("Success", "File has been uploaded!");
        dialog.setOnButtonClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Clicked!", Toast.LENGTH_SHORT).show();
            }
        });

        Animation logoMoveAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_in);
        dialog.setDialogIconAnimation(logoMoveAnimation);

    }

}
