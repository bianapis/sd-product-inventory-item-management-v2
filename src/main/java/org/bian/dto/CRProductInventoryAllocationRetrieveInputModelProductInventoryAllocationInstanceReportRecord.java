package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductInventoryAllocationRetrieveInputModelProductInventoryAllocationInstanceReportRecord
 */
public class CRProductInventoryAllocationRetrieveInputModelProductInventoryAllocationInstanceReportRecord   {
  private String productInventoryAllocationInstanceReportReference = null;

  private String productInventoryAllocationInstanceReportType = null;

  private String productInventoryAllocationInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return productInventoryAllocationInstanceReportReference
  **/

  public String getProductInventoryAllocationInstanceReportReference() {
    return productInventoryAllocationInstanceReportReference;
  }

  public void setProductInventoryAllocationInstanceReportReference(String productInventoryAllocationInstanceReportReference) {
    this.productInventoryAllocationInstanceReportReference = productInventoryAllocationInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return productInventoryAllocationInstanceReportParameters
  **/

  public String getProductInventoryAllocationInstanceReportParameters() {
    return productInventoryAllocationInstanceReportParameters;
  }

  public void setProductInventoryAllocationInstanceReportParameters(String productInventoryAllocationInstanceReportParameters) {
    this.productInventoryAllocationInstanceReportParameters = productInventoryAllocationInstanceReportParameters;
  }


}

