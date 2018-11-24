package com.example.chayaninsutjaritvanichpongse.myapplication;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.rengwuxian.materialedittext.MaterialEditText;

public class signupActivity extends AppCompatActivity {
    private static final String TAG = "SIGNUP ACTIVITY";
    TextView editemail, editpass, editaddress, editdebit;
    Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "OnCreate");
        setContentView(R.layout.activity_signup);
        editemail = findViewById(R.id.SignUpEm);
        editpass = findViewById(R.id.SignUpPas);
        editaddress = findViewById(R.id.SignUpAd);
        editdebit = findViewById(R.id.SignUpDebit);
        Button signup = findViewById(R.id.SignUpBut);
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference table_user = database.getReference("User");
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ProgressDialog mdialog=new ProgressDialog(signupActivity.this);
                mdialog.setMessage("Please wait....");
                mdialog.show();
                table_user.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        if(dataSnapshot.child(editemail.getText().toString()).exists())
                        {
                            mdialog.dismiss();
                            Toast.makeText(signupActivity.this,"Email is already register",Toast.LENGTH_SHORT).show();
                        }
                        else
                        {
                            mdialog.dismiss();
                            User user=new User(editemail.getText().toString(),editpass.getText().toString()
                                    ,editaddress.getText().toString(),editdebit.getText().toString());
                            table_user.child(editemail.getText().toString()).setValue(user);
                            Toast.makeText(signupActivity.this,"Sign up successfully",Toast.LENGTH_SHORT).show();
                            finish();
                        }

                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });




            }
        });


    }
}
