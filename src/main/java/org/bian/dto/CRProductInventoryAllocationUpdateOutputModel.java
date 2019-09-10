package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductInventoryAllocationUpdateInputModelProductInventoryAllocationInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRProductInventoryAllocationUpdateOutputModel
 */
public class CRProductInventoryAllocationUpdateOutputModel   {
  private CRProductInventoryAllocationUpdateInputModelProductInventoryAllocationInstanceRecord productInventoryAllocationInstanceRecord = null;

  private String productInventoryAllocationUpdateActionTaskReference = null;

  private Object productInventoryAllocationUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return productInventoryAllocationUpdateActionTaskReference
  **/

  public String getProductInventoryAllocationUpdateActionTaskReference() {
    return productInventoryAllocationUpdateActionTaskReference;
  }

  public void setProductInventoryAllocationUpdateActionTaskReference(String productInventoryAllocationUpdateActionTaskReference) {
    this.productInventoryAllocationUpdateActionTaskReference = productInventoryAllocationUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

