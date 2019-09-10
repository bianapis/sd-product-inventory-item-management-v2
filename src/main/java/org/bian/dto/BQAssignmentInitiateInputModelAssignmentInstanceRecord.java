package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAssignmentInitiateInputModelAssignmentInstanceRecordDateType;

import javax.validation.Valid;
  
/**
 * BQAssignmentInitiateInputModelAssignmentInstanceRecord
 */
public class BQAssignmentInitiateInputModelAssignmentInstanceRecord   {
  private String productInventoryAssignmentRequestType = null;

  private Object productInventoryAssignmentRequestRecord = null;

  private BQAssignmentInitiateInputModelAssignmentInstanceRecordDateType dateType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines the type of assignment (e.g. to schedule, ad-hoc inventory request) 
   * @return productInventoryAssignmentRequestType
  **/

  public String getProductInventoryAssignmentRequestType() {
    return productInventoryAssignmentRequestType;
  }

  public void setProductInventoryAssignmentRequestType(String productInventoryAssignmentRequestType) {
    this.productInventoryAssignmentRequestType = productInventoryAssignmentRequestType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Contains details of the product inventory request, in particular the item type, amount and delivery arrangements 
   * @return productInventoryAssignmentRequestRecord
  **/

  public Object getProductInventoryAssignmentRequestRecord() {
    return productInventoryAssignmentRequestRecord;
  }

  public void setProductInventoryAssignmentRequestRecord(Object productInventoryAssignmentRequestRecord) {
    this.productInventoryAssignmentRequestRecord = productInventoryAssignmentRequestRecord;
  }


  /**
   * Get dateType
   * @return dateType
  **/

  public BQAssignmentInitiateInputModelAssignmentInstanceRecordDateType getDateType() {
    return dateType;
  }

  public void setDateType(BQAssignmentInitiateInputModelAssignmentInstanceRecordDateType dateType) {
    this.dateType = dateType;
  }


}

