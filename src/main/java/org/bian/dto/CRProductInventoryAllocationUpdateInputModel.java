package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductInventoryAllocationUpdateInputModelProductInventoryAllocationInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRProductInventoryAllocationUpdateInputModel
 */
public class CRProductInventoryAllocationUpdateInputModel   {
  private String productInventoryItemManagementServicingSessionReference = null;

  private String productInventoryAllocationInstanceReference = null;

  private CRProductInventoryAllocationUpdateInputModelProductInventoryAllocationInstanceRecord productInventoryAllocationInstanceRecord = null;

  private Object productInventoryAllocationUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return productInventoryItemManagementServicingSessionReference
  **/

  public String getProductInventoryItemManagementServicingSessionReference() {
    return productInventoryItemManagementServicingSessionReference;
  }

  public void setProductInventoryItemManagementServicingSessionReference(String productInventoryItemManagementServicingSessionReference) {
    this.productInventoryItemManagementServicingSessionReference = productInventoryItemManagementServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Product Inventory Allocation instance 
   * @return productInventoryAllocationInstanceReference
  **/

  public String getProductInventoryAllocationInstanceReference() {
    return productInventoryAllocationInstanceReference;
  }

  public void setProductInventoryAllocationInstanceReference(String productInventoryAllocationInstanceReference) {
    this.productInventoryAllocationInstanceReference = productInventoryAllocationInstanceReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return productInventoryAllocationUpdateActionTaskRecord
  **/

  public Object getProductInventoryAllocationUpdateActionTaskRecord() {
    return productInventoryAllocationUpdateActionTaskRecord;
  }

  public void setProductInventoryAllocationUpdateActionTaskRecord(Object productInventoryAllocationUpdateActionTaskRecord) {
    this.productInventoryAllocationUpdateActionTaskRecord = productInventoryAllocationUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

