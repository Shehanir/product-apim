/*
 * Internal Utility API
 * This API allows you to access internal data.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.am.integration.clients.internal.api.dto;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.wso2.am.integration.clients.internal.api.dto.ThrottleLimitBaseDTO;

/**
 * RequestCountLimitDTO
 */

public class RequestCountLimitDTO {
  @SerializedName("timeUnit")
  private String timeUnit = null;

  @SerializedName("unitTime")
  private Integer unitTime = null;

  @SerializedName("requestCount")
  private Long requestCount = null;

  public RequestCountLimitDTO timeUnit(String timeUnit) {
    this.timeUnit = timeUnit;
    return this;
  }

   /**
   * Unit of the time. Allowed values are \&quot;sec\&quot;, \&quot;min\&quot;, \&quot;hour\&quot;, \&quot;day\&quot;
   * @return timeUnit
  **/
  @ApiModelProperty(example = "min", required = true, value = "Unit of the time. Allowed values are \"sec\", \"min\", \"hour\", \"day\"")
  public String getTimeUnit() {
    return timeUnit;
  }

  public void setTimeUnit(String timeUnit) {
    this.timeUnit = timeUnit;
  }

  public RequestCountLimitDTO unitTime(Integer unitTime) {
    this.unitTime = unitTime;
    return this;
  }

   /**
   * Time limit that the throttling limit applies.
   * @return unitTime
  **/
  @ApiModelProperty(example = "10", required = true, value = "Time limit that the throttling limit applies.")
  public Integer getUnitTime() {
    return unitTime;
  }

  public void setUnitTime(Integer unitTime) {
    this.unitTime = unitTime;
  }

  public RequestCountLimitDTO requestCount(Long requestCount) {
    this.requestCount = requestCount;
    return this;
  }

   /**
   * Maximum number of requests allowed
   * @return requestCount
  **/
  @ApiModelProperty(example = "1000", required = true, value = "Maximum number of requests allowed")
  public Long getRequestCount() {
    return requestCount;
  }

  public void setRequestCount(Long requestCount) {
    this.requestCount = requestCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestCountLimitDTO requestCountLimit = (RequestCountLimitDTO) o;
    return Objects.equals(this.timeUnit, requestCountLimit.timeUnit) &&
        Objects.equals(this.unitTime, requestCountLimit.unitTime) &&
        Objects.equals(this.requestCount, requestCountLimit.requestCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeUnit, unitTime, requestCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestCountLimitDTO {\n");
    
    sb.append("    timeUnit: ").append(toIndentedString(timeUnit)).append("\n");
    sb.append("    unitTime: ").append(toIndentedString(unitTime)).append("\n");
    sb.append("    requestCount: ").append(toIndentedString(requestCount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

