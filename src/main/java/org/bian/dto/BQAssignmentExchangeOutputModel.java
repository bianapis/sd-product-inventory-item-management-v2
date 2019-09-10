package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAssignmentExchangeOutputModel
 */
public class BQAssignmentExchangeOutputModel   {
  private String assignmentExchangeActionTaskReference = null;

  private Object assignmentExchangeActionTaskRecord = null;

  private String assignmentExchangeActionResponse = null;

  private String assignmentInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Assignment instance exchange service call 
   * @return assignmentExchangeActionTaskReference
  **/

  public String getAssignmentExchangeActionTaskReference() {
    return assignmentExchangeActionTaskReference;
  }

  public void setAssignmentExchangeActionTaskReference(String assignmentExchangeActionTaskReference) {
    this.assignmentExchangeActionTaskReference = assignmentExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return assignmentExchangeActionTaskRecord
  **/

  public Object getAssignmentExchangeActionTaskRecord() {
    return assignmentExchangeActionTaskRecord;
  }

  public void setAssignmentExchangeActionTaskRecord(Object assignmentExchangeActionTaskRecord) {
    this.assignmentExchangeActionTaskRecord = assignmentExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return assignmentExchangeActionResponse
  **/

  public String getAssignmentExchangeActionResponse() {
    return assignmentExchangeActionResponse;
  }

  public void setAssignmentExchangeActionResponse(String assignmentExchangeActionResponse) {
    this.assignmentExchangeActionResponse = assignmentExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Assignment instance (e.g. accepted, rejected, verified) 
   * @return assignmentInstanceStatus
  **/

  public String getAssignmentInstanceStatus() {
    return assignmentInstanceStatus;
  }

  public void setAssignmentInstanceStatus(String assignmentInstanceStatus) {
    this.assignmentInstanceStatus = assignmentInstanceStatus;
  }


}

