package com.example.apison;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.example.apison.R;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    TextView responseText;
    RestInterface apiInterface;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.application_main);
        responseText = (TextView) findViewById(R.id.responseText);
        apiInterface = ApiClient.getClient().create(RestInterface.class);


        /**
         GET List Resources
         **/
        Call<MultipleResource> call = apiInterface.getDatum();
        call.enqueue(new Callback<MultipleResource>() {

            @Override
            public void onResponse(Call<MultipleResource> call, Response<MultipleResource> response) {
                Log.d("TAG",response.code()+"");

                String displayResponse = "";

                MultipleResource resource = response.body();
                List<MultipleResource.Datum> datumList = resource.data;

                for (MultipleResource.Datum datum : datumList) {
                    displayResponse += datum.id + " " + datum.careSetting + " " + datum.reasonCodeDisplay + " " + datum.organizationName + "\n";
                }

                responseText.setText(displayResponse);

            }

            @Override
            public void onFailure(Call<MultipleResource> call, Throwable t) {
                Log.d("TEST","FAILED");
                call.cancel();
            }
        });
    }
}