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

package com.google.api.services.dialogflow.v3beta1.model;

/**
 * Represents session information communicated to and from the webhook.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3SessionInfo extends com.google.api.client.json.GenericJson {

  /**
   * Optional for WebhookRequest. Optional for WebhookResponse. All parameters collected from forms
   * and intents during the session. Parameters can be created, updated, or removed by the webhook.
   * To remove a parameter from the session, the webhook should explicitly set the parameter value
   * to null in WebhookResponse. The map is keyed by parameters' display names.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> parameters;

  /**
   * Always present for WebhookRequest. Ignored for WebhookResponse. The unique identifier of the
   * session. This field can be used by the webhook to identify a session. Format:
   * `projects//locations//agents//sessions/` or
   * `projects//locations//agents//environments//sessions/` if environment is specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String session;

  /**
   * Optional for WebhookRequest. Optional for WebhookResponse. All parameters collected from forms
   * and intents during the session. Parameters can be created, updated, or removed by the webhook.
   * To remove a parameter from the session, the webhook should explicitly set the parameter value
   * to null in WebhookResponse. The map is keyed by parameters' display names.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getParameters() {
    return parameters;
  }

  /**
   * Optional for WebhookRequest. Optional for WebhookResponse. All parameters collected from forms
   * and intents during the session. Parameters can be created, updated, or removed by the webhook.
   * To remove a parameter from the session, the webhook should explicitly set the parameter value
   * to null in WebhookResponse. The map is keyed by parameters' display names.
   * @param parameters parameters or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3SessionInfo setParameters(java.util.Map<String, java.lang.Object> parameters) {
    this.parameters = parameters;
    return this;
  }

  /**
   * Always present for WebhookRequest. Ignored for WebhookResponse. The unique identifier of the
   * session. This field can be used by the webhook to identify a session. Format:
   * `projects//locations//agents//sessions/` or
   * `projects//locations//agents//environments//sessions/` if environment is specified.
   * @return value or {@code null} for none
   */
  public java.lang.String getSession() {
    return session;
  }

  /**
   * Always present for WebhookRequest. Ignored for WebhookResponse. The unique identifier of the
   * session. This field can be used by the webhook to identify a session. Format:
   * `projects//locations//agents//sessions/` or
   * `projects//locations//agents//environments//sessions/` if environment is specified.
   * @param session session or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3SessionInfo setSession(java.lang.String session) {
    this.session = session;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3SessionInfo set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3SessionInfo) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3SessionInfo clone() {
    return (GoogleCloudDialogflowCxV3SessionInfo) super.clone();
  }

}