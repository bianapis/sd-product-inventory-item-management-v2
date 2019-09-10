package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAssignmentInitiateOutputModelAssignmentInstanceRecord;
import org.bian.dto.CRProductInventoryAllocationUpdateInputModelProductInventoryAllocationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAssignmentRequestOutputModel
 */
public class BQAssignmentRequestOutputModel   {
  private CRProductInventoryAllocationUpdateInputModelProductInventoryAllocationInstanceRecord productInventoryAllocationInstanceRecord = null;

  private BQAssignmentInitiateOutputModelAssignmentInstanceRecord assignmentInstanceRecord = null;

  private String assignmentRequestActionTaskReference = null;

  private Object assignmentRequestActionTaskRecord = null;

  private String assignmentRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get productInventoryAllocationInstanceRecord
   * @return productInventoryAllocationInstanceRecord
  **/

  public CRProductInventoryAllocationUpdateInputModelProductInventoryAllocationInstanceRecord getProductInventoryAllocationInstanceRecord() {
    return productInventoryAllocationInstanceRecord;
  }

  public void setProductInventoryAllocationInstanceRecord(CRProductInventoryAllocationUpdateInputModelProductInventoryAllocationInstanceRecord productInventoryAllocationInstanceRecord) {
    this.productInventoryAllocationInstanceRecord = productInventoryAllocationInstanceRecord;
  }


  /**
   * Get assignmentInstanceRecord
   * @return assignmentInstanceRecord
  **/

  public BQAssignmentInitiateOutputModelAssignmentInstanceRecord getAssignmentInstanceRecord() {
    return assignmentInstanceRecord;
  }

  public void setAssignmentInstanceRecord(BQAssignmentInitiateOutputModelAssignmentInstanceRecord assignmentInstanceRecord) {
    this.assignmentInstanceRecord = assignmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Assignment instance request service call 
   * @return assignmentRequestActionTaskReference
  **/

  public String getAssignmentRequestActionTaskReference() {
    return assignmentRequestActionTaskReference;
  }

  public void setAssignmentRequestActionTaskReference(String assignmentRequestActionTaskReference) {
    this.assignmentRequestActionTaskReference = assignmentRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return assignmentRequestActionTaskRecord
  **/

  public Object getAssignmentRequestActionTaskRecord() {
    return assignmentRequestActionTaskRecord;
  }

  public void setAssignmentRequestActionTaskRecord(Object assignmentRequestActionTaskRecord) {
    this.assignmentRequestActionTaskRecord = assignmentRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Assignment service request record 
   * @return assignmentRequestRecordReference
  **/

  public String getAssignmentRequestRecordReference() {
    return assignmentRequestRecordReference;
  }

  public void setAssignmentRequestRecordReference(String assignmentRequestRecordReference) {
    this.assignmentRequestRecordReference = assignmentRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

