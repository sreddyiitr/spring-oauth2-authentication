# spring-oauth2-authentication
Use Oauth2 to authenticate users to login

### Excerpt from [Spring Tutorial](https://spring.io/guides/tutorials/spring-boot-oauth2/#github-application-config) to Add Github App

To use GitHub’s OAuth 2.0 authentication system for login, you must first Add a [new GitHub app](https://github.com/settings/developers)

Select "New OAuth App" and then the "Register a new OAuth application" page is presented. Enter an app name and description. Then, enter your app’s home page, which should be `http://localhost:8080`, in this case. Finally, indicate the Authorization callback URL as `http://localhost:8080/login/oauth2/code/github` and click Register Application.

The OAuth redirect URI is the path in the application that the end-user’s user-agent is redirected back to after they have authenticated with GitHub and have granted access to the application on the Authorize application page.

#### The default redirect URI template is `{baseUrl}/login/oauth2/code/{registrationId}`. The `registrationId` is a unique identifier for the `ClientRegistration`.
