package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductInventoryAllocationUpdateInputModelProductInventoryAllocationInstanceRecordProductInventoryHoldings;

import javax.validation.Valid;
  
/**
 * CRProductInventoryAllocationUpdateInputModelProductInventoryAllocationInstanceRecord
 */
public class CRProductInventoryAllocationUpdateInputModelProductInventoryAllocationInstanceRecord   {
  private String productInventoryAllocationServiceSchedule = null;

  private CRProductInventoryAllocationUpdateInputModelProductInventoryAllocationInstanceRecordProductInventoryHoldings productInventoryHoldings = null;


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

  public CRProductInventoryAllocationUpdateInputModelProductInventoryAllocationInstanceRecordProductInventoryHoldings getProductInventoryHoldings() {
    return productInventoryHoldings;
  }

  public void setProductInventoryHoldings(CRProductInventoryAllocationUpdateInputModelProductInventoryAllocationInstanceRecordProductInventoryHoldings productInventoryHoldings) {
    this.productInventoryHoldings = productInventoryHoldings;
  }


}

