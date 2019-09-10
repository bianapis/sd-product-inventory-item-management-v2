package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductInventoryAllocationRetrieveOutputModelProductInventoryAllocationInstanceAnalysis;
import org.bian.dto.CRProductInventoryAllocationRetrieveOutputModelProductInventoryAllocationInstanceReportRecord;
import org.bian.dto.CRProductInventoryAllocationUpdateInputModelProductInventoryAllocationInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRProductInventoryAllocationRetrieveOutputModel
 */
public class CRProductInventoryAllocationRetrieveOutputModel   {
  private CRProductInventoryAllocationUpdateInputModelProductInventoryAllocationInstanceRecord productInventoryAllocationInstanceRecord = null;

  private String productInventoryAllocationRetrieveActionTaskReference = null;

  private Object productInventoryAllocationRetrieveActionTaskRecord = null;

  private String productInventoryAllocationRetrieveActionResponse = null;

  private CRProductInventoryAllocationRetrieveOutputModelProductInventoryAllocationInstanceReportRecord productInventoryAllocationInstanceReportRecord = null;

  private CRProductInventoryAllocationRetrieveOutputModelProductInventoryAllocationInstanceAnalysis productInventoryAllocationInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Product Inventory Allocation instance retrieve service call 
   * @return productInventoryAllocationRetrieveActionTaskReference
  **/

  public String getProductInventoryAllocationRetrieveActionTaskReference() {
    return productInventoryAllocationRetrieveActionTaskReference;
  }

  public void setProductInventoryAllocationRetrieveActionTaskReference(String productInventoryAllocationRetrieveActionTaskReference) {
    this.productInventoryAllocationRetrieveActionTaskReference = productInventoryAllocationRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return productInventoryAllocationRetrieveActionResponse
  **/

  public String getProductInventoryAllocationRetrieveActionResponse() {
    return productInventoryAllocationRetrieveActionResponse;
  }

  public void setProductInventoryAllocationRetrieveActionResponse(String productInventoryAllocationRetrieveActionResponse) {
    this.productInventoryAllocationRetrieveActionResponse = productInventoryAllocationRetrieveActionResponse;
  }


  /**
   * Get productInventoryAllocationInstanceReportRecord
   * @return productInventoryAllocationInstanceReportRecord
  **/

  public CRProductInventoryAllocationRetrieveOutputModelProductInventoryAllocationInstanceReportRecord getProductInventoryAllocationInstanceReportRecord() {
    return productInventoryAllocationInstanceReportRecord;
  }

  public void setProductInventoryAllocationInstanceReportRecord(CRProductInventoryAllocationRetrieveOutputModelProductInventoryAllocationInstanceReportRecord productInventoryAllocationInstanceReportRecord) {
    this.productInventoryAllocationInstanceReportRecord = productInventoryAllocationInstanceReportRecord;
  }


  /**
   * Get productInventoryAllocationInstanceAnalysis
   * @return productInventoryAllocationInstanceAnalysis
  **/

  public CRProductInventoryAllocationRetrieveOutputModelProductInventoryAllocationInstanceAnalysis getProductInventoryAllocationInstanceAnalysis() {
    return productInventoryAllocationInstanceAnalysis;
  }

  public void setProductInventoryAllocationInstanceAnalysis(CRProductInventoryAllocationRetrieveOutputModelProductInventoryAllocationInstanceAnalysis productInventoryAllocationInstanceAnalysis) {
    this.productInventoryAllocationInstanceAnalysis = productInventoryAllocationInstanceAnalysis;
  }


}

