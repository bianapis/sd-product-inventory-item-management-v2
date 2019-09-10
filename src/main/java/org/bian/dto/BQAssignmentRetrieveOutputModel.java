package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAssignmentInitiateOutputModelAssignmentInstanceRecord;
import org.bian.dto.BQAssignmentRetrieveOutputModelAssignmentInstanceAnalysis;
import org.bian.dto.BQAssignmentRetrieveOutputModelAssignmentInstanceReport;
import org.bian.dto.CRProductInventoryAllocationUpdateInputModelProductInventoryAllocationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAssignmentRetrieveOutputModel
 */
public class BQAssignmentRetrieveOutputModel   {
  private CRProductInventoryAllocationUpdateInputModelProductInventoryAllocationInstanceRecord productInventoryAllocationInstanceRecord = null;

  private BQAssignmentInitiateOutputModelAssignmentInstanceRecord assignmentInstanceRecord = null;

  private String assignmentRetrieveActionTaskReference = null;

  private Object assignmentRetrieveActionTaskRecord = null;

  private String assignmentRetrieveActionResponse = null;

  private BQAssignmentRetrieveOutputModelAssignmentInstanceReport assignmentInstanceReport = null;

  private BQAssignmentRetrieveOutputModelAssignmentInstanceAnalysis assignmentInstanceAnalysis = null;


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
   * Get assignmentInstanceRecord
   * @return assignmentInstanceRecord
  **/

  public BQAssignmentInitiateOutputModelAssignmentInstanceRecord getAssignmentInstanceRecord() {
    return assignmentInstanceRecord;
  }

  public void setAssignmentInstanceRecord(BQAssignmentInitiateOutputModelAssignmentInstanceRecord assignmentInstanceRecord) {
    this.assignmentInstanceRecord = assignmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Assignment instance retrieve service call 
   * @return assignmentRetrieveActionTaskReference
  **/

  public String getAssignmentRetrieveActionTaskReference() {
    return assignmentRetrieveActionTaskReference;
  }

  public void setAssignmentRetrieveActionTaskReference(String assignmentRetrieveActionTaskReference) {
    this.assignmentRetrieveActionTaskReference = assignmentRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return assignmentRetrieveActionTaskRecord
  **/

  public Object getAssignmentRetrieveActionTaskRecord() {
    return assignmentRetrieveActionTaskRecord;
  }

  public void setAssignmentRetrieveActionTaskRecord(Object assignmentRetrieveActionTaskRecord) {
    this.assignmentRetrieveActionTaskRecord = assignmentRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return assignmentRetrieveActionResponse
  **/

  public String getAssignmentRetrieveActionResponse() {
    return assignmentRetrieveActionResponse;
  }

  public void setAssignmentRetrieveActionResponse(String assignmentRetrieveActionResponse) {
    this.assignmentRetrieveActionResponse = assignmentRetrieveActionResponse;
  }


  /**
   * Get assignmentInstanceReport
   * @return assignmentInstanceReport
  **/

  public BQAssignmentRetrieveOutputModelAssignmentInstanceReport getAssignmentInstanceReport() {
    return assignmentInstanceReport;
  }

  public void setAssignmentInstanceReport(BQAssignmentRetrieveOutputModelAssignmentInstanceReport assignmentInstanceReport) {
    this.assignmentInstanceReport = assignmentInstanceReport;
  }


  /**
   * Get assignmentInstanceAnalysis
   * @return assignmentInstanceAnalysis
  **/

  public BQAssignmentRetrieveOutputModelAssignmentInstanceAnalysis getAssignmentInstanceAnalysis() {
    return assignmentInstanceAnalysis;
  }

  public void setAssignmentInstanceAnalysis(BQAssignmentRetrieveOutputModelAssignmentInstanceAnalysis assignmentInstanceAnalysis) {
    this.assignmentInstanceAnalysis = assignmentInstanceAnalysis;
  }


}

