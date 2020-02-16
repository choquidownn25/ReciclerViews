package com.sipingenieria.prueba;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.Toast;

import com.sipingenieria.prueba.adapter.DataAdapter;
import com.sipingenieria.prueba.api.GetDataService;
import com.sipingenieria.prueba.api.RetrofitClientInstance;
import com.sipingenieria.prueba.modelo.SipIngenierium;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    //    private ArrayList<AndroidVersion> data;
    private ArrayList<SipIngenierium> data;
    List<SipIngenierium> servicioCats  = new ArrayList<>();
    ProgressDialog progressDoalog;
    private DataAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        progressDoalog = new ProgressDialog(MainActivity.this);
        progressDoalog.setMessage("Loading....");
        progressDoalog.show();
        setContentView(R.layout.activity_main);
        cargaJsonAutorizacion( );
    }


    private void cargaJsonAutorizacion( ){
        /*Crear un manejador para la interfaz RetrofitInstance*/
        GetDataService service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);
        Call<List<SipIngenierium>> call = service.getAllSipIngenierium();
        call.enqueue(new Callback<List<SipIngenierium>>() {

            @Override
            public void onResponse(Call<List<SipIngenierium>> call, Response<List<SipIngenierium>> response) {
                progressDoalog.dismiss();
                generateDataList(response.body());
            }

            @Override
            public void onFailure(Call<List<SipIngenierium>> call, Throwable t) {
                progressDoalog.dismiss();
                Toast.makeText(MainActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
            }
        });

    }

    /*Método para generar una lista de datos utilizando RecyclerView con un adaptador personalizado*/
    private void generateDataList(List<SipIngenierium> photoList) {
        recyclerView = findViewById(R.id.productList);
        adapter = new DataAdapter(this,photoList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}
