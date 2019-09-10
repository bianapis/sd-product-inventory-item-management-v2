/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class ProductInventoryItemManagementApiServiceImpl implements ProductInventoryItemManagementApiService {

	public SDProductInventoryItemManagementActivateOutputModel activate(SDProductInventoryItemManagementActivateInputModel request){
		return JsonReader.read("activate-SDProductInventoryItemManagementActivateOutputModel.json",new TypeReference<SDProductInventoryItemManagementActivateOutputModel>(){});
	}
	
	public SDProductInventoryItemManagementConfigureOutputModel configure(String sdReferenceId, SDProductInventoryItemManagementConfigureInputModel request){
		return JsonReader.read("configure-SDProductInventoryItemManagementConfigureOutputModel.json",new TypeReference<SDProductInventoryItemManagementConfigureOutputModel>(){});
	}
	
	public BQAssignmentExchangeOutputModel exchangeAssignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssignmentExchangeInputModel request){
		return JsonReader.read("exchange-BQAssignmentExchangeOutputModel.json",new TypeReference<BQAssignmentExchangeOutputModel>(){});
	}
	
	public SDProductInventoryItemManagementFeedbackOutputModel feedback(String sdReferenceId, SDProductInventoryItemManagementFeedbackInputModel request){
		return JsonReader.read("feedback-SDProductInventoryItemManagementFeedbackOutputModel.json",new TypeReference<SDProductInventoryItemManagementFeedbackOutputModel>(){});
	}
	
	public BQAssignmentInitiateOutputModel initiateAssignment(String sdReferenceId, String crReferenceId, BQAssignmentInitiateInputModel request){
		return JsonReader.read("initiate-BQAssignmentInitiateOutputModel.json",new TypeReference<BQAssignmentInitiateOutputModel>(){});
	}
	
	public BQAssignmentRequestOutputModel requestAssignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssignmentRequestInputModel request){
		return JsonReader.read("request-BQAssignmentRequestOutputModel.json",new TypeReference<BQAssignmentRequestOutputModel>(){});
	}
	
	public CRProductInventoryAllocationRequestOutputModel request(String sdReferenceId, String crReferenceId, CRProductInventoryAllocationRequestInputModel request){
		return JsonReader.read("request-CRProductInventoryAllocationRequestOutputModel.json",new TypeReference<CRProductInventoryAllocationRequestOutputModel>(){});
	}
	
	public BQAssignmentRetrieveOutputModel retrieveAssignment(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQAssignmentRetrieveOutputModel.json",new TypeReference<BQAssignmentRetrieveOutputModel>(){});
	}
	
	public CRProductInventoryAllocationRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRProductInventoryAllocationRetrieveOutputModel.json",new TypeReference<CRProductInventoryAllocationRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDProductInventoryItemManagementRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDProductInventoryItemManagementRetrieveOutputModel.json",new TypeReference<SDProductInventoryItemManagementRetrieveOutputModel>(){});
	}
	
	public CRProductInventoryAllocationUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRProductInventoryAllocationUpdateInputModel request){
		return JsonReader.read("update-CRProductInventoryAllocationUpdateOutputModel.json",new TypeReference<CRProductInventoryAllocationUpdateOutputModel>(){});
	}
	
	public BQAssignmentUpdateOutputModel updateAssignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssignmentUpdateInputModel request){
		return JsonReader.read("update-BQAssignmentUpdateOutputModel.json",new TypeReference<BQAssignmentUpdateOutputModel>(){});
	}
	
}
