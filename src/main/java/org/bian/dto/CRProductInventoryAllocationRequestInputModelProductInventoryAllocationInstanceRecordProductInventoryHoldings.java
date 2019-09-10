package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductInventoryAllocationRequestInputModelProductInventoryAllocationInstanceRecordProductInventoryHoldingsProductInventoryItemRecord;

import javax.validation.Valid;
  
/**
 * CRProductInventoryAllocationRequestInputModelProductInventoryAllocationInstanceRecordProductInventoryHoldings
 */
public class CRProductInventoryAllocationRequestInputModelProductInventoryAllocationInstanceRecordProductInventoryHoldings   {
  private String productServiceType = null;

  private String productInventoryItemType = null;

  private CRProductInventoryAllocationRequestInputModelProductInventoryAllocationInstanceRecordProductInventoryHoldingsProductInventoryItemRecord productInventoryItemRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type or category of product or service for which inventory items are held (e.g. specialized consumer loan, relocation services) 
   * @return productServiceType
  **/

  public String getProductServiceType() {
    return productServiceType;
  }

  public void setProductServiceType(String productServiceType) {
    this.productServiceType = productServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to a specific type of product inventory item 
   * @return productInventoryItemType
  **/

  public String getProductInventoryItemType() {
    return productInventoryItemType;
  }

  public void setProductInventoryItemType(String productInventoryItemType) {
    this.productInventoryItemType = productInventoryItemType;
  }


  /**
   * Get productInventoryItemRecord
   * @return productInventoryItemRecord
  **/

  public CRProductInventoryAllocationRequestInputModelProductInventoryAllocationInstanceRecordProductInventoryHoldingsProductInventoryItemRecord getProductInventoryItemRecord() {
    return productInventoryItemRecord;
  }

  public void setProductInventoryItemRecord(CRProductInventoryAllocationRequestInputModelProductInventoryAllocationInstanceRecordProductInventoryHoldingsProductInventoryItemRecord productInventoryItemRecord) {
    this.productInventoryItemRecord = productInventoryItemRecord;
  }


}

