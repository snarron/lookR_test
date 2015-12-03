package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-08T14:44:15.944-07:00")
public class SpaceBase   {
  
  private String id = null;
  private Long creatorId = null;
  private String name = null;
  private Boolean isPersonal = null;

  
  /**
   * Unique Id
   **/
  @ApiModelProperty(value = "Unique Id")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * User Id of Creator
   **/
  @ApiModelProperty(value = "User Id of Creator")
  @JsonProperty("creator_id")
  public Long getCreatorId() {
    return creatorId;
  }
  public void setCreatorId(Long creatorId) {
    this.creatorId = creatorId;
  }

  
  /**
   * Unique Name
   **/
  @ApiModelProperty(value = "Unique Name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Space is a user's personal space
   **/
  @ApiModelProperty(value = "Space is a user's personal space")
  @JsonProperty("is_personal")
  public Boolean getIsPersonal() {
    return isPersonal;
  }
  public void setIsPersonal(Boolean isPersonal) {
    this.isPersonal = isPersonal;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpaceBase {\n");
    
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    creatorId: ").append(StringUtil.toIndentedString(creatorId)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    isPersonal: ").append(StringUtil.toIndentedString(isPersonal)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
