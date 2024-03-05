/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 500.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.32
 * Contact: info@fattureincloud.it
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package it.fattureincloud.sdk;

import java.util.List;
import java.util.Map;

/** ApiException class. */
@SuppressWarnings("serial")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-03-05T15:34:38.736484Z[Etc/UTC]")
public class ApiException extends Exception {
  private static final long serialVersionUID = 1L;

  private int code = 0;
  private Map<String, List<String>> responseHeaders = null;
  private String responseBody = null;

  /** Constructor for ApiException. */
  public ApiException() {}

  /**
   * Constructor for ApiException.
   *
   * @param throwable a {@link java.lang.Throwable} object
   */
  public ApiException(Throwable throwable) {
    super(throwable);
  }

  /**
   * Constructor for ApiException.
   *
   * @param message the error message
   */
  public ApiException(String message) {
    super(message);
  }

  /**
   * Constructor for ApiException.
   *
   * @param message the error message
   * @param throwable a {@link java.lang.Throwable} object
   * @param code HTTP status code
   * @param responseHeaders a {@link java.util.Map} of HTTP response headers
   * @param responseBody the response body
   */
  public ApiException(
      String message,
      Throwable throwable,
      int code,
      Map<String, List<String>> responseHeaders,
      String responseBody) {
    super(message, throwable);
    this.code = code;
    this.responseHeaders = responseHeaders;
    this.responseBody = responseBody;
  }

  /**
   * Constructor for ApiException.
   *
   * @param message the error message
   * @param code HTTP status code
   * @param responseHeaders a {@link java.util.Map} of HTTP response headers
   * @param responseBody the response body
   */
  public ApiException(
      String message, int code, Map<String, List<String>> responseHeaders, String responseBody) {
    this(message, (Throwable) null, code, responseHeaders, responseBody);
  }

  /**
   * Constructor for ApiException.
   *
   * @param message the error message
   * @param throwable a {@link java.lang.Throwable} object
   * @param code HTTP status code
   * @param responseHeaders a {@link java.util.Map} of HTTP response headers
   */
  public ApiException(
      String message, Throwable throwable, int code, Map<String, List<String>> responseHeaders) {
    this(message, throwable, code, responseHeaders, null);
  }

  /**
   * Constructor for ApiException.
   *
   * @param code HTTP status code
   * @param responseHeaders a {@link java.util.Map} of HTTP response headers
   * @param responseBody the response body
   */
  public ApiException(int code, Map<String, List<String>> responseHeaders, String responseBody) {
    this(
        "Response Code: " + code + " Response Body: " + responseBody,
        (Throwable) null,
        code,
        responseHeaders,
        responseBody);
  }

  /**
   * Constructor for ApiException.
   *
   * @param code HTTP status code
   * @param message a {@link java.lang.String} object
   */
  public ApiException(int code, String message) {
    super(message);
    this.code = code;
  }

  /**
   * Constructor for ApiException.
   *
   * @param code HTTP status code
   * @param message the error message
   * @param responseHeaders a {@link java.util.Map} of HTTP response headers
   * @param responseBody the response body
   */
  public ApiException(
      int code, String message, Map<String, List<String>> responseHeaders, String responseBody) {
    this(code, message);
    this.responseHeaders = responseHeaders;
    this.responseBody = responseBody;
  }

  /**
   * Get the HTTP status code.
   *
   * @return HTTP status code
   */
  public int getCode() {
    return code;
  }

  /**
   * Get the HTTP response headers.
   *
   * @return A map of list of string
   */
  public Map<String, List<String>> getResponseHeaders() {
    return responseHeaders;
  }

  /**
   * Get the HTTP response body.
   *
   * @return Response body in the form of string
   */
  public String getResponseBody() {
    return responseBody;
  }

  /**
   * Get the exception message including HTTP response data.
   *
   * @return The exception message
   */
  public String getMessage() {
    return String.format(
        "Message: %s%nHTTP response code: %s%nHTTP response body: %s%nHTTP response headers: %s",
        super.getMessage(), this.getCode(), this.getResponseBody(), this.getResponseHeaders());
  }
}
