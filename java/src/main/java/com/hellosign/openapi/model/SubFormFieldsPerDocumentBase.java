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
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.hellosign.openapi.model.SubFormFieldsPerDocumentCheckbox;
import com.hellosign.openapi.model.SubFormFieldsPerDocumentCheckboxMerge;
import com.hellosign.openapi.model.SubFormFieldsPerDocumentDateSigned;
import com.hellosign.openapi.model.SubFormFieldsPerDocumentDropdown;
import com.hellosign.openapi.model.SubFormFieldsPerDocumentHyperlink;
import com.hellosign.openapi.model.SubFormFieldsPerDocumentInitials;
import com.hellosign.openapi.model.SubFormFieldsPerDocumentRadio;
import com.hellosign.openapi.model.SubFormFieldsPerDocumentSignature;
import com.hellosign.openapi.model.SubFormFieldsPerDocumentText;
import com.hellosign.openapi.model.SubFormFieldsPerDocumentTextMerge;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.hellosign.openapi.JSON;


import com.hellosign.openapi.ApiException;
/**
 * The fields that should appear on the document, expressed as an array of objects. (We&#39;re currently fixing a bug where this property only accepts a two-dimensional array. You can read about it here: &lt;a href&#x3D;\&quot;/docs/openapi/form-fields-per-document\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Using Form Fields per Document&lt;/a&gt;.)  **NOTE**: Fields like **text**, **dropdown**, **checkbox**, **radio**, and **hyperlink** have additional required and optional parameters. Check out the list of [additional parameters](/api/reference/constants/#form-fields-per-document) for these field types.  * Text Field use &#x60;SubFormFieldsPerDocumentText&#x60; * Dropdown Field use &#x60;SubFormFieldsPerDocumentDropdown&#x60; * Hyperlink Field use &#x60;SubFormFieldsPerDocumentHyperlink&#x60; * Checkbox Field use &#x60;SubFormFieldsPerDocumentCheckbox&#x60; * Radio Field use &#x60;SubFormFieldsPerDocumentRadio&#x60; * Signature Field use &#x60;SubFormFieldsPerDocumentSignature&#x60; * Date Signed Field use &#x60;SubFormFieldsPerDocumentDateSigned&#x60; * Initials Field use &#x60;SubFormFieldsPerDocumentInitials&#x60; * Text Merge Field use &#x60;SubFormFieldsPerDocumentTextMerge&#x60; * Checkbox Merge Field use &#x60;SubFormFieldsPerDocumentCheckboxMerge&#x60;
 */
