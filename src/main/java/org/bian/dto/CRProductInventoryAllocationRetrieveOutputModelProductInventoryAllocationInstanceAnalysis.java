package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductInventoryAllocationRetrieveOutputModelProductInventoryAllocationInstanceAnalysis
 */
public class CRProductInventoryAllocationRetrieveOutputModelProductInventoryAllocationInstanceAnalysis   {
  private String productInventoryAllocationInstanceAnalysisData = null;

  private String productInventoryAllocationInstanceAnalysisReportType = null;

  private Object productInventoryAllocationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return productInventoryAllocationInstanceAnalysisData
  **/

  public String getProductInventoryAllocationInstanceAnalysisData() {
    return productInventoryAllocationInstanceAnalysisData;
  }

  public void setProductInventoryAllocationInstanceAnalysisData(String productInventoryAllocationInstanceAnalysisData) {
    this.productInventoryAllocationInstanceAnalysisData = productInventoryAllocationInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return productInventoryAllocationInstanceAnalysisReportType
  **/

  public String getProductInventoryAllocationInstanceAnalysisReportType() {
    return productInventoryAllocationInstanceAnalysisReportType;
  }

  public void setProductInventoryAllocationInstanceAnalysisReportType(String productInventoryAllocationInstanceAnalysisReportType) {
    this.productInventoryAllocationInstanceAnalysisReportType = productInventoryAllocationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return productInventoryAllocationInstanceAnalysisReport
  **/

  public Object getProductInventoryAllocationInstanceAnalysisReport() {
    return productInventoryAllocationInstanceAnalysisReport;
  }

  public void setProductInventoryAllocationInstanceAnalysisReport(Object productInventoryAllocationInstanceAnalysisReport) {
    this.productInventoryAllocationInstanceAnalysisReport = productInventoryAllocationInstanceAnalysisReport;
  }


}

