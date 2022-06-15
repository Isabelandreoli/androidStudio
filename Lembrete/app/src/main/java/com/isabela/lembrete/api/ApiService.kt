package com.isabela.lembrete.api

import com.isabela.lembrete.model.Categoria
import com.isabela.lembrete.model.Tarefa
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {

    @GET("categoria")
    suspend fun listCategoria(): Response<List<Categoria>>

    @POST("tarefa")
    suspend fun addTarefa(
        @Body tarefa : Tarefa
    ): Response<Tarefa>

    @GET("tarefa")
    suspend fun listTarefa(): Response<List<Tarefa>>

}