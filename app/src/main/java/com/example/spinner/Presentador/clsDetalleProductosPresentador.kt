package com.example.spinner.Presentador

import com.example.spinner.DetalleProductoActivity
import com.example.spinner.Modelo.clsProductosModelo
import com.example.spinner.Modelo.dataImagenesProducto
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class clsDetalleProductoPresentador(private val vista: DetalleProductoActivity) {
    private val modelo = clsProductosModelo()

    fun cargarDetalle(productoId: Int) {
        CoroutineScope(Dispatchers.Main).launch {
            try {
                // Aquí se consume obtenerDetalleProducto del modelo
                val listaImagenes: List<dataImagenesProducto> = modelo.obtenerDetalleProducto(productoId)
                vista.mostrarImagenes(listaImagenes)
            } catch (e: Exception) {
                vista.mostrarError("Error al cargar detalle: " + e.localizedMessage)
            }
        }
    }
}