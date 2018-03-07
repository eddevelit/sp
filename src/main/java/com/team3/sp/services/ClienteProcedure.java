package com.team3.sp.services;

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Service;

import com.team3.sp.model.Cliente;
import com.team3.sp.model.Cuenta;

@Service("StoredProcedure")
public class ClienteProcedure extends StoredProcedure{
private static final String generaCliente = "generaCliente";
	
	@Autowired
	public ClienteProcedure(DataSource dataSource, String procedureName){
		super(dataSource, generaCliente);
		//declarando los parametros del procedimiento
			declareParameter(new SqlParameter("nombre", Types.VARCHAR));
			declareParameter(new SqlParameter("direccion", Types.VARCHAR));
			declareParameter(new SqlParameter("correo", Types.VARCHAR));
			declareParameter(new SqlParameter("telefono", Types.VARCHAR));
			declareParameter(new SqlParameter("saldo", Types.DOUBLE));
			declareParameter(new SqlParameter("ejecutivoemail", Types.VARCHAR));
			declareParameter(new SqlOutParameter("idcliente", Types.INTEGER));
			declareParameter(new SqlOutParameter("idcuenta", Types.INTEGER));
			declareParameter(new SqlOutParameter("saldoout", Types.INTEGER));
			compile();
	}
	public Cuenta execute(Cliente input){
	      Map<String, Object> inParams = new HashMap<String, Object>();
	      inParams.put("nombre", input.getNombre());
	      inParams.put("direccion", input.getDireccion());
	      inParams.put("correo", input.getCorreo());
	      inParams.put("telefono", input.getTelefono());
	      inParams.put("saldo", input.getSaldo());
	      inParams.put("ejecutivoemail", input.getEjecutivo());
	      
	      Map<String, Object> out = super.execute(inParams);
			out.put("idClienteOut", String.format("%08d", out.get("idcliente")));
			return new Cuenta(out);
	        	
	}
	   
	
	
}
