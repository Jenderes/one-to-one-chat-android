package com.example.appchatgroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class ChatActivity extends AppCompatActivity {
    private String messageReceiverID,messageReceiverName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        messageReceiverID = getIntent().getExtras().get("visit_user_id").toString();
        messageReceiverName = getIntent().getExtras().get("visit_user_name").toString();

        Toast.makeText(this, messageReceiverID + "    " + messageReceiverName, Toast.LENGTH_SHORT).show();
    }
}