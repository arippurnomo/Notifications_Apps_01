package com.arippurnomo.notificationsapps;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class FeedbackFragment extends Fragment {

    private EditText mEditTextSub;
    private EditText mEditTextMsg;
    private EditText mEditTextTo;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View feedback = inflater.inflate(R.layout.fragment_feedback, container, false);


        mEditTextSub = feedback.findViewById(R.id.edit_text_subject);
        mEditTextMsg = feedback.findViewById(R.id.edit_text_message);
        mEditTextTo = feedback.findViewById(R.id.edit_text_to);
        mEditTextTo.setText(R.string.myemail);


        Button buttonSend = feedback.findViewById(R.id.btn_send);
        buttonSend.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // sendMail();
                String sendTo = mEditTextTo.getText().toString();
                String subject = mEditTextSub.getText().toString();
                String message = mEditTextMsg.getText().toString();

                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_SUBJECT, subject);
                intent.putExtra(Intent.EXTRA_TEXT, message);
                intent.putExtra(Intent.EXTRA_EMAIL,new String[] {sendTo});

                intent.setType("message/rfc822");
                startActivity(Intent.createChooser(intent, "Choose app to send mail"));

            }
        });

        return feedback;
    }

  /*  private void sendMail() {
        String sendTo = mEditTextTo.getText().toString();
        String subject = mEditTextSub.getText().toString();
        String message = mEditTextMsg.getText().toString();

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent.EXTRA_TEXT, message);
        intent.putExtra(Intent.EXTRA_EMAIL, sendTo);

        intent.setType("message/rfc822");
        startActivity(Intent.createChooser(intent, "Choose app to send mail"));
    }*/
}