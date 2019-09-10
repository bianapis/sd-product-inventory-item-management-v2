package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductInventoryAllocationUpdateInputModelProductInventoryAllocationInstanceRecordProductInventoryHoldingsProductInventoryItemRecord;

import javax.validation.Valid;
  
/**
 * CRProductInventoryAllocationUpdateInputModelProductInventoryAllocationInstanceRecordProductInventoryHoldings
 */
public class CRProductInventoryAllocationUpdateInputModelProductInventoryAllocationInstanceRecordProductInventoryHoldings   {
  private String productServiceType = null;

  private String productInventoryItemType = null;

  private CRProductInventoryAllocationUpdateInputModelProductInventoryAllocationInstanceRecordProductInventoryHoldingsProductInventoryItemRecord productInventoryItemRecord = null;


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

  public CRProductInventoryAllocationUpdateInputModelProductInventoryAllocationInstanceRecordProductInventoryHoldingsProductInventoryItemRecord getProductInventoryItemRecord() {
    return productInventoryItemRecord;
  }

  public void setProductInventoryItemRecord(CRProductInventoryAllocationUpdateInputModelProductInventoryAllocationInstanceRecordProductInventoryHoldingsProductInventoryItemRecord productInventoryItemRecord) {
    this.productInventoryItemRecord = productInventoryItemRecord;
  }


}

