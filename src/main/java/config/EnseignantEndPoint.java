package config;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import entity.Enseignant;
import service.EnseignantServices;
import allapis.springbootsoap.com.AddEnseignantRequest;
import allapis.springbootsoap.com.AddEnseignantResponse;
import allapis.springbootsoap.com.DeleteEnseignantRequest;
import allapis.springbootsoap.com.DeleteEnseignantResponse;
import allapis.springbootsoap.com.EnseignantInfo;
import allapis.springbootsoap.com.GetEnseignantByIdRequest;
import allapis.springbootsoap.com.GetEnseignantResponse;
import allapis.springbootsoap.com.ServiceStatus;
import allapis.springbootsoap.com.UpdateEnseignantRequest;
import allapis.springbootsoap.com.UpdateEnseignantResponse;

@Endpoint
public class EnseignantEndPoint {
	private static final String NameSpace_URI="http://com.springbootsoap.allapis";
	@Autowired
	private EnseignantServices enseignantService;
	@PayloadRoot (namespace = NameSpace_URI, localPart= "addEnseignantRequest")
	@ResponsePayload
	public AddEnseignantResponse addEnseignant (@RequestPayload AddEnseignantRequest request) {
		AddEnseignantResponse response=new AddEnseignantResponse();
		ServiceStatus serviceStatus=new ServiceStatus();
		Enseignant enseignant =new Enseignant();
		BeanUtils.copyProperties((request.getEnseignantInfo()), enseignant);
		enseignantService.AddEnseignant(enseignant);
		serviceStatus.setStatus("SUCCESS");
		serviceStatus.setMessage("Content Added Successfully");
		response.setServiceStatus(serviceStatus);
		return response;
	}
	
	@PayloadRoot (namespace = NameSpace_URI, localPart= "getEnseignantByIdRequest")
	@ResponsePayload
	public GetEnseignantResponse getEnseignant (@RequestPayload GetEnseignantByIdRequest request) {
		GetEnseignantResponse response=new GetEnseignantResponse();
		EnseignantInfo enseignantInfo=new EnseignantInfo();
		
		BeanUtils.copyProperties(enseignantService.getEnseignantById(request.getEnseignantId()),
		enseignantInfo);
		response.setEnseignantInfo(enseignantInfo);
		return response;
	}
	@PayloadRoot (namespace = NameSpace_URI, localPart= "updateEnseignantRequest")
	@ResponsePayload
	public UpdateEnseignantResponse updateEnseignant (@RequestPayload UpdateEnseignantRequest request) {
		Enseignant enseignant=new Enseignant();
		BeanUtils.copyProperties(request.getEnseignantInfo(), enseignant);
		enseignantService.updateEnseignant(enseignant);
		ServiceStatus serviceStatus=new ServiceStatus();
		serviceStatus.setStatus("SUCCESS");
		serviceStatus.setMessage("Content Update Successfully");
		UpdateEnseignantResponse response= new UpdateEnseignantResponse();
		response.setServiceStatus(serviceStatus);
		return response;
	}
	
	@PayloadRoot (namespace = NameSpace_URI, localPart= "deleteEnseignantRequest")
	@ResponsePayload
	public DeleteEnseignantResponse deleteEnseignant (@RequestPayload DeleteEnseignantRequest request) {
		enseignantService.deleteEnseignant(request.getEnseignantId());
		ServiceStatus serviceStatus=new ServiceStatus();
		serviceStatus.setStatus("SUCCESS");
		serviceStatus.setMessage("Content deleted Successfully");
		DeleteEnseignantResponse response= new DeleteEnseignantResponse();
		response.setServiceStatus(serviceStatus);
		return response;
	}
}
