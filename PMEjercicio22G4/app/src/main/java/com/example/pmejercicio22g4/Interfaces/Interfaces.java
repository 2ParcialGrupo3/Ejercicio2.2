package com.example.pmejercicio22g4.Interfaces;

import com.example.pmejercicio22g4.Models.Usuario;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Interfaces {

    String Ruta0 = "/posts";
    String Ruta1 = "/posts/{value}";

    @GET(Ruta0)
    Call<List<Usuario>> getUsuarios();

    @GET(Ruta1)
    Call<Usuario> getUsuario(@Path("value") String value);

}
