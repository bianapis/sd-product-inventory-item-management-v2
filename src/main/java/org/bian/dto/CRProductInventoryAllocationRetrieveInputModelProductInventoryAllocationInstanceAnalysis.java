package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductInventoryAllocationRetrieveInputModelProductInventoryAllocationInstanceAnalysis
 */
public class CRProductInventoryAllocationRetrieveInputModelProductInventoryAllocationInstanceAnalysis   {
  private String productInventoryAllocationInstanceAnalysisReference = null;

  private String productInventoryAllocationInstanceAnalysisReportType = null;

  private String productInventoryAllocationInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return productInventoryAllocationInstanceAnalysisReference
  **/

  public String getProductInventoryAllocationInstanceAnalysisReference() {
    return productInventoryAllocationInstanceAnalysisReference;
  }

  public void setProductInventoryAllocationInstanceAnalysisReference(String productInventoryAllocationInstanceAnalysisReference) {
    this.productInventoryAllocationInstanceAnalysisReference = productInventoryAllocationInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return productInventoryAllocationInstanceAnalysisParameters
  **/

  public String getProductInventoryAllocationInstanceAnalysisParameters() {
    return productInventoryAllocationInstanceAnalysisParameters;
  }

  public void setProductInventoryAllocationInstanceAnalysisParameters(String productInventoryAllocationInstanceAnalysisParameters) {
    this.productInventoryAllocationInstanceAnalysisParameters = productInventoryAllocationInstanceAnalysisParameters;
  }


}

