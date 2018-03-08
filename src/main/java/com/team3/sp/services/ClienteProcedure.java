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

import com.team3.sp.model.InputData;
import com.team3.sp.model.OutputData;

@Service("storedprocedure")
public class ClienteProcedure extends StoredProcedure{
private static final String GENERACLIENTE = "generaCliente";
	
	@Autowired
	ClienteProcedure(DataSource dataSource){
		super(dataSource, GENERACLIENTE);
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
	public OutputData execute(InputData input){
	      Map<String, Object> inParams = new HashMap<String, Object>();
	      inParams.put("nombre", input.getNombre());
	      inParams.put("direccion", input.getDireccion());
	      inParams.put("correo", input.getCorreo());
	      inParams.put("telefono", input.getTelefono());
	      inParams.put("saldo", input.getSaldo());
	      inParams.put("ejecutivoemail", input.getEjecutivo());
	      
	      Map<String, Object> out = super.execute(inParams);
			out.put("idClienteOut", String.format("%08d", out.get("idcliente")));
			return new OutputData(out);
	        	
	}
	     
	
	
}
