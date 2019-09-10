package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductInventoryAllocationRequestInputModelProductInventoryAllocationInstanceRecordProductInventoryHoldings;

import javax.validation.Valid;
  
/**
 * CRProductInventoryAllocationRequestInputModelProductInventoryAllocationInstanceRecord
 */
public class CRProductInventoryAllocationRequestInputModelProductInventoryAllocationInstanceRecord   {
  private String productInventoryAllocationServiceSchedule = null;

  private CRProductInventoryAllocationRequestInputModelProductInventoryAllocationInstanceRecordProductInventoryHoldings productInventoryHoldings = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Maintains the distribution schedule for all managed product inventory items. This includes all past distribution records and future scheduled deliveries 
   * @return productInventoryAllocationServiceSchedule
  **/

  public String getProductInventoryAllocationServiceSchedule() {
    return productInventoryAllocationServiceSchedule;
  }

  public void setProductInventoryAllocationServiceSchedule(String productInventoryAllocationServiceSchedule) {
    this.productInventoryAllocationServiceSchedule = productInventoryAllocationServiceSchedule;
  }


  /**
   * Get productInventoryHoldings
   * @return productInventoryHoldings
  **/

  public CRProductInventoryAllocationRequestInputModelProductInventoryAllocationInstanceRecordProductInventoryHoldings getProductInventoryHoldings() {
    return productInventoryHoldings;
  }

  public void setProductInventoryHoldings(CRProductInventoryAllocationRequestInputModelProductInventoryAllocationInstanceRecordProductInventoryHoldings productInventoryHoldings) {
    this.productInventoryHoldings = productInventoryHoldings;
  }


}

