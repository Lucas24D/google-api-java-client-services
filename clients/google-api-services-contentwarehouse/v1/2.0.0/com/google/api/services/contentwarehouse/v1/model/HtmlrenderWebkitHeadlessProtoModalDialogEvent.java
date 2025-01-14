/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.contentwarehouse.v1.model;

/**
 * Event for a modal dialog created by one of window.confirm(), window.prompt(), or window.alert().
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class HtmlrenderWebkitHeadlessProtoModalDialogEvent extends com.google.api.client.json.GenericJson {

  /**
   * Whether a confirm() or prompt() dialog was confirmed. Will not be present for an alert()
   * dialog.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean confirmed;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String message;

  /**
   * For a prompt() dialog, the result of the prompt. Will not be present for other types of
   * dialogs. If confirmed == false and the prompt had a default value, result will contain the
   * default value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String result;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Whether a confirm() or prompt() dialog was confirmed. Will not be present for an alert()
   * dialog.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getConfirmed() {
    return confirmed;
  }

  /**
   * Whether a confirm() or prompt() dialog was confirmed. Will not be present for an alert()
   * dialog.
   * @param confirmed confirmed or {@code null} for none
   */
  public HtmlrenderWebkitHeadlessProtoModalDialogEvent setConfirmed(java.lang.Boolean confirmed) {
    this.confirmed = confirmed;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getMessage() {
    return message;
  }

  /**
   * @param message message or {@code null} for none
   */
  public HtmlrenderWebkitHeadlessProtoModalDialogEvent setMessage(java.lang.String message) {
    this.message = message;
    return this;
  }

  /**
   * For a prompt() dialog, the result of the prompt. Will not be present for other types of
   * dialogs. If confirmed == false and the prompt had a default value, result will contain the
   * default value.
   * @return value or {@code null} for none
   */
  public java.lang.String getResult() {
    return result;
  }

  /**
   * For a prompt() dialog, the result of the prompt. Will not be present for other types of
   * dialogs. If confirmed == false and the prompt had a default value, result will contain the
   * default value.
   * @param result result or {@code null} for none
   */
  public HtmlrenderWebkitHeadlessProtoModalDialogEvent setResult(java.lang.String result) {
    this.result = result;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * @param type type or {@code null} for none
   */
  public HtmlrenderWebkitHeadlessProtoModalDialogEvent setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public HtmlrenderWebkitHeadlessProtoModalDialogEvent set(String fieldName, Object value) {
    return (HtmlrenderWebkitHeadlessProtoModalDialogEvent) super.set(fieldName, value);
  }

  @Override
  public HtmlrenderWebkitHeadlessProtoModalDialogEvent clone() {
    return (HtmlrenderWebkitHeadlessProtoModalDialogEvent) super.clone();
  }

}
