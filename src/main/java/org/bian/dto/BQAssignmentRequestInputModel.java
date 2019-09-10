package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAssignmentRequestInputModelAssignmentInstanceRecord;
import org.bian.dto.CRProductInventoryAllocationRequestInputModelProductInventoryAllocationInstanceRecord;
import org.bian.dto.CRProductInventoryAllocationRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQAssignmentRequestInputModel
 */
public class BQAssignmentRequestInputModel   {
  private CRProductInventoryAllocationRequestInputModelProductInventoryAllocationInstanceRecord productInventoryAllocationInstanceRecord = null;

  private String productInventoryAllocationInstanceReference = null;

  private String assignmentInstanceReference = null;

  private BQAssignmentRequestInputModelAssignmentInstanceRecord assignmentInstanceRecord = null;

  private Object assignmentRequestActionTaskRecord = null;

  private CRProductInventoryAllocationRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * Get productInventoryAllocationInstanceRecord
   * @return productInventoryAllocationInstanceRecord
  **/

  public CRProductInventoryAllocationRequestInputModelProductInventoryAllocationInstanceRecord getProductInventoryAllocationInstanceRecord() {
    return productInventoryAllocationInstanceRecord;
  }

  public void setProductInventoryAllocationInstanceRecord(CRProductInventoryAllocationRequestInputModelProductInventoryAllocationInstanceRecord productInventoryAllocationInstanceRecord) {
    this.productInventoryAllocationInstanceRecord = productInventoryAllocationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Product Inventory Allocation instance 
   * @return productInventoryAllocationInstanceReference
  **/

  public String getProductInventoryAllocationInstanceReference() {
    return productInventoryAllocationInstanceReference;
  }

  public void setProductInventoryAllocationInstanceReference(String productInventoryAllocationInstanceReference) {
    this.productInventoryAllocationInstanceReference = productInventoryAllocationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Assignment instance 
   * @return assignmentInstanceReference
  **/

  public String getAssignmentInstanceReference() {
    return assignmentInstanceReference;
  }

  public void setAssignmentInstanceReference(String assignmentInstanceReference) {
    this.assignmentInstanceReference = assignmentInstanceReference;
  }


  /**
   * Get assignmentInstanceRecord
   * @return assignmentInstanceRecord
  **/

  public BQAssignmentRequestInputModelAssignmentInstanceRecord getAssignmentInstanceRecord() {
    return assignmentInstanceRecord;
  }

  public void setAssignmentInstanceRecord(BQAssignmentRequestInputModelAssignmentInstanceRecord assignmentInstanceRecord) {
    this.assignmentInstanceRecord = assignmentInstanceRecord;
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
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRProductInventoryAllocationRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRProductInventoryAllocationRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