@ApiModel(description = "The fields that should appear on the document, expressed as an array of objects. (We're currently fixing a bug where this property only accepts a two-dimensional array. You can read about it here: <a href=\"/docs/openapi/form-fields-per-document\" target=\"_blank\">Using Form Fields per Document</a>.)  **NOTE**: Fields like **text**, **dropdown**, **checkbox**, **radio**, and **hyperlink** have additional required and optional parameters. Check out the list of [additional parameters](/api/reference/constants/#form-fields-per-document) for these field types.  * Text Field use `SubFormFieldsPerDocumentText` * Dropdown Field use `SubFormFieldsPerDocumentDropdown` * Hyperlink Field use `SubFormFieldsPerDocumentHyperlink` * Checkbox Field use `SubFormFieldsPerDocumentCheckbox` * Radio Field use `SubFormFieldsPerDocumentRadio` * Signature Field use `SubFormFieldsPerDocumentSignature` * Date Signed Field use `SubFormFieldsPerDocumentDateSigned` * Initials Field use `SubFormFieldsPerDocumentInitials` * Text Merge Field use `SubFormFieldsPerDocumentTextMerge` * Checkbox Merge Field use `SubFormFieldsPerDocumentCheckboxMerge`")
@JsonPropertyOrder({
    SubFormFieldsPerDocumentBase.JSON_PROPERTY_DOCUMENT_INDEX,
    SubFormFieldsPerDocumentBase.JSON_PROPERTY_API_ID,
    SubFormFieldsPerDocumentBase.JSON_PROPERTY_HEIGHT,
    SubFormFieldsPerDocumentBase.JSON_PROPERTY_REQUIRED,
    SubFormFieldsPerDocumentBase.JSON_PROPERTY_SIGNER,
    SubFormFieldsPerDocumentBase.JSON_PROPERTY_TYPE,
    SubFormFieldsPerDocumentBase.JSON_PROPERTY_WIDTH,
    SubFormFieldsPerDocumentBase.JSON_PROPERTY_X,
    SubFormFieldsPerDocumentBase.JSON_PROPERTY_Y,
    SubFormFieldsPerDocumentBase.JSON_PROPERTY_NAME,
    SubFormFieldsPerDocumentBase.JSON_PROPERTY_PAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = SubFormFieldsPerDocumentCheckbox.class, name = "SubFormFieldsPerDocumentCheckbox"),
  @JsonSubTypes.Type(value = SubFormFieldsPerDocumentCheckboxMerge.class, name = "SubFormFieldsPerDocumentCheckboxMerge"),
  @JsonSubTypes.Type(value = SubFormFieldsPerDocumentDateSigned.class, name = "SubFormFieldsPerDocumentDateSigned"),
  @JsonSubTypes.Type(value = SubFormFieldsPerDocumentDropdown.class, name = "SubFormFieldsPerDocumentDropdown"),
  @JsonSubTypes.Type(value = SubFormFieldsPerDocumentHyperlink.class, name = "SubFormFieldsPerDocumentHyperlink"),
  @JsonSubTypes.Type(value = SubFormFieldsPerDocumentInitials.class, name = "SubFormFieldsPerDocumentInitials"),
  @JsonSubTypes.Type(value = SubFormFieldsPerDocumentRadio.class, name = "SubFormFieldsPerDocumentRadio"),
  @JsonSubTypes.Type(value = SubFormFieldsPerDocumentSignature.class, name = "SubFormFieldsPerDocumentSignature"),
  @JsonSubTypes.Type(value = SubFormFieldsPerDocumentText.class, name = "SubFormFieldsPerDocumentText"),
  @JsonSubTypes.Type(value = SubFormFieldsPerDocumentTextMerge.class, name = "SubFormFieldsPerDocumentTextMerge"),
  @JsonSubTypes.Type(value = SubFormFieldsPerDocumentCheckbox.class, name = "checkbox"),
  @JsonSubTypes.Type(value = SubFormFieldsPerDocumentCheckboxMerge.class, name = "checkbox-merge"),
  @JsonSubTypes.Type(value = SubFormFieldsPerDocumentDateSigned.class, name = "date_signed"),
  @JsonSubTypes.Type(value = SubFormFieldsPerDocumentDropdown.class, name = "dropdown"),
  @JsonSubTypes.Type(value = SubFormFieldsPerDocumentHyperlink.class, name = "hyperlink"),
  @JsonSubTypes.Type(value = SubFormFieldsPerDocumentInitials.class, name = "initials"),
  @JsonSubTypes.Type(value = SubFormFieldsPerDocumentRadio.class, name = "radio"),
  @JsonSubTypes.Type(value = SubFormFieldsPerDocumentSignature.class, name = "signature"),
  @JsonSubTypes.Type(value = SubFormFieldsPerDocumentText.class, name = "text"),
  @JsonSubTypes.Type(value = SubFormFieldsPerDocumentTextMerge.class, name = "text-merge"),
})

public class SubFormFieldsPerDocumentBase {
  public static final String JSON_PROPERTY_DOCUMENT_INDEX = "document_index";
  private Integer documentIndex;

  public static final String JSON_PROPERTY_API_ID = "api_id";
  private String apiId;

  public static final String JSON_PROPERTY_HEIGHT = "height";
  private Integer height;

  public static final String JSON_PROPERTY_REQUIRED = "required";
  private Boolean required;

