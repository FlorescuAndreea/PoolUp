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
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2014-07-22 21:53:01 UTC)
 * on 2014-08-01 at 11:24:18 UTC 
 * Modify at your own risk.
 */

package com.example.mymodule.server.serverRouteEndpoint;

/**
 * Service definition for ServerRouteEndpoint (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link ServerRouteEndpointRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class ServerRouteEndpoint extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.19.0 of the serverRouteEndpoint library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://graphite-buffer-657.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "serverRouteEndpoint/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public ServerRouteEndpoint(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  ServerRouteEndpoint(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "getServerRoute".
   *
   * This request holds the parameters needed by the serverRouteEndpoint server.  After setting any
   * optional parameters, call the {@link GetServerRoute#execute()} method to invoke the remote
   * operation.
   *
   * @param id
   * @return the request
   */
  public GetServerRoute getServerRoute(java.lang.Long id) throws java.io.IOException {
    GetServerRoute result = new GetServerRoute(id);
    initialize(result);
    return result;
  }

  public class GetServerRoute extends ServerRouteEndpointRequest<com.example.mymodule.server.serverRouteEndpoint.model.ServerRoute> {

    private static final String REST_PATH = "route/get";

    /**
     * Create a request for the method "getServerRoute".
     *
     * This request holds the parameters needed by the the serverRouteEndpoint server.  After setting
     * any optional parameters, call the {@link GetServerRoute#execute()} method to invoke the remote
     * operation. <p> {@link GetServerRoute#initialize(com.google.api.client.googleapis.services.Abstr
     * actGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected GetServerRoute(java.lang.Long id) {
      super(ServerRouteEndpoint.this, "GET", REST_PATH, null, com.example.mymodule.server.serverRouteEndpoint.model.ServerRoute.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetServerRoute setAlt(java.lang.String alt) {
      return (GetServerRoute) super.setAlt(alt);
    }

    @Override
    public GetServerRoute setFields(java.lang.String fields) {
      return (GetServerRoute) super.setFields(fields);
    }

    @Override
    public GetServerRoute setKey(java.lang.String key) {
      return (GetServerRoute) super.setKey(key);
    }

    @Override
    public GetServerRoute setOauthToken(java.lang.String oauthToken) {
      return (GetServerRoute) super.setOauthToken(oauthToken);
    }

    @Override
    public GetServerRoute setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetServerRoute) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetServerRoute setQuotaUser(java.lang.String quotaUser) {
      return (GetServerRoute) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetServerRoute setUserIp(java.lang.String userIp) {
      return (GetServerRoute) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public GetServerRoute setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public GetServerRoute set(String parameterName, Object value) {
      return (GetServerRoute) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "insertServerRoute".
   *
   * This request holds the parameters needed by the serverRouteEndpoint server.  After setting any
   * optional parameters, call the {@link InsertServerRoute#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.example.mymodule.server.serverRouteEndpoint.model.ServerRoute}
   * @return the request
   */
  public InsertServerRoute insertServerRoute(com.example.mymodule.server.serverRouteEndpoint.model.ServerRoute content) throws java.io.IOException {
    InsertServerRoute result = new InsertServerRoute(content);
    initialize(result);
    return result;
  }

  public class InsertServerRoute extends ServerRouteEndpointRequest<Void> {

    private static final String REST_PATH = "void";

    /**
     * Create a request for the method "insertServerRoute".
     *
     * This request holds the parameters needed by the the serverRouteEndpoint server.  After setting
     * any optional parameters, call the {@link InsertServerRoute#execute()} method to invoke the
     * remote operation. <p> {@link InsertServerRoute#initialize(com.google.api.client.googleapis.serv
     * ices.AbstractGoogleClientRequest)} must be called to initialize this instance immediately after
     * invoking the constructor. </p>
     *
     * @param content the {@link com.example.mymodule.server.serverRouteEndpoint.model.ServerRoute}
     * @since 1.13
     */
    protected InsertServerRoute(com.example.mymodule.server.serverRouteEndpoint.model.ServerRoute content) {
      super(ServerRouteEndpoint.this, "POST", REST_PATH, content, Void.class);
    }

    @Override
    public InsertServerRoute setAlt(java.lang.String alt) {
      return (InsertServerRoute) super.setAlt(alt);
    }

    @Override
    public InsertServerRoute setFields(java.lang.String fields) {
      return (InsertServerRoute) super.setFields(fields);
    }

    @Override
    public InsertServerRoute setKey(java.lang.String key) {
      return (InsertServerRoute) super.setKey(key);
    }

    @Override
    public InsertServerRoute setOauthToken(java.lang.String oauthToken) {
      return (InsertServerRoute) super.setOauthToken(oauthToken);
    }

    @Override
    public InsertServerRoute setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (InsertServerRoute) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public InsertServerRoute setQuotaUser(java.lang.String quotaUser) {
      return (InsertServerRoute) super.setQuotaUser(quotaUser);
    }

    @Override
    public InsertServerRoute setUserIp(java.lang.String userIp) {
      return (InsertServerRoute) super.setUserIp(userIp);
    }

    @Override
    public InsertServerRoute set(String parameterName, Object value) {
      return (InsertServerRoute) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "listRoutes".
   *
   * This request holds the parameters needed by the serverRouteEndpoint server.  After setting any
   * optional parameters, call the {@link ListRoutes#execute()} method to invoke the remote operation.
   *
   * @param flexibility
   * @param latitudeEnd
   * @param latitudeStart
   * @param longitudeEnd
   * @param longitudeStart
   * @return the request
   */
  public ListRoutes listRoutes(java.lang.Integer flexibility, java.lang.Double latitudeEnd, java.lang.Double latitudeStart, java.lang.Double longitudeEnd, java.lang.Double longitudeStart) throws java.io.IOException {
    ListRoutes result = new ListRoutes(flexibility, latitudeEnd, latitudeStart, longitudeEnd, longitudeStart);
    initialize(result);
    return result;
  }

  public class ListRoutes extends ServerRouteEndpointRequest<com.example.mymodule.server.serverRouteEndpoint.model.ServerRouteCollection> {

    private static final String REST_PATH = "route/list";

    /**
     * Create a request for the method "listRoutes".
     *
     * This request holds the parameters needed by the the serverRouteEndpoint server.  After setting
     * any optional parameters, call the {@link ListRoutes#execute()} method to invoke the remote
     * operation. <p> {@link
     * ListRoutes#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param flexibility
     * @param latitudeEnd
     * @param latitudeStart
     * @param longitudeEnd
     * @param longitudeStart
     * @since 1.13
     */
    protected ListRoutes(java.lang.Integer flexibility, java.lang.Double latitudeEnd, java.lang.Double latitudeStart, java.lang.Double longitudeEnd, java.lang.Double longitudeStart) {
      super(ServerRouteEndpoint.this, "GET", REST_PATH, null, com.example.mymodule.server.serverRouteEndpoint.model.ServerRouteCollection.class);
      this.flexibility = com.google.api.client.util.Preconditions.checkNotNull(flexibility, "Required parameter flexibility must be specified.");
      this.latitudeEnd = com.google.api.client.util.Preconditions.checkNotNull(latitudeEnd, "Required parameter latitudeEnd must be specified.");
      this.latitudeStart = com.google.api.client.util.Preconditions.checkNotNull(latitudeStart, "Required parameter latitudeStart must be specified.");
      this.longitudeEnd = com.google.api.client.util.Preconditions.checkNotNull(longitudeEnd, "Required parameter longitudeEnd must be specified.");
      this.longitudeStart = com.google.api.client.util.Preconditions.checkNotNull(longitudeStart, "Required parameter longitudeStart must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public ListRoutes setAlt(java.lang.String alt) {
      return (ListRoutes) super.setAlt(alt);
    }

    @Override
    public ListRoutes setFields(java.lang.String fields) {
      return (ListRoutes) super.setFields(fields);
    }

    @Override
    public ListRoutes setKey(java.lang.String key) {
      return (ListRoutes) super.setKey(key);
    }

    @Override
    public ListRoutes setOauthToken(java.lang.String oauthToken) {
      return (ListRoutes) super.setOauthToken(oauthToken);
    }

    @Override
    public ListRoutes setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (ListRoutes) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public ListRoutes setQuotaUser(java.lang.String quotaUser) {
      return (ListRoutes) super.setQuotaUser(quotaUser);
    }

    @Override
    public ListRoutes setUserIp(java.lang.String userIp) {
      return (ListRoutes) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Integer flexibility;

    /**

     */
    public java.lang.Integer getFlexibility() {
      return flexibility;
    }

    public ListRoutes setFlexibility(java.lang.Integer flexibility) {
      this.flexibility = flexibility;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.Double latitudeEnd;

    /**

     */
    public java.lang.Double getLatitudeEnd() {
      return latitudeEnd;
    }

    public ListRoutes setLatitudeEnd(java.lang.Double latitudeEnd) {
      this.latitudeEnd = latitudeEnd;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.Double latitudeStart;

    /**

     */
    public java.lang.Double getLatitudeStart() {
      return latitudeStart;
    }

    public ListRoutes setLatitudeStart(java.lang.Double latitudeStart) {
      this.latitudeStart = latitudeStart;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.Double longitudeEnd;

    /**

     */
    public java.lang.Double getLongitudeEnd() {
      return longitudeEnd;
    }

    public ListRoutes setLongitudeEnd(java.lang.Double longitudeEnd) {
      this.longitudeEnd = longitudeEnd;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.Double longitudeStart;

    /**

     */
    public java.lang.Double getLongitudeStart() {
      return longitudeStart;
    }

    public ListRoutes setLongitudeStart(java.lang.Double longitudeStart) {
      this.longitudeStart = longitudeStart;
      return this;
    }

    @Override
    public ListRoutes set(String parameterName, Object value) {
      return (ListRoutes) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link ServerRouteEndpoint}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link ServerRouteEndpoint}. */
    @Override
    public ServerRouteEndpoint build() {
      return new ServerRouteEndpoint(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link ServerRouteEndpointRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setServerRouteEndpointRequestInitializer(
        ServerRouteEndpointRequestInitializer serverrouteendpointRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(serverrouteendpointRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}