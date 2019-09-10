package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAssignmentInitiateInputModelAssignmentInstanceRecord;
import org.bian.dto.CRProductInventoryAllocationRequestInputModelProductInventoryAllocationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAssignmentInitiateInputModel
 */
public class BQAssignmentInitiateInputModel   {
  private CRProductInventoryAllocationRequestInputModelProductInventoryAllocationInstanceRecord productInventoryAllocationInstanceRecord = null;

  private String productInventoryAllocationInstanceReference = null;

  private Object assignmentInitiateActionRecord = null;

  private BQAssignmentInitiateInputModelAssignmentInstanceRecord assignmentInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return assignmentInitiateActionRecord
  **/

  public Object getAssignmentInitiateActionRecord() {
    return assignmentInitiateActionRecord;
  }

  public void setAssignmentInitiateActionRecord(Object assignmentInitiateActionRecord) {
    this.assignmentInitiateActionRecord = assignmentInitiateActionRecord;
  }


  /**
   * Get assignmentInstanceRecord
   * @return assignmentInstanceRecord
  **/

  public BQAssignmentInitiateInputModelAssignmentInstanceRecord getAssignmentInstanceRecord() {
    return assignmentInstanceRecord;
  }

  public void setAssignmentInstanceRecord(BQAssignmentInitiateInputModelAssignmentInstanceRecord assignmentInstanceRecord) {
    this.assignmentInstanceRecord = assignmentInstanceRecord;
  }


}

