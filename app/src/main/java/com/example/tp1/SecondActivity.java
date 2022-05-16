package com.example.tp1;

import android.content.Intent;
import android.util.Log;
import android.view.View;

public class SecondActivity {
    private static final String LOG_TAG = SecondActivity.class.getSimpleName();

    public void returnReply(View view) {
        String reply = mReply.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        Log.d(LOG_TAG, "End SecondActivity");
        finish();
    }
    }
