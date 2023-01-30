# Demo OAuth Client

## Description

This demo project was created to establish a proof of concept for authentication using Amazon Cognito.

The main goal of it is to have something that can be mimic by ssdeu developers.

## How to run

Just run the server and log in with your `2iqresearch.com` credentials. After a successful login it will show your user claims, your id token and your access token.

## How to mimic

Just mimic the application.properties config and add the oauth2 client dependencies to your project pom.xml and Spring Security will take care of the rest. You can also use the yml structure.

## Implementation

The project has a view, a filter and a SecurityFilterChain that were created to test the integration between Cognito and Spring Security.

### Application properties

The properties will be injected as environment variables by the infrastructure team. Reach out if you need to test the project locally.

### View

No need to mimic. It was created to emulate a Login button (and after a successful login it will show the user claims and the id token).

### Filter

No need to mimic. It was created to intercept the request and proof that the access token is also being fetched (being printed on the console).

### SecurityFilterChain

Must be adapted to the application's use case. It was created with just the basic configuration and is where the filter is being applied.


