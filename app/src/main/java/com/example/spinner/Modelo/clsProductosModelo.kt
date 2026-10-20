package com.example.spinner.Modelo

import com.example.spinner.InterfaceApi.RetrofitCliente

class clsProductosModelo {
    suspend fun obtenerProductosPorCategoria(categoriaId: Int): List<dataProductos> {
        return RetrofitCliente.apiService.obtenerProductos(categoriaId)
    }

    suspend fun obtenerDetalleProducto(productoId: Int): List<dataImagenesProducto> {
        return RetrofitCliente.apiService.detalleProducto(productoId)
    }
}