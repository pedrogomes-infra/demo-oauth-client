# Demo OAuth Client

## Description

This demo project was created to establish a proof of concept for authentication using Amazon Cognito.

The main goal of it is to have something that can be mimic by ssdeu developers.

## How to run

Just run the server and log in with your 2iqresearch.com credentials. After a successful login it will show your user claims and your id token (you can also check your access token on the console).

## How to mimic

Just mimic the application.properties config and add the oauth2 client dependencies to your project and Spring Security will take care of the rest.

## Implementation

The project has a view, a filter and a SecurityFilterChain that will be detailed below.

### Application properties

Just mimic the following cognito properties to your application (don't forget to add the oauth2 client dependencies):

````
spring.security.oauth2.client.registration.cognito.<property>
spring.security.oauth2.client.provider.cognito.<property>
````

The following two properties, always have similar structure:

````
spring.security.oauth2.client.registration.cognito.redirect-uri = https://<API_URL>/login/oauth2/code/cognito
spring.security.oauth2.client.provider.cognito.issuerUri = https://cognito-idp.<REGION>.amazonaws.com/<USER_POOL_ID>
````

These properties will be injected as environment variables by the infrastructure team. Reach out if you need to test the project locally.

### View

No need to mimic. It was created to emulate a Login button (and after a successful login it will show the user claims and the id token).

### Filter

No need to mimic. It was created to intercept the request and proof that the access token is also being fetched (being printed on the console).

### SecurityFilterChain

Must be adapted to the application's use case. It was created with just the basic configuration and is where the filter is being applied.


