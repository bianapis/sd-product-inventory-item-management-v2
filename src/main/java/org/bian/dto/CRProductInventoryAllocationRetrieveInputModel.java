package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductInventoryAllocationRetrieveInputModelProductInventoryAllocationInstanceAnalysis;
import org.bian.dto.CRProductInventoryAllocationRetrieveInputModelProductInventoryAllocationInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRProductInventoryAllocationRetrieveInputModel
 */
public class CRProductInventoryAllocationRetrieveInputModel   {
  private Object productInventoryAllocationRetrieveActionTaskRecord = null;

  private String productInventoryAllocationRetrieveActionRequest = null;

  private CRProductInventoryAllocationRetrieveInputModelProductInventoryAllocationInstanceReportRecord productInventoryAllocationInstanceReportRecord = null;

  private CRProductInventoryAllocationRetrieveInputModelProductInventoryAllocationInstanceAnalysis productInventoryAllocationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return productInventoryAllocationRetrieveActionTaskRecord
  **/

  public Object getProductInventoryAllocationRetrieveActionTaskRecord() {
    return productInventoryAllocationRetrieveActionTaskRecord;
  }

  public void setProductInventoryAllocationRetrieveActionTaskRecord(Object productInventoryAllocationRetrieveActionTaskRecord) {
    this.productInventoryAllocationRetrieveActionTaskRecord = productInventoryAllocationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return productInventoryAllocationRetrieveActionRequest
  **/

  public String getProductInventoryAllocationRetrieveActionRequest() {
    return productInventoryAllocationRetrieveActionRequest;
  }

  public void setProductInventoryAllocationRetrieveActionRequest(String productInventoryAllocationRetrieveActionRequest) {
    this.productInventoryAllocationRetrieveActionRequest = productInventoryAllocationRetrieveActionRequest;
  }


  /**
   * Get productInventoryAllocationInstanceReportRecord
   * @return productInventoryAllocationInstanceReportRecord
  **/

  public CRProductInventoryAllocationRetrieveInputModelProductInventoryAllocationInstanceReportRecord getProductInventoryAllocationInstanceReportRecord() {
    return productInventoryAllocationInstanceReportRecord;
  }

  public void setProductInventoryAllocationInstanceReportRecord(CRProductInventoryAllocationRetrieveInputModelProductInventoryAllocationInstanceReportRecord productInventoryAllocationInstanceReportRecord) {
    this.productInventoryAllocationInstanceReportRecord = productInventoryAllocationInstanceReportRecord;
  }


  /**
   * Get productInventoryAllocationInstanceAnalysis
   * @return productInventoryAllocationInstanceAnalysis
  **/

  public CRProductInventoryAllocationRetrieveInputModelProductInventoryAllocationInstanceAnalysis getProductInventoryAllocationInstanceAnalysis() {
    return productInventoryAllocationInstanceAnalysis;
  }

  public void setProductInventoryAllocationInstanceAnalysis(CRProductInventoryAllocationRetrieveInputModelProductInventoryAllocationInstanceAnalysis productInventoryAllocationInstanceAnalysis) {
    this.productInventoryAllocationInstanceAnalysis = productInventoryAllocationInstanceAnalysis;
  }


}

