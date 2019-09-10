package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductInventoryAllocationRetrieveOutputModelProductInventoryAllocationInstanceReportRecord
 */
public class CRProductInventoryAllocationRetrieveOutputModelProductInventoryAllocationInstanceReportRecord   {
  private String productInventoryAllocationInstanceReportData = null;

  private String productInventoryAllocationInstanceReportType = null;

  private Object productInventoryAllocationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return productInventoryAllocationInstanceReportData
  **/

  public String getProductInventoryAllocationInstanceReportData() {
    return productInventoryAllocationInstanceReportData;
  }

  public void setProductInventoryAllocationInstanceReportData(String productInventoryAllocationInstanceReportData) {
    this.productInventoryAllocationInstanceReportData = productInventoryAllocationInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return productInventoryAllocationInstanceReportType
  **/

  public String getProductInventoryAllocationInstanceReportType() {
    return productInventoryAllocationInstanceReportType;
  }

  public void setProductInventoryAllocationInstanceReportType(String productInventoryAllocationInstanceReportType) {
    this.productInventoryAllocationInstanceReportType = productInventoryAllocationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return productInventoryAllocationInstanceReport
  **/

  public Object getProductInventoryAllocationInstanceReport() {
    return productInventoryAllocationInstanceReport;
  }

  public void setProductInventoryAllocationInstanceReport(Object productInventoryAllocationInstanceReport) {
    this.productInventoryAllocationInstanceReport = productInventoryAllocationInstanceReport;
  }


}

