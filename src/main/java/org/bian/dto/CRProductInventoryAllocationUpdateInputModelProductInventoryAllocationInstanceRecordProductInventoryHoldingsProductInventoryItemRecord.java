package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductInventoryAllocationUpdateInputModelProductInventoryAllocationInstanceRecordProductInventoryHoldingsProductInventoryItemRecord
 */
public class CRProductInventoryAllocationUpdateInputModelProductInventoryAllocationInstanceRecordProductInventoryHoldingsProductInventoryItemRecord   {
  private String productInventoryItemDescription = null;

  private String productInventoryItemSupplierDetails = null;

  private String productInventoryUsedLocations = null;

  private String productInventoryHolding = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the inventory item used for selection/reference purposes 
   * @return productInventoryItemDescription
  **/

  public String getProductInventoryItemDescription() {
    return productInventoryItemDescription;
  }

  public void setProductInventoryItemDescription(String productInventoryItemDescription) {
    this.productInventoryItemDescription = productInventoryItemDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details as to the supplier details for obtaining additional items when required (includes ordering details, volumes and frequency, pricing, delivery timelines etc.) 
   * @return productInventoryItemSupplierDetails
  **/

  public String getProductInventoryItemSupplierDetails() {
    return productInventoryItemSupplierDetails;
  }

  public void setProductInventoryItemSupplierDetails(String productInventoryItemSupplierDetails) {
    this.productInventoryItemSupplierDetails = productInventoryItemSupplierDetails;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details the locations where the inventory item is distributed to and the minimum and maximum holding amounts and inventory renewal cycles (used to trigger/schedule renewal deliveries) 
   * @return productInventoryUsedLocations
  **/

  public String getProductInventoryUsedLocations() {
    return productInventoryUsedLocations;
  }

  public void setProductInventoryUsedLocations(String productInventoryUsedLocations) {
    this.productInventoryUsedLocations = productInventoryUsedLocations;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current and projected holding and holding targets/limits by location - taking into account scheduled distribution plans 
   * @return productInventoryHolding
  **/

  public String getProductInventoryHolding() {
    return productInventoryHolding;
  }

  public void setProductInventoryHolding(String productInventoryHolding) {
    this.productInventoryHolding = productInventoryHolding;
  }


}

