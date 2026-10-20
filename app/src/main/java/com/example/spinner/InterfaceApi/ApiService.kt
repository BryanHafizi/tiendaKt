package com.example.spinner.InterfaceApi

import com.example.spinner.Modelo.dataCategorias
import com.example.spinner.Modelo.dataImagenesProducto
import com.example.spinner.Modelo.dataProductos
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET( value = "obtener_categorias.php") //Este es el api en php
    suspend fun obtenerCategorias(): List<dataCategorias>

    // aqui agregamos lso EndPoints para el recycler y para la vista detalle
    @GET( value = "obtener_productos.php")
    suspend fun obtenerProductos(@Query( value = "categoria_id") categoriaId: Int): List<dataProductos>

    @GET( value = "detalle_producto.php")
    suspend fun detalleProducto(@Query( value = "producto_id") productoId: Int): List<dataImagenesProducto>
}
