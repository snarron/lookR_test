package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-08T14:44:15.944-07:00")
public class ScheduledTask   {
  
  private Long id = null;
  private String cronString = null;
  private String timezone = null;
  private String type = null;
  private Long userId = null;

  
  /**
   * Unique Id
   **/
  @ApiModelProperty(value = "Unique Id")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Cron String
   **/
  @ApiModelProperty(value = "Cron String")
  @JsonProperty("cron_string")
  public String getCronString() {
    return cronString;
  }
  public void setCronString(String cronString) {
    this.cronString = cronString;
  }

  
  /**
   * Timezone
   **/
  @ApiModelProperty(value = "Timezone")
  @JsonProperty("timezone")
  public String getTimezone() {
    return timezone;
  }
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  
  /**
   * Type
   **/
  @ApiModelProperty(value = "Type")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   * Id of User
   **/
  @ApiModelProperty(value = "Id of User")
  @JsonProperty("user_id")
  public Long getUserId() {
    return userId;
  }
  public void setUserId(Long userId) {
    this.userId = userId;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduledTask {\n");
    
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    cronString: ").append(StringUtil.toIndentedString(cronString)).append("\n");
    sb.append("    timezone: ").append(StringUtil.toIndentedString(timezone)).append("\n");
    sb.append("    type: ").append(StringUtil.toIndentedString(type)).append("\n");
    sb.append("    userId: ").append(StringUtil.toIndentedString(userId)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
