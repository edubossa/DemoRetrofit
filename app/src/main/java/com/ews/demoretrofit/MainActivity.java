package com.ews.demoretrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.ews.demoretrofit.adapter.CarroAdapter;
import com.ews.demoretrofit.adapter.OnItemClickListener;
import com.ews.demoretrofit.api.APICarros;
import com.ews.demoretrofit.api.APIUtils;
import com.ews.demoretrofit.model.Carro;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    public static final String LOG_TAG = "MainActivity";

    private RecyclerView recyclerView;
    private APICarros apiCarros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.recyclerView = (RecyclerView) findViewById(R.id.car_recycler);
        RecyclerView.LayoutManager layout = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        this.recyclerView.setLayoutManager(layout);
        apiCarros = APIUtils.getAPICarros();

        carregaDados();
    }

    OnItemClickListener listener = new OnItemClickListener() {
        @Override
        public void onClickListener(Carro carro) {
            Toast.makeText(getApplicationContext(), carro.getMarca(), Toast.LENGTH_LONG).show();
        }
    };

    public void carregaDados()  {

        //TODO enqueue usado para nao travar a Thread Main
        apiCarros.listarTodos().enqueue(new Callback<List<Carro>>() {
            @Override
            public void onResponse(Call<List<Carro>> call, Response<List<Carro>> response) {
                if (response.isSuccessful())
                    recyclerView.setAdapter(new CarroAdapter(response.body(), listener));
            }

            @Override
            public void onFailure(Call<List<Carro>> call, Throwable t) {
                Log.e(LOG_TAG, t.getMessage());
            }
        });

    }


}
