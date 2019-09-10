package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductInventoryAllocationRequestInputModelProductInventoryAllocationInstanceRecord;
import org.bian.dto.CRProductInventoryAllocationRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRProductInventoryAllocationRequestInputModel
 */
public class CRProductInventoryAllocationRequestInputModel   {
  private String productInventoryItemManagementServicingSessionReference = null;

  private String productInventoryAllocationInstanceReference = null;

  private CRProductInventoryAllocationRequestInputModelProductInventoryAllocationInstanceRecord productInventoryAllocationInstanceRecord = null;

  private Object productInventoryAllocationRequestActionTaskRecord = null;

  private CRProductInventoryAllocationRequestInputModelRequestRecordType requestRecordType = null;


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

  public CRProductInventoryAllocationRequestInputModelProductInventoryAllocationInstanceRecord getProductInventoryAllocationInstanceRecord() {
    return productInventoryAllocationInstanceRecord;
  }

  public void setProductInventoryAllocationInstanceRecord(CRProductInventoryAllocationRequestInputModelProductInventoryAllocationInstanceRecord productInventoryAllocationInstanceRecord) {
    this.productInventoryAllocationInstanceRecord = productInventoryAllocationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return productInventoryAllocationRequestActionTaskRecord
  **/

  public Object getProductInventoryAllocationRequestActionTaskRecord() {
    return productInventoryAllocationRequestActionTaskRecord;
  }

  public void setProductInventoryAllocationRequestActionTaskRecord(Object productInventoryAllocationRequestActionTaskRecord) {
    this.productInventoryAllocationRequestActionTaskRecord = productInventoryAllocationRequestActionTaskRecord;
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

