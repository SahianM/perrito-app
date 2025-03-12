package cl.desafiolatam.perritoapp.api;

import java.util.List;

import cl.desafiolatam.perritoapp.model.Raza;
import retrofit2.Call;
import retrofit2.http.GET;

public interface RazaApi {

    @GET("api/breeds/list/all")
    Call<Raza> getAllBreeds();
}
