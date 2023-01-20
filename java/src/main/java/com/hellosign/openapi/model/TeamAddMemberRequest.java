/*
 * Dropbox Sign API
 * Dropbox Sign v3 API
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: apisupport@hellosign.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.hellosign.openapi.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.hellosign.openapi.JSON;


import com.hellosign.openapi.ApiException;
/**
 * TeamAddMemberRequest
 */
@JsonPropertyOrder({
    TeamAddMemberRequest.JSON_PROPERTY_ACCOUNT_ID,
    TeamAddMemberRequest.JSON_PROPERTY_EMAIL_ADDRESS,
    TeamAddMemberRequest.JSON_PROPERTY_ROLE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TeamAddMemberRequest {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "account_id";
  private String accountId;

  public static final String JSON_PROPERTY_EMAIL_ADDRESS = "email_address";
  private String emailAddress;

  /**
   * A role member will take in a new Team.  **Note**: This parameter is used only if &#x60;team_id&#x60; is provided.
   */
  public enum RoleEnum {
    MEMBER("Member"),
    
    DEVELOPER("Developer"),
    
    TEAM_MANAGER("Team Manager"),
    
    ADMIN("Admin");

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RoleEnum fromValue(String value) {
      for (RoleEnum b : RoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ROLE = "role";
  private RoleEnum role;

  public TeamAddMemberRequest() { 
  }

  public TeamAddMemberRequest accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * &#x60;account_id&#x60; or &#x60;email_address&#x60; is required. If both are provided, the account id prevails.  Account id of the user to invite to your Team.
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "`account_id` or `email_address` is required. If both are provided, the account id prevails.  Account id of the user to invite to your Team.")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public TeamAddMemberRequest emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * &#x60;account_id&#x60; or &#x60;email_address&#x60; is required, If both are provided, the account id prevails.  Email address of the user to invite to your Team.
   * @return emailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "`account_id` or `email_address` is required, If both are provided, the account id prevails.  Email address of the user to invite to your Team.")
  @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmailAddress() {
    return emailAddress;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  public TeamAddMemberRequest role(RoleEnum role) {
    this.role = role;
    return this;
  }

   /**
   * A role member will take in a new Team.  **Note**: This parameter is used only if &#x60;team_id&#x60; is provided.
   * @return role
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A role member will take in a new Team.  **Note**: This parameter is used only if `team_id` is provided.")
  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RoleEnum getRole() {
    return role;
  }


  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRole(RoleEnum role) {
    this.role = role;
  }


  /**
   * Return true if this TeamAddMemberRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamAddMemberRequest teamAddMemberRequest = (TeamAddMemberRequest) o;
    return Objects.equals(this.accountId, teamAddMemberRequest.accountId) &&
        Objects.equals(this.emailAddress, teamAddMemberRequest.emailAddress) &&
        Objects.equals(this.role, teamAddMemberRequest.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, emailAddress, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamAddMemberRequest {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (accountId != null) {
        if (isFileTypeOrListOfFiles(accountId)) {
            fileTypeFound = true;
        }

        if (accountId.getClass().equals(java.io.File.class) ||
            accountId.getClass().equals(Integer.class) ||
            accountId.getClass().equals(String.class) ||
            accountId.getClass().isEnum()) {
            map.put("account_id", accountId);
        } else if (isListOfFile(accountId)) {
            for(int i = 0; i< getListSize(accountId); i++) {
                map.put("account_id[" + i + "]", getFromList(accountId, i));
            }
        }
        else {
            map.put("account_id", JSON.getDefault().getMapper().writeValueAsString(accountId));
        }
    }
    if (emailAddress != null) {
        if (isFileTypeOrListOfFiles(emailAddress)) {
            fileTypeFound = true;
        }

        if (emailAddress.getClass().equals(java.io.File.class) ||
            emailAddress.getClass().equals(Integer.class) ||
            emailAddress.getClass().equals(String.class) ||
            emailAddress.getClass().isEnum()) {
            map.put("email_address", emailAddress);
        } else if (isListOfFile(emailAddress)) {
            for(int i = 0; i< getListSize(emailAddress); i++) {
                map.put("email_address[" + i + "]", getFromList(emailAddress, i));
            }
        }
        else {
            map.put("email_address", JSON.getDefault().getMapper().writeValueAsString(emailAddress));
        }
    }
    if (role != null) {
        if (isFileTypeOrListOfFiles(role)) {
            fileTypeFound = true;
        }

        if (role.getClass().equals(java.io.File.class) ||
            role.getClass().equals(Integer.class) ||
            role.getClass().equals(String.class) ||
            role.getClass().isEnum()) {
            map.put("role", role);
        } else if (isListOfFile(role)) {
            for(int i = 0; i< getListSize(role); i++) {
                map.put("role[" + i + "]", getFromList(role, i));
            }
        }
        else {
            map.put("role", JSON.getDefault().getMapper().writeValueAsString(role));
        }
    }
    } catch (Exception e) {
        throw new ApiException(e);
    }

    return fileTypeFound ? map : new HashMap<>();
  }

  private boolean isFileTypeOrListOfFiles(Object obj) throws Exception {
    return obj.getClass().equals(java.io.File.class) || isListOfFile(obj);
  }

  private boolean isListOfFile(Object obj) throws Exception {
      return obj instanceof java.util.List && !isListEmpty(obj) && getFromList(obj, 0) instanceof java.io.File;
  }

  private boolean isListEmpty(Object obj) throws Exception {
    return (boolean) Class.forName(java.util.List.class.getName()).getMethod("isEmpty").invoke(obj);
  }

  private Object getFromList(Object obj, int index) throws Exception {
    return Class.forName(java.util.List.class.getName()).getMethod("get", int.class).invoke(obj, index);
  }

  private int getListSize(Object obj) throws Exception {
    return (int) Class.forName(java.util.List.class.getName()).getMethod("size").invoke(obj);
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