  public static final String JSON_PROPERTY_SIGNER = "signer";
  private String signer;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_WIDTH = "width";
  private Integer width;

  public static final String JSON_PROPERTY_X = "x";
  private Integer x;

  public static final String JSON_PROPERTY_Y = "y";
  private Integer y;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PAGE = "page";
  private Integer page;

  public SubFormFieldsPerDocumentBase() { 
  }

  public SubFormFieldsPerDocumentBase documentIndex(Integer documentIndex) {
    this.documentIndex = documentIndex;
    return this;
  }

   /**
   * Represents the integer index of the &#x60;file&#x60; or &#x60;file_url&#x60; document the field should be attached to.
   * @return documentIndex
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Represents the integer index of the `file` or `file_url` document the field should be attached to.")
  @JsonProperty(JSON_PROPERTY_DOCUMENT_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getDocumentIndex() {
    return documentIndex;
  }


  @JsonProperty(JSON_PROPERTY_DOCUMENT_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDocumentIndex(Integer documentIndex) {
    this.documentIndex = documentIndex;
  }


  public SubFormFieldsPerDocumentBase apiId(String apiId) {
    this.apiId = apiId;
    return this;
  }

   /**
   * An identifier for the field that is unique across all documents in the request.
   * @return apiId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "An identifier for the field that is unique across all documents in the request.")
  @JsonProperty(JSON_PROPERTY_API_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getApiId() {
    return apiId;
  }


  @JsonProperty(JSON_PROPERTY_API_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setApiId(String apiId) {
    this.apiId = apiId;
  }


  public SubFormFieldsPerDocumentBase height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Size of the field in pixels.
   * @return height
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Size of the field in pixels.")
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getHeight() {
    return height;
  }


  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHeight(Integer height) {
    this.height = height;
  }


  public SubFormFieldsPerDocumentBase required(Boolean required) {
    this.required = required;
    return this;
  }

   /**
   * Whether this field is required.
   * @return required
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Whether this field is required.")
  @JsonProperty(JSON_PROPERTY_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getRequired() {
    return required;
  }


  @JsonProperty(JSON_PROPERTY_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRequired(Boolean required) {
    this.required = required;
  }


  public SubFormFieldsPerDocumentBase signer(String signer) {
    this.signer = signer;
    return this;
  }

   /**
   * Signer index identified by the offset in the signers parameter (0-based indexing), indicating which signer should fill out the field.  **NOTE**: If type is &#x60;text-merge&#x60; or &#x60;checkbox-merge&#x60;, you must set this to sender in order to use pre-filled data.
   * @return signer
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Signer index identified by the offset in the signers parameter (0-based indexing), indicating which signer should fill out the field.  **NOTE**: If type is `text-merge` or `checkbox-merge`, you must set this to sender in order to use pre-filled data.")
  @JsonProperty(JSON_PROPERTY_SIGNER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSigner() {
    return signer;
  }


  @JsonProperty(JSON_PROPERTY_SIGNER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSigner(String signer) {
    this.signer = signer;
  }


  public SubFormFieldsPerDocumentBase type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(String type) {
    this.type = type;
  }


  public SubFormFieldsPerDocumentBase width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Size of the field in pixels.
   * @return width
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Size of the field in pixels.")
  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getWidth() {
    return width;
  }


  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWidth(Integer width) {
    this.width = width;
  }


  public SubFormFieldsPerDocumentBase x(Integer x) {
    this.x = x;
    return this;
  }

   /**
   * Location coordinates of the field in pixels.
   * @return x
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Location coordinates of the field in pixels.")
  @JsonProperty(JSON_PROPERTY_X)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getX() {
    return x;
  }


  @JsonProperty(JSON_PROPERTY_X)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setX(Integer x) {
    this.x = x;
  }


  public SubFormFieldsPerDocumentBase y(Integer y) {
    this.y = y;
    return this;
  }

   /**
   * Location coordinates of the field in pixels.
   * @return y
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Location coordinates of the field in pixels.")
  @JsonProperty(JSON_PROPERTY_Y)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getY() {
    return y;
  }


  @JsonProperty(JSON_PROPERTY_Y)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setY(Integer y) {
    this.y = y;
  }


  public SubFormFieldsPerDocumentBase name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Display name for the field.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Display name for the field.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public SubFormFieldsPerDocumentBase page(Integer page) {
    this.page = page;
    return this;
  }

   /**
   * Page in the document where the field should be placed (requires documents be PDF files).  - When the page number parameter is supplied, the API will use the new coordinate system. - Check out the differences between both [coordinate systems](https://faq.hellosign.com/hc/en-us/articles/217115577) and how to use them.
   * @return page
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Page in the document where the field should be placed (requires documents be PDF files).  - When the page number parameter is supplied, the API will use the new coordinate system. - Check out the differences between both [coordinate systems](https://faq.hellosign.com/hc/en-us/articles/217115577) and how to use them.")
  @JsonProperty(JSON_PROPERTY_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPage() {
    return page;
  }


  @JsonProperty(JSON_PROPERTY_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPage(Integer page) {
    this.page = page;
  }


  /**
   * Return true if this SubFormFieldsPerDocumentBase object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubFormFieldsPerDocumentBase subFormFieldsPerDocumentBase = (SubFormFieldsPerDocumentBase) o;
    return Objects.equals(this.documentIndex, subFormFieldsPerDocumentBase.documentIndex) &&
        Objects.equals(this.apiId, subFormFieldsPerDocumentBase.apiId) &&
        Objects.equals(this.height, subFormFieldsPerDocumentBase.height) &&
        Objects.equals(this.required, subFormFieldsPerDocumentBase.required) &&
        Objects.equals(this.signer, subFormFieldsPerDocumentBase.signer) &&
        Objects.equals(this.type, subFormFieldsPerDocumentBase.type) &&
        Objects.equals(this.width, subFormFieldsPerDocumentBase.width) &&
        Objects.equals(this.x, subFormFieldsPerDocumentBase.x) &&
        Objects.equals(this.y, subFormFieldsPerDocumentBase.y) &&
        Objects.equals(this.name, subFormFieldsPerDocumentBase.name) &&
        Objects.equals(this.page, subFormFieldsPerDocumentBase.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentIndex, apiId, height, required, signer, type, width, x, y, name, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubFormFieldsPerDocumentBase {\n");
    sb.append("    documentIndex: ").append(toIndentedString(documentIndex)).append("\n");
    sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    signer: ").append(toIndentedString(signer)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (documentIndex != null) {
        if (isFileTypeOrListOfFiles(documentIndex)) {
            fileTypeFound = true;
        }

        if (documentIndex.getClass().equals(java.io.File.class) ||
            documentIndex.getClass().equals(Integer.class) ||
            documentIndex.getClass().equals(String.class) ||
            documentIndex.getClass().isEnum()) {
            map.put("document_index", documentIndex);
        } else if (isListOfFile(documentIndex)) {
            for(int i = 0; i< getListSize(documentIndex); i++) {
                map.put("document_index[" + i + "]", getFromList(documentIndex, i));
            }
        }
        else {
            map.put("document_index", JSON.getDefault().getMapper().writeValueAsString(documentIndex));
        }
    }
    if (apiId != null) {
        if (isFileTypeOrListOfFiles(apiId)) {
            fileTypeFound = true;
        }

        if (apiId.getClass().equals(java.io.File.class) ||
            apiId.getClass().equals(Integer.class) ||
            apiId.getClass().equals(String.class) ||
            apiId.getClass().isEnum()) {
            map.put("api_id", apiId);
        } else if (isListOfFile(apiId)) {
            for(int i = 0; i< getListSize(apiId); i++) {
                map.put("api_id[" + i + "]", getFromList(apiId, i));
            }
        }
        else {
            map.put("api_id", JSON.getDefault().getMapper().writeValueAsString(apiId));
        }
    }
    if (height != null) {
        if (isFileTypeOrListOfFiles(height)) {
            fileTypeFound = true;
        }

        if (height.getClass().equals(java.io.File.class) ||
            height.getClass().equals(Integer.class) ||
            height.getClass().equals(String.class) ||
            height.getClass().isEnum()) {
            map.put("height", height);
        } else if (isListOfFile(height)) {
            for(int i = 0; i< getListSize(height); i++) {
                map.put("height[" + i + "]", getFromList(height, i));
            }
        }
        else {
            map.put("height", JSON.getDefault().getMapper().writeValueAsString(height));
        }
    }
    if (required != null) {
        if (isFileTypeOrListOfFiles(required)) {
            fileTypeFound = true;
        }

        if (required.getClass().equals(java.io.File.class) ||
            required.getClass().equals(Integer.class) ||
            required.getClass().equals(String.class) ||
            required.getClass().isEnum()) {
            map.put("required", required);
        } else if (isListOfFile(required)) {
            for(int i = 0; i< getListSize(required); i++) {
                map.put("required[" + i + "]", getFromList(required, i));
            }
        }
        else {
            map.put("required", JSON.getDefault().getMapper().writeValueAsString(required));
        }
    }
    if (signer != null) {
        if (isFileTypeOrListOfFiles(signer)) {
            fileTypeFound = true;
        }

        if (signer.getClass().equals(java.io.File.class) ||
            signer.getClass().equals(Integer.class) ||
            signer.getClass().equals(String.class) ||
            signer.getClass().isEnum()) {
            map.put("signer", signer);
        } else if (isListOfFile(signer)) {
            for(int i = 0; i< getListSize(signer); i++) {
                map.put("signer[" + i + "]", getFromList(signer, i));
            }
        }
        else {
            map.put("signer", JSON.getDefault().getMapper().writeValueAsString(signer));
        }
    }
    if (type != null) {
        if (isFileTypeOrListOfFiles(type)) {
            fileTypeFound = true;
        }

        if (type.getClass().equals(java.io.File.class) ||
            type.getClass().equals(Integer.class) ||
            type.getClass().equals(String.class) ||
            type.getClass().isEnum()) {
            map.put("type", type);
        } else if (isListOfFile(type)) {
            for(int i = 0; i< getListSize(type); i++) {
                map.put("type[" + i + "]", getFromList(type, i));
            }
        }
        else {
            map.put("type", JSON.getDefault().getMapper().writeValueAsString(type));
        }
    }
    if (width != null) {
        if (isFileTypeOrListOfFiles(width)) {
            fileTypeFound = true;
        }

        if (width.getClass().equals(java.io.File.class) ||
            width.getClass().equals(Integer.class) ||
            width.getClass().equals(String.class) ||
            width.getClass().isEnum()) {
            map.put("width", width);
        } else if (isListOfFile(width)) {
            for(int i = 0; i< getListSize(width); i++) {
                map.put("width[" + i + "]", getFromList(width, i));
            }
        }
        else {
            map.put("width", JSON.getDefault().getMapper().writeValueAsString(width));
        }
    }
    if (x != null) {
        if (isFileTypeOrListOfFiles(x)) {
            fileTypeFound = true;
        }

        if (x.getClass().equals(java.io.File.class) ||
            x.getClass().equals(Integer.class) ||
            x.getClass().equals(String.class) ||
            x.getClass().isEnum()) {
            map.put("x", x);
        } else if (isListOfFile(x)) {
            for(int i = 0; i< getListSize(x); i++) {
                map.put("x[" + i + "]", getFromList(x, i));
            }
        }
        else {
            map.put("x", JSON.getDefault().getMapper().writeValueAsString(x));
        }
    }
    if (y != null) {
        if (isFileTypeOrListOfFiles(y)) {
            fileTypeFound = true;
        }

        if (y.getClass().equals(java.io.File.class) ||
            y.getClass().equals(Integer.class) ||
            y.getClass().equals(String.class) ||
            y.getClass().isEnum()) {
            map.put("y", y);
        } else if (isListOfFile(y)) {
            for(int i = 0; i< getListSize(y); i++) {
                map.put("y[" + i + "]", getFromList(y, i));
            }
        }
        else {
            map.put("y", JSON.getDefault().getMapper().writeValueAsString(y));
        }
    }
    if (name != null) {
        if (isFileTypeOrListOfFiles(name)) {
            fileTypeFound = true;
        }

        if (name.getClass().equals(java.io.File.class) ||
            name.getClass().equals(Integer.class) ||
            name.getClass().equals(String.class) ||
            name.getClass().isEnum()) {
            map.put("name", name);
        } else if (isListOfFile(name)) {
            for(int i = 0; i< getListSize(name); i++) {
                map.put("name[" + i + "]", getFromList(name, i));
            }
        }
        else {
            map.put("name", JSON.getDefault().getMapper().writeValueAsString(name));
        }
    }
    if (page != null) {
        if (isFileTypeOrListOfFiles(page)) {
            fileTypeFound = true;
        }

        if (page.getClass().equals(java.io.File.class) ||
            page.getClass().equals(Integer.class) ||
            page.getClass().equals(String.class) ||
            page.getClass().isEnum()) {
            map.put("page", page);
        } else if (isListOfFile(page)) {
            for(int i = 0; i< getListSize(page); i++) {
                map.put("page[" + i + "]", getFromList(page, i));
            }
        }
        else {
            map.put("page", JSON.getDefault().getMapper().writeValueAsString(page));
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

static {
  // Initialize and register the discriminator mappings.
  Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
  mappings.put("SubFormFieldsPerDocumentCheckbox", SubFormFieldsPerDocumentCheckbox.class);
  mappings.put("SubFormFieldsPerDocumentCheckboxMerge", SubFormFieldsPerDocumentCheckboxMerge.class);
  mappings.put("SubFormFieldsPerDocumentDateSigned", SubFormFieldsPerDocumentDateSigned.class);
  mappings.put("SubFormFieldsPerDocumentDropdown", SubFormFieldsPerDocumentDropdown.class);
  mappings.put("SubFormFieldsPerDocumentHyperlink", SubFormFieldsPerDocumentHyperlink.class);
  mappings.put("SubFormFieldsPerDocumentInitials", SubFormFieldsPerDocumentInitials.class);
  mappings.put("SubFormFieldsPerDocumentRadio", SubFormFieldsPerDocumentRadio.class);
  mappings.put("SubFormFieldsPerDocumentSignature", SubFormFieldsPerDocumentSignature.class);
  mappings.put("SubFormFieldsPerDocumentText", SubFormFieldsPerDocumentText.class);
  mappings.put("SubFormFieldsPerDocumentTextMerge", SubFormFieldsPerDocumentTextMerge.class);
  mappings.put("checkbox", SubFormFieldsPerDocumentCheckbox.class);
  mappings.put("checkbox-merge", SubFormFieldsPerDocumentCheckboxMerge.class);
  mappings.put("date_signed", SubFormFieldsPerDocumentDateSigned.class);
  mappings.put("dropdown", SubFormFieldsPerDocumentDropdown.class);
  mappings.put("hyperlink", SubFormFieldsPerDocumentHyperlink.class);
  mappings.put("initials", SubFormFieldsPerDocumentInitials.class);
  mappings.put("radio", SubFormFieldsPerDocumentRadio.class);
  mappings.put("signature", SubFormFieldsPerDocumentSignature.class);
  mappings.put("text", SubFormFieldsPerDocumentText.class);
  mappings.put("text-merge", SubFormFieldsPerDocumentTextMerge.class);
  mappings.put("SubFormFieldsPerDocumentBase", SubFormFieldsPerDocumentBase.class);
  JSON.registerDiscriminator(SubFormFieldsPerDocumentBase.class, "type", mappings);
}
}

