/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface ProductInventoryItemManagementApiService {

	SDProductInventoryItemManagementActivateOutputModel activate(SDProductInventoryItemManagementActivateInputModel request);
	
	SDProductInventoryItemManagementConfigureOutputModel configure(String sdReferenceId, SDProductInventoryItemManagementConfigureInputModel request);
	
	BQAssignmentExchangeOutputModel exchangeAssignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssignmentExchangeInputModel request);
	
	SDProductInventoryItemManagementFeedbackOutputModel feedback(String sdReferenceId, SDProductInventoryItemManagementFeedbackInputModel request);
	
	BQAssignmentInitiateOutputModel initiateAssignment(String sdReferenceId, String crReferenceId, BQAssignmentInitiateInputModel request);
	
	BQAssignmentRequestOutputModel requestAssignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssignmentRequestInputModel request);
	
	CRProductInventoryAllocationRequestOutputModel request(String sdReferenceId, String crReferenceId, CRProductInventoryAllocationRequestInputModel request);
	
	BQAssignmentRetrieveOutputModel retrieveAssignment(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	CRProductInventoryAllocationRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDProductInventoryItemManagementRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRProductInventoryAllocationUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRProductInventoryAllocationUpdateInputModel request);
	
	BQAssignmentUpdateOutputModel updateAssignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssignmentUpdateInputModel request);
	
}
