package com.utn.TpJPAGarciaZacarias;

import com.utn.TpJPAGarciaZacarias.entidades.*;
import com.utn.TpJPAGarciaZacarias.enumeraciones.*;
import com.utn.TpJPAGarciaZacarias.repositorios.ClienteRepository;
import com.utn.TpJPAGarciaZacarias.repositorios.ProductoRepository;
import com.utn.TpJPAGarciaZacarias.repositorios.RubroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class TpJpaGarciaZacariasApplication {
	@Autowired
	RubroRepository rubroRepository;
	@Autowired
	ClienteRepository clienteRepository;

	public static void main(String[] args) {
		SpringApplication.run(TpJpaGarciaZacariasApplication.class, args);
		System.out.println("Funciono");
	}
	@Bean
	public CommandLineRunner init() {
		return args -> {
			// Código a ejecutar después de la inicialización de la aplicación
			System.out.println("La aplicación se ha iniciado. Realizando tareas iniciales...");
			Rubro rubro1 = Rubro.builder()
					.denominacion("Hamburguesas")
					.build();
			Producto producto1 = Producto.builder()
					.tiempoEstimadoCocina(60)
					.denominacion("Hamburguesa con Cheddar")
					.precioVenta(2000)
					.precioCompra(1200)
					.stockActual(50)
					.stockMinimo(3)
					.unidadMedida("unidad1")
					.receta("receta1")
					.tipo(TipoProducto.Insumo)
					.build();
			Producto producto2 = Producto.builder()
					.tiempoEstimadoCocina(60)
					.denominacion("Hamburguesa con Baccon")
					.precioVenta(2200)
					.precioCompra(1500)
					.stockActual(32)
					.stockMinimo(4)
					.unidadMedida("unidad2")
					.receta("receta2")
					.tipo(TipoProducto.Insumo)
					.build();
			rubro1.agregarProducto(producto1); //agrega los productos al rubro
			rubro1.agregarProducto(producto2);
			rubroRepository.save(rubro1); //guardar el rubro
			Cliente cliente1 = Cliente.builder() //crear cliente
					.nombre("Zacarias")
					.apellido("Garcia")
					.mail("zgarcia@mail")
					.telefono("2615780281")
					.build();
			Domicilio domicilio1 = Domicilio.builder() //Crear instancia domicilio
					.calle("Antenor Riveros")
					.numero(2473)
					.localidad("Maipu")
					.build();
			Domicilio domicilio2 = Domicilio.builder()
					.calle("Yatay")
					.numero(1223)
					.localidad("Guaymallen")
					.build();
			cliente1.agregarDomicilio(domicilio1); //agrega los domicilios del cliente
			cliente1.agregarDomicilio(domicilio2);
			DetallePedido detallePedido1 = DetallePedido.builder() //Crea Instancia Detalle Pedido
					.cantidad(5)
					.subtotal(5482)
					.build();
			DetallePedido detallePedido2 = DetallePedido.builder()
					.cantidad(7)
					.subtotal(5580)
					.build();
			DetallePedido detallePedido3 = DetallePedido.builder()
					.cantidad(8)
					.subtotal(6040)
					.build();
			SimpleDateFormat formatoFecha = new SimpleDateFormat ("yyyy-MM-dd"); //configuracion fecha
			String fechaString = "2023-09-09";
			Date fecha = formatoFecha.parse(fechaString); // Parsear la cadena en un objeto Date
			Pedido pedido1 = Pedido.builder() 	//Crear Instancia Pedido
					.fecha(fecha)
					.total(6200)
					.estado(Estado.Entregado)
					.tipoEnvio(TipoDeEnvio.Delivery)
					.build();
			Pedido pedido2 = Pedido.builder()
					.fecha(fecha)
					.total(6000)
					.estado(Estado.Entregado)
					.tipoEnvio(TipoDeEnvio.Delivery)
					.build();
			Factura factura1 = Factura.builder() //Crear instancias de factura
					.fecha(fecha)
					.total(5800)
					.numero(1)
					.dto(400)
					.formaPago(FormaDePago.Efectivo)
					.build();
			Factura factura2 = Factura.builder()
					.fecha(fecha)
					.total(5400)
					.numero(2)
					.dto(600)
					.formaPago(FormaDePago.Efectivo)
					.build();
			pedido1.agregarDetallePedido(detallePedido1); //Agregar detalles al pedido
			pedido1.agregarDetallePedido(detallePedido2);
			pedido2.agregarDetallePedido(detallePedido3);
			cliente1.agregarPedido(pedido1); //agregar pedidos al cliente
			cliente1.agregarPedido(pedido2);
			detallePedido1.setProducto(producto1); //vincular el detalle pedido con el producto
			detallePedido2.setProducto(producto2);
			detallePedido3.setProducto(producto1);
			pedido1.setFactura(factura1); //vincular factura con pedido
			pedido2.setFactura(factura2);
			clienteRepository.save(cliente1); //guardar cliente
			//recuperar objeto rubro desde la base de datos
			Rubro rubroRecuperado = rubroRepository.findById(rubro1.getId()).orElse(null);
			if (rubroRecuperado != null){
				System.out.println("Denominacion: " + rubroRecuperado.getDenominacion());
				rubroRecuperado.mostrarProductos();
			}
			//recuperar Cliente desde la base de Datos
			Cliente clienteRecuperado = clienteRepository.findById(cliente1.getId()).orElse(null);
			if (clienteRecuperado != null){
				System.out.println("Nombre: " + clienteRecuperado.getNombre());
				System.out.println("Apellido: " + clienteRecuperado.getApellido());
				System.out.println("Mail: " + clienteRecuperado.getMail());
				System.out.println("Telefono: " + clienteRecuperado.getTelefono());
				System.out.println("----------------------------------------");
				clienteRecuperado.mostrarDomicilios();
				clienteRecuperado.mostrarPedidos();
		};
	};

}}


