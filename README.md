# Getting started

## How to Build

The generated code uses a few Gradle dependencies e.g., Jackson, Volley,
and Apache HttpClient. The reference to these dependencies is already
added in the build.gradle file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Android Studio click on ``` Open an Existing Android Project ```.

![Importing SDK into Android Studio - Step 1](https://apidocs.io/illustration/android?step=import1&workspaceFolder=Genius%20Referrals&workspaceName=GeniusReferrals&projectName=GeniusReferralsLib&rootNamespace=com.geniusreferrals.api)

* Browse to locate the folder containing the source code. Select the location of the GeniusReferrals gradle project and click ``` Ok ```.

![Importing SDK into Android Studio - Step 2](https://apidocs.io/illustration/android?step=import2&workspaceFolder=Genius%20Referrals&workspaceName=GeniusReferrals&projectName=GeniusReferralsLib&rootNamespace=com.geniusreferrals.api)

* Upon successful import, the project can be built by clicking on ``` Build > Make Project ``` or  pressing ``` Ctrl + F9 ```.

![Importing SDK into Android Studio - Step 3](https://apidocs.io/illustration/android?step=import3&workspaceFolder=Genius%20Referrals&workspaceName=GeniusReferrals&projectName=GeniusReferralsLib&rootNamespace=com.geniusreferrals.api)

## How to Use

The following section explains how to use the GeniusReferrals library in a new project.

### 1. Starting a new project 

For starting a new project, click on ``` Create New Android Studio Project ```.

![Add a new project in Android Studio - Step 1](https://apidocs.io/illustration/android?step=createNewProject0&workspaceFolder=Genius%20Referrals&workspaceName=GeniusReferrals&projectName=GeniusReferralsLib&rootNamespace=com.geniusreferrals.api)

Here, configure the new project by adding the name, domain and location of the sample application followed by clicking ``` Next ```.

![Create a new Android Studio Project - Step 2](https://apidocs.io/illustration/android?step=createNewProject1&workspaceFolder=Genius%20Referrals&workspaceName=GeniusReferrals&projectName=GeniusReferralsLib&rootNamespace=com.geniusreferrals.api)

Following this, select the ``` Phone and Tablet ```` option as shown in the illustration below and click ``` Next ```. 

![Create a new Android Studio Project - Step 3](https://apidocs.io/illustration/android?step=createNewProject2&workspaceFolder=Genius%20Referrals&workspaceName=GeniusReferrals&projectName=GeniusReferralsLib&rootNamespace=com.geniusreferrals.api)

In the following step, choose ``` Empty Activity ``` as the activity type and click ``` Next ```.

![Create a new Android Studio Project - Step 4](https://apidocs.io/illustration/android?step=createNewProject3&workspaceFolder=Genius%20Referrals&workspaceName=GeniusReferrals&projectName=GeniusReferralsLib&rootNamespace=com.geniusreferrals.api)

In this step, provide an ``` Activity Name ``` and ``` Layout Name ``` and click ``` Finish ```.  This would take you to the newly created project.

![Create a new Android Studio Project - Step 4](https://apidocs.io/illustration/android?step=createNewProject4&workspaceFolder=Genius%20Referrals&workspaceName=GeniusReferrals&projectName=GeniusReferralsLib&rootNamespace=com.geniusreferrals.api)

### 2. Add reference of the library project

In order to add a dependency to this sample application, click on the android button shown in the project explorer on the left side as shown in the picture. Click on ``` Project ``` in the drop down that emerges.  

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/android?step=testProject0&workspaceFolder=Genius%20Referrals&workspaceName=GeniusReferrals&projectName=GeniusReferralsLib&rootNamespace=com.geniusreferrals.api)

Right click the sample application in the project explorer and click on ``` New > Module ```  as shown in the picture.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/android?step=testProject1&workspaceFolder=Genius%20Referrals&workspaceName=GeniusReferrals&projectName=GeniusReferralsLib&rootNamespace=com.geniusreferrals.api)

Choose ``` Import Gradle Project ``` and click ``` Next ```.

![Adding dependency to the client library - Step 3](https://apidocs.io/illustration/android?step=testProject2&workspaceFolder=Genius%20Referrals&workspaceName=GeniusReferrals&projectName=GeniusReferralsLib&rootNamespace=com.geniusreferrals.api)

Click on ``` Finish ``` which would take you back to the sample application with the refernced SDK. 

![Adding dependency to the client library - Step 4](https://apidocs.io/illustration/android?step=testProject3&workspaceFolder=Genius%20Referrals&workspaceName=GeniusReferrals&projectName=GeniusReferralsLib&rootNamespace=com.geniusreferrals.api)

In the following step naigate to the ``` SampleApplication >  app > build.gradle ``` file and add the following line ```compile project(path: ':GeniusReferrals')``` to the dependencies section as shown in the illustration below.

![Adding dependency to the client library - Step 5](https://apidocs.io/illustration/android?step=testProject4&workspaceFolder=Genius%20Referrals&workspaceName=GeniusReferrals&projectName=GeniusReferralsLib&rootNamespace=com.geniusreferrals.api)

Finally, press ``` Sync Now ``` in the warning visible as shown in the picture below.

![Adding dependency to the client library - Step 6](https://apidocs.io/illustration/android?step=testProject5&workspaceFolder=Genius%20Referrals&workspaceName=GeniusReferrals&projectName=GeniusReferralsLib&rootNamespace=com.geniusreferrals.api)

### 3. Write sample code

Once the ``` SampleApplication ``` is created, a file named ``` SampleApplication > app > src > main > java > MainActivity ``` will be visible in the *Project Explorer* with an ``` onCreate ``` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

## How to Test

The generated code and the server can be tested using automatically generated test cases. 
JUnit is used as the testing framework and test runner.

In Android Studio, for running the tests do the following:

1. Right click on *SampleApplication > GeniusReferralsLib > androidTest > java)* from the project explorer.
2. Select "Run All Tests" or use "Ctrl + Shift + F10" to run the Tests.

## Initialization

### Authentication
In order to setup authentication and initialization of the API client, you need the following information.

| Parameter | Description |
|-----------|-------------|
| contentType | The content type |
| xAuthToken | Your API Token, you can get your token here https://www.geniusreferrals.com/en/settings/api-access |



API client can be initialized as following. The `appContext` being passed is the Android application [`Context`](https://developer.android.com/reference/android/content/Context.html).

```java
// Configuration parameters and credentials
String contentType = "application/json"; // The content type
String xAuthToken = "3b9d11374b602fb47b987dff90f1c5940a1f377f"; // Your API Token, you can get your token here https://www.geniusreferrals.com/en/settings/api-access

com.geniusreferrals.api.Configuration.initialize(appContext);
GeniusReferralsClient client = new GeniusReferralsClient(contentType, xAuthToken);
```

## Class Reference

### <a name="list_of_controllers"></a>List of Controllers

* [RootsController](#roots_controller)
* [AuthenticationsController](#authentications_controller)
* [AdvocatesController](#advocates_controller)
* [AccountsController](#accounts_controller)
* [ReportsController](#reports_controller)
* [ReferralsController](#referrals_controller)
* [RedemptionRequestsController](#redemption_requests_controller)
* [BonusesController](#bonuses_controller)
* [CampaignsController](#campaigns_controller)

### <a name="roots_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.geniusreferrals.api.controllers.RootsController") RootsController

#### Get singleton instance

The singleton instance of the ``` RootsController ``` class can be accessed from the API Client.

```java
RootsController roots = client.getRoots();
```

#### <a name="get_root_async"></a>![Method: ](https://apidocs.io/img/method.png "com.geniusreferrals.api.controllers.RootsController.getRootAsync") getRootAsync

> The root of the API


```java
void getRootAsync(final APICallBack<DynamicResponse> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
roots.getRootAsync(new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

### <a name="authentications_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.geniusreferrals.api.controllers.AuthenticationsController") AuthenticationsController

#### Get singleton instance

The singleton instance of the ``` AuthenticationsController ``` class can be accessed from the API Client.

```java
AuthenticationsController authentications = client.getAuthentications();
```

#### <a name="get_authentications_async"></a>![Method: ](https://apidocs.io/img/method.png "com.geniusreferrals.api.controllers.AuthenticationsController.getAuthenticationsAsync") getAuthenticationsAsync

> Allow clients to test authentication on Genius Referrals platform.


```java
void getAuthenticationsAsync(final APICallBack<DynamicResponse> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
authentications.getAuthenticationsAsync(new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

### <a name="advocates_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.geniusreferrals.api.controllers.AdvocatesController") AdvocatesController

#### Get singleton instance

The singleton instance of the ``` AdvocatesController ``` class can be accessed from the API Client.

```java
AdvocatesController advocates = client.getAdvocates();
```

#### <a name="delete_advocate_async"></a>![Method: ](https://apidocs.io/img/method.png "com.geniusreferrals.api.controllers.AdvocatesController.deleteAdvocateAsync") deleteAdvocateAsync

> Delete an advocate


```java
void deleteAdvocateAsync(
        final String accountSlug,
        final String advocateToken,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accountSlug |  ``` Required ```  | The account identifier |
| advocateToken |  ``` Required ```  | The advocate's token |


#### Example Usage

```java
String accountSlug = "account_slug";
String advocateToken = "advocate_token";
// Invoking the API call with sample inputs
advocates.deleteAdvocateAsync(accountSlug, advocateToken, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="put_advocate_async"></a>![Method: ](https://apidocs.io/img/method.png "com.geniusreferrals.api.controllers.AdvocatesController.putAdvocateAsync") putAdvocateAsync

> Update an advocate.


```java
void putAdvocateAsync(
        final String accountSlug,
        final String advocateToken,
        final AdvocateForm advocateForm,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accountSlug |  ``` Required ```  | The account identifier |
| advocateToken |  ``` Required ```  | The advocate's token |
| advocateForm |  ``` Required ```  | The body of the request |


#### Example Usage

```java
try {
    String accountSlug = "account_slug";
    String advocateToken = "advocate_token";
    AdvocateForm advocateForm = new AdvocateForm();
    // Invoking the API call with sample inputs
    advocates.putAdvocateAsync(accountSlug, advocateToken, advocateForm, new APICallBack<void>() {
        public void onSuccess(HttpContext context, void response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


#### <a name="post_advocate_async"></a>![Method: ](https://apidocs.io/img/method.png "com.geniusreferrals.api.controllers.AdvocatesController.postAdvocateAsync") postAdvocateAsync

> Create a new advocate.


```java
void postAdvocateAsync(
        final String accountSlug,
        final AdvocateForm advocateForm,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accountSlug |  ``` Required ```  | The account identifier |
| advocateForm |  ``` Required ```  | The body of the request |


#### Example Usage

```java
try {
    String accountSlug = "account_slug";
    AdvocateForm advocateForm = new AdvocateForm();
    // Invoking the API call with sample inputs
    advocates.postAdvocateAsync(accountSlug, advocateForm, new APICallBack<DynamicResponse>() {
        public void onSuccess(HttpContext context, DynamicResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


#### <a name="get_advocate_async"></a>![Method: ](https://apidocs.io/img/method.png "com.geniusreferrals.api.controllers.AdvocatesController.getAdvocateAsync") getAdvocateAsync

> Get an advocate by a given token.


```java
void getAdvocateAsync(
        final String accountSlug,
        final String advocateToken,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accountSlug |  ``` Required ```  | The account identifier |
| advocateToken |  ``` Required ```  | The advocate's token |


#### Example Usage

```java
String accountSlug = "account_slug";
String advocateToken = "advocate_token";
// Invoking the API call with sample inputs
advocates.getAdvocateAsync(accountSlug, advocateToken, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="delete_advocates_async"></a>![Method: ](https://apidocs.io/img/method.png "com.geniusreferrals.api.controllers.AdvocatesController.deleteAdvocatesAsync") deleteAdvocatesAsync

> Delete all advocates


```java
void deleteAdvocatesAsync(
        final String accountSlug,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accountSlug |  ``` Required ```  | The account identifier |


#### Example Usage

```java
String accountSlug = "account_slug";
// Invoking the API call with sample inputs
advocates.deleteAdvocatesAsync(accountSlug, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_advocates_async"></a>![Method: ](https://apidocs.io/img/method.png "com.geniusreferrals.api.controllers.AdvocatesController.getAdvocatesAsync") getAdvocatesAsync

> Get the list of advocates


```java
void getAdvocatesAsync(
        final String accountSlug,
        final Integer page,
        final Integer limit,
        final String filter,
        final String sort,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accountSlug |  ``` Required ```  | The account identifier |
| page |  ``` Optional ```  ``` DefaultValue ```  | Page number, e.g. 1 would start at the first result, and 10 would start at the tenth result. |
| limit |  ``` Optional ```  ``` DefaultValue ```  | Maximum number of results to return in the response. Default (10), threshold (100) |
| filter |  ``` Optional ```  | Allowed fields: name, lastname, email, advocate_token, bonus_exchange_method_slug, campaign_slug, can_refer, is_referral, from, to, created. Use the following delimiters to build your filters params. The vertical bar ('\|') to separate individual filter phrases and a double colon ('::') to separate the names and values. The delimiter of the double colon (':') separates the property name from the comparison value, enabling the comparison value to contain spaces. Example: www.example.com/users?filter='name::todd\|city::denver\|title::grand poobah' |
| sort |  ``` Optional ```  | Allowed fields: name, lastname, email, created. Use sort query-string parameter that contains a delimited set of property names. For each property name, sort in ascending order, and for each property prefixed with a dash ('-') sort in descending order. Separate each property name with a vertical bar ('\|'), which is consistent with the separation of the name\|value pairs in filtering, above. For example, if we want to retrieve users in order of their last name (ascending), first name (ascending) and hire date (descending), the request might look like this www.example.com/users?sort='last_name\|first_name\|-hire_date' |


#### Example Usage

```java
String accountSlug = "account_slug";
Integer page = 1;
Integer limit = 10;
String filter = "filter";
String sort = "sort";
// Invoking the API call with sample inputs
advocates.getAdvocatesAsync(accountSlug, page, limit, filter, sort, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="patch_advocate_async"></a>![Method: ](https://apidocs.io/img/method.png "com.geniusreferrals.api.controllers.AdvocatesController.patchAdvocateAsync") patchAdvocateAsync

> Update partial elements of an advocate.


```java
void patchAdvocateAsync(
        final String accountSlug,
        final String advocateToken,
        final List<AdvocatePatchForm> advocatePatchForm,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accountSlug |  ``` Required ```  | The account identifier |
| advocateToken |  ``` Required ```  | The advocate's token |
| advocatePatchForm |  ``` Required ```  ``` Collection ```  | The body of the request |


#### Example Usage

```java
try {
    String accountSlug = "account_slug";
    String advocateToken = "advocate_token";
    List<AdvocatePatchForm> advocatePatchForm = new ArrayList<AdvocatePatchForm>();
    // Invoking the API call with sample inputs
    advocates.patchAdvocateAsync(accountSlug, advocateToken, advocatePatchForm, new APICallBack<DynamicResponse>() {
        public void onSuccess(HttpContext context, DynamicResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


[Back to List of Controllers](#list_of_controllers)

### <a name="accounts_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.geniusreferrals.api.controllers.AccountsController") AccountsController

#### Get singleton instance

The singleton instance of the ``` AccountsController ``` class can be accessed from the API Client.

```java
AccountsController accounts = client.getAccounts();
```

#### <a name="get_account_async"></a>![Method: ](https://apidocs.io/img/method.png "com.geniusreferrals.api.controllers.AccountsController.getAccountAsync") getAccountAsync

> Get an account by a given slug.


```java
void getAccountAsync(
        final String accountSlug,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accountSlug |  ``` Required ```  | The account identifier |


#### Example Usage

```java
String accountSlug = "account_slug";
// Invoking the API call with sample inputs
accounts.getAccountAsync(accountSlug, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_accounts_async"></a>![Method: ](https://apidocs.io/img/method.png "com.geniusreferrals.api.controllers.AccountsController.getAccountsAsync") getAccountsAsync

> Get the list of accounts.


```java
void getAccountsAsync(
        final Integer page,
        final Integer limit,
        final String filter,
        final String sort,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  | Page number, e.g. 1 would start at the first result, and 10 would start at the tenth result. |
| limit |  ``` Optional ```  | Maximum number of results to return in the response. Default (10), threshold (100) |
| filter |  ``` Optional ```  | Allowed fields: name. Use the following delimiters to build your filters params. The vertical bar ('\|') to separate individual filter phrases and a double colon ('::') to separate the names and values. The delimiter of the double colon (':') separates the property name from the comparison value, enabling the comparison value to contain spaces. Example: www.example.com/users?filter='name::todd\|city::denver\|title::grand poobah' |
| sort |  ``` Optional ```  | Allowed fields: name, created. Use sort query-string parameter that contains a delimited set of property names. For each property name, sort in ascending order, and for each property prefixed with a dash ('-') sort in descending order. Separate each property name with a vertical bar ('\|'), which is consistent with the separation of the name\|value pairs in filtering, above. For example, if we want to retrieve users in order of their last name (ascending), first name (ascending) and hire date (descending), the request might look like this www.example.com/users?sort=last_name\|first_name\|-hire_date |


#### Example Usage

```java
Integer page = 253;
Integer limit = 253;
String filter = "filter";
String sort = "sort";
// Invoking the API call with sample inputs
accounts.getAccountsAsync(page, limit, filter, sort, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

### <a name="reports_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.geniusreferrals.api.controllers.ReportsController") ReportsController

#### Get singleton instance

The singleton instance of the ``` ReportsController ``` class can be accessed from the API Client.

```java
ReportsController reports = client.getReports();
```

#### <a name="get_referrals_summary_per_origin_async"></a>![Method: ](https://apidocs.io/img/method.png "com.geniusreferrals.api.controllers.ReportsController.getReferralsSummaryPerOriginAsync") getReferralsSummaryPerOriginAsync

> Get referrals summary per referral origin.


```java
void getReferralsSummaryPerOriginAsync(
        final String advocateToken,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| advocateToken |  ``` Required ```  | The advocate's token |


#### Example Usage

```java
String advocateToken = "advocate_token";
// Invoking the API call with sample inputs
reports.getReferralsSummaryPerOriginAsync(advocateToken, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_bonuses_summary_per_origin_async"></a>![Method: ](https://apidocs.io/img/method.png "com.geniusreferrals.api.controllers.ReportsController.getBonusesSummaryPerOriginAsync") getBonusesSummaryPerOriginAsync

> Get bonuses summary per referral origin.


```java
void getBonusesSummaryPerOriginAsync(
        final String advocateToken,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| advocateToken |  ``` Required ```  | The advocate's token |


#### Example Usage

```java
String advocateToken = "advocate_token";
// Invoking the API call with sample inputs
reports.getBonusesSummaryPerOriginAsync(advocateToken, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_top_advocates_async"></a>![Method: ](https://apidocs.io/img/method.png "com.geniusreferrals.api.controllers.ReportsController.getTopAdvocatesAsync") getTopAdvocatesAsync

> Get top 10 advocates.


```java
void getTopAdvocatesAsync(
        final String accountSlug,
        final String campaignSlug,
        final Integer limit,
        final Date from,
        final Date to,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accountSlug |  ``` Optional ```  | The account identifier |
| campaignSlug |  ``` Optional ```  | The campaign identifier |
| limit |  ``` Optional ```  | Maximum number of results to return in the response. Default (10) |
| from |  ``` Optional ```  | The datetime were the range of the search starts |
| to |  ``` Optional ```  | The datetime were the range of the search stops |


#### Example Usage

```java
String accountSlug = "account_slug";
String campaignSlug = "campaign_slug";
Integer limit = 253;
Date from = new Date();
Date to = new Date();
// Invoking the API call with sample inputs
reports.getTopAdvocatesAsync(accountSlug, campaignSlug, limit, from, to, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_share_daily_participation_async"></a>![Method: ](https://apidocs.io/img/method.png "com.geniusreferrals.api.controllers.ReportsController.getShareDailyParticipationAsync") getShareDailyParticipationAsync

> Get share daily participation.


```java
void getShareDailyParticipationAsync(
        final String accountSlug,
        final String campaignSlug,
        final String advocateToken,
        final Date from,
        final Date to,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accountSlug |  ``` Optional ```  | The account identifier |
| campaignSlug |  ``` Optional ```  | The campaign identifier |
| advocateToken |  ``` Optional ```  | The advocate's token |
| from |  ``` Optional ```  | The datetime were the range of the search starts |
| to |  ``` Optional ```  | The datetime were the range of the search stops |


#### Example Usage

```java
String accountSlug = "account_slug";
String campaignSlug = "campaign_slug";
String advocateToken = "advocate_token";
Date from = new Date();
Date to = new Date();
// Invoking the API call with sample inputs
reports.getShareDailyParticipationAsync(accountSlug, campaignSlug, advocateToken, from, to, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_referral_daily_participation_async"></a>![Method: ](https://apidocs.io/img/method.png "com.geniusreferrals.api.controllers.ReportsController.getReferralDailyParticipationAsync") getReferralDailyParticipationAsync

> Get referral daily participation.


```java
void getReferralDailyParticipationAsync(
        final String accountSlug,
        final String campaignSlug,
        final String advocateToken,
        final Date from,
        final Date to,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accountSlug |  ``` Optional ```  | The account identifier |
| campaignSlug |  ``` Optional ```  | The campaign identifier |
| advocateToken |  ``` Optional ```  | The advocate's token |
| from |  ``` Optional ```  | The datetime were the range of the search starts |
| to |  ``` Optional ```  | The datetime were the range of the search stops |


#### Example Usage

```java
String accountSlug = "account_slug";
String campaignSlug = "campaign_slug";
String advocateToken = "advocate_token";
Date from = new Date();
Date to = new Date();
// Invoking the API call with sample inputs
reports.getReferralDailyParticipationAsync(accountSlug, campaignSlug, advocateToken, from, to, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_click_daily_participation_async"></a>![Method: ](https://apidocs.io/img/method.png "com.geniusreferrals.api.controllers.ReportsController.getClickDailyParticipationAsync") getClickDailyParticipationAsync

> Get click daily participation.


```java
void getClickDailyParticipationAsync(
        final String accountSlug,
        final String campaignSlug,
        final String advocateToken,
        final Date from,
        final Date to,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accountSlug |  ``` Optional ```  | The account identifier |
| campaignSlug |  ``` Optional ```  | The campaign identifier |
| advocateToken |  ``` Optional ```  | The advocate's token |
| from |  ``` Optional ```  | The datetime were the range of the search starts |
| to |  ``` Optional ```  | The datetime were the range of the search stops |


#### Example Usage

```java
String accountSlug = "account_slug";
String campaignSlug = "campaign_slug";
String advocateToken = "advocate_token";
Date from = new Date();
Date to = new Date();
// Invoking the API call with sample inputs
reports.getClickDailyParticipationAsync(accountSlug, campaignSlug, advocateToken, from, to, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_bonuses_daily_given_async"></a>![Method: ](https://apidocs.io/img/method.png "com.geniusreferrals.api.controllers.ReportsController.getBonusesDailyGivenAsync") getBonusesDailyGivenAsync

> Get bonuses daily given.


```java
void getBonusesDailyGivenAsync(
        final String accountSlug,
        final String campaignSlug,
        final String advocateToken,
        final Date from,
        final Date to,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accountSlug |  ``` Optional ```  | The account identifier |
| campaignSlug |  ``` Optional ```  | The campaign identifier |
| advocateToken |  ``` Optional ```  | The advocate identifier |
| from |  ``` Optional ```  | The datetime were the range of the search starts |
| to |  ``` Optional ```  | The datetime were the range of the search stops |


#### Example Usage

```java
String accountSlug = "account_slug";
String campaignSlug = "campaign_slug";
String advocateToken = "advocate_token";
Date from = new Date();
Date to = new Date();
// Invoking the API call with sample inputs
reports.getBonusesDailyGivenAsync(accountSlug, campaignSlug, advocateToken, from, to, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

### <a name="referrals_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.geniusreferrals.api.controllers.ReferralsController") ReferralsController

#### Get singleton instance

The singleton instance of the ``` ReferralsController ``` class can be accessed from the API Client.

```java
ReferralsController referrals = client.getReferrals();
```

#### <a name="get_referral_origin_async"></a>![Method: ](https://apidocs.io/img/method.png "com.geniusreferrals.api.controllers.ReferralsController.getReferralOriginAsync") getReferralOriginAsync

> Get a referral origin by a given slug.


```java
void getReferralOriginAsync(
        final String referralOriginSlug,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| referralOriginSlug |  ``` Required ```  | The referral origin identifier |


#### Example Usage

```java
String referralOriginSlug = "referral_origin_slug";
// Invoking the API call with sample inputs
referrals.getReferralOriginAsync(referralOriginSlug, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_referral_origins_async"></a>![Method: ](https://apidocs.io/img/method.png "com.geniusreferrals.api.controllers.ReferralsController.getReferralOriginsAsync") getReferralOriginsAsync

> Get referral origins. This is needed when creating (POST) a new referral, as referral_origin_slug refers to one of this origins.


```java
void getReferralOriginsAsync(final APICallBack<DynamicResponse> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
referrals.getReferralOriginsAsync(new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_referral_async"></a>![Method: ](https://apidocs.io/img/method.png "com.geniusreferrals.api.controllers.ReferralsController.getReferralAsync") getReferralAsync

> Get a referral by a given id.


```java
void getReferralAsync(
        final String accountSlug,
        final String advocateToken,
        final String referralId,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accountSlug |  ``` Required ```  | The account identifier |
| advocateToken |  ``` Required ```  | The advocate's token |
| referralId |  ``` Required ```  | The referral id |


#### Example Usage

```java
String accountSlug = "account_slug";
String advocateToken = "advocate_token";
String referralId = "referral_id";
// Invoking the API call with sample inputs
referrals.getReferralAsync(accountSlug, advocateToken, referralId, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="delete_referral_async"></a>![Method: ](https://apidocs.io/img/method.png "com.geniusreferrals.api.controllers.ReferralsController.deleteReferralAsync") deleteReferralAsync

> Delete a referral.


```java
void deleteReferralAsync(
        final String accountSlug,
        final String advocateToken,
        final String referralId,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accountSlug |  ``` Required ```  | The account identifier |
| advocateToken |  ``` Required ```  | The advocate's token |
| referralId |  ``` Required ```  | The referral identifier |


#### Example Usage

```java
String accountSlug = "account_slug";
String advocateToken = "advocate_token";
String referralId = "referral_id";
// Invoking the API call with sample inputs
referrals.deleteReferralAsync(accountSlug, advocateToken, referralId, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="post_referrals_async"></a>![Method: ](https://apidocs.io/img/method.png "com.geniusreferrals.api.controllers.ReferralsController.postReferralsAsync") postReferralsAsync

> Create a new referral.


```java
void postReferralsAsync(
        final String accountSlug,
        final String advocateToken,
        final ReferralForm referralForm,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accountSlug |  ``` Required ```  | The account identifier |
| advocateToken |  ``` Required ```  | The advocate's token |
| referralForm |  ``` Required ```  | The body of the request |


#### Example Usage

```java
try {
    String accountSlug = "account_slug";
    String advocateToken = "advocate_token";
    ReferralForm referralForm = new ReferralForm();
    // Invoking the API call with sample inputs
    referrals.postReferralsAsync(accountSlug, advocateToken, referralForm, new APICallBack<DynamicResponse>() {
        public void onSuccess(HttpContext context, DynamicResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


#### <a name="put_referral_async"></a>![Method: ](https://apidocs.io/img/method.png "com.geniusreferrals.api.controllers.ReferralsController.putReferralAsync") putReferralAsync

> Update a referral.


```java
void putReferralAsync(
        final String accountSlug,
        final String advocateToken,
        final String referralId,
        final ReferralForm referralForm,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accountSlug |  ``` Required ```  | The account identifier |
| advocateToken |  ``` Required ```  | The advocate's token |
| referralId |  ``` Required ```  | The referral id |
| referralForm |  ``` Required ```  | The body of the request |


#### Example Usage

```java
try {
    String accountSlug = "account_slug";
    String advocateToken = "advocate_token";
    String referralId = "referral_id";
    ReferralForm referralForm = new ReferralForm();
    // Invoking the API call with sample inputs
    referrals.putReferralAsync(accountSlug, advocateToken, referralId, referralForm, new APICallBack<void>() {
        public void onSuccess(HttpContext context, void response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


#### <a name="get_referrals_async"></a>![Method: ](https://apidocs.io/img/method.png "com.geniusreferrals.api.controllers.ReferralsController.getReferralsAsync") getReferralsAsync

> Get the list of referrals for a given advocate.


```java
void getReferralsAsync(
        final String accountSlug,
        final String advocateToken,
        final Integer page,
        final Integer limit,
        final String filter,
        final String sort,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accountSlug |  ``` Required ```  | The account identifier |
| advocateToken |  ``` Required ```  | The advocate's token |
| page |  ``` Optional ```  | Page number, e.g. 1 would start at the first result, and 10 would start at the tenth result. |
| limit |  ``` Optional ```  | Maximum number of results to return in the response. Default (10), threshold (100) |
| filter |  ``` Optional ```  | Allowed fields: url, referral_origin_slug, created. Use the following delimiters to build your filters params. Use the following delimiters to build your filters params. The vertical bar ('\|') to separate individual filter phrases and a double colon ('::') to separate the names and values. The delimiter of the double colon (':') separates the property name from the comparison value, enabling the comparison value to contain spaces. Example: www.example.com/users?filter='name::todd\|city::denver\|title::grand poobah' |
| sort |  ``` Optional ```  | Allowed fields: created. Use sort query-string parameter that contains a delimited set of property names. For each property name, sort in ascending order, and for each property prefixed with a dash ('-') sort in descending order. Separate each property name with a vertical bar ('\|'), which is consistent with the separation of the name\|value pairs in filtering, above. For example, if we want to retrieve users in order of their last name (ascending), first name (ascending) and hire date (descending), the request might look like this www.example.com/users?sort='last_name\|first_name\|-hire_date' |


#### Example Usage

```java
String accountSlug = "account_slug";
String advocateToken = "advocate_token";
Integer page = 253;
Integer limit = 253;
String filter = "filter";
String sort = "sort";
// Invoking the API call with sample inputs
referrals.getReferralsAsync(accountSlug, advocateToken, page, limit, filter, sort, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

### <a name="redemption_requests_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.geniusreferrals.api.controllers.RedemptionRequestsController") RedemptionRequestsController

#### Get singleton instance

The singleton instance of the ``` RedemptionRequestsController ``` class can be accessed from the API Client.

```java
RedemptionRequestsController redemptionRequests = client.getRedemptionRequests();
```

#### <a name="get_redemption_request_status_async"></a>![Method: ](https://apidocs.io/img/method.png "com.geniusreferrals.api.controllers.RedemptionRequestsController.getRedemptionRequestStatusAsync") getRedemptionRequestStatusAsync

> Get a redemption request status.


```java
void getRedemptionRequestStatusAsync(
        final String redemptionRequestStatusSlug,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| redemptionRequestStatusSlug |  ``` Required ```  | The redemption request status identifier |


#### Example Usage

```java
String redemptionRequestStatusSlug = "redemption_request_status_slug";
// Invoking the API call with sample inputs
redemptionRequests.getRedemptionRequestStatusAsync(redemptionRequestStatusSlug, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_redemption_request_statuses_async"></a>![Method: ](https://apidocs.io/img/method.png "com.geniusreferrals.api.controllers.RedemptionRequestsController.getRedemptionRequestStatusesAsync") getRedemptionRequestStatusesAsync

> Get redemption request statuses.


```java
void getRedemptionRequestStatusesAsync(final APICallBack<DynamicResponse> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
redemptionRequests.getRedemptionRequestStatusesAsync(new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_redemption_request_action_async"></a>![Method: ](https://apidocs.io/img/method.png "com.geniusreferrals.api.controllers.RedemptionRequestsController.getRedemptionRequestActionAsync") getRedemptionRequestActionAsync

> Get a redemption request action.


```java
void getRedemptionRequestActionAsync(
        final String redemptionRequestActionSlug,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| redemptionRequestActionSlug |  ``` Required ```  | The redemption request action identifier |


#### Example Usage

```java
String redemptionRequestActionSlug = "redemption_request_action_slug";
// Invoking the API call with sample inputs
redemptionRequests.getRedemptionRequestActionAsync(redemptionRequestActionSlug, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_redemption_request_actions_async"></a>![Method: ](https://apidocs.io/img/method.png "com.geniusreferrals.api.controllers.RedemptionRequestsController.getRedemptionRequestActionsAsync") getRedemptionRequestActionsAsync

> Get redemption request actions.


```java
void getRedemptionRequestActionsAsync(final APICallBack<DynamicResponse> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
redemptionRequests.getRedemptionRequestActionsAsync(new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="patch_redemption_request_async"></a>![Method: ](https://apidocs.io/img/method.png "com.geniusreferrals.api.controllers.RedemptionRequestsController.patchRedemptionRequestAsync") patchRedemptionRequestAsync

> Redeem a redemption request. After the redemption request is created it needs to be redeemed. This will deduct the amount of the advocate unclaimed balance and move the request to the completed state.


```java
void patchRedemptionRequestAsync(
        final String accountSlug,
        final int redemptionRequestId,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accountSlug |  ``` Required ```  | The account identifier |
| redemptionRequestId |  ``` Required ```  | The redemption request id |


#### Example Usage

```java
String accountSlug = "account_slug";
int redemptionRequestId = 253;
// Invoking the API call with sample inputs
redemptionRequests.patchRedemptionRequestAsync(accountSlug, redemptionRequestId, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="post_redemption_request_async"></a>![Method: ](https://apidocs.io/img/method.png "com.geniusreferrals.api.controllers.RedemptionRequestsController.postRedemptionRequestAsync") postRedemptionRequestAsync

> Create a redemption request.


```java
void postRedemptionRequestAsync(
        final String accountSlug,
        final RedemptionRequestForm redemptionRequestForm,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accountSlug |  ``` Required ```  | The account identifier |
| redemptionRequestForm |  ``` Required ```  | The body of the request |


#### Example Usage

```java
try {
    String accountSlug = "account_slug";
    RedemptionRequestForm redemptionRequestForm = new RedemptionRequestForm();
    // Invoking the API call with sample inputs
    redemptionRequests.postRedemptionRequestAsync(accountSlug, redemptionRequestForm, new APICallBack<DynamicResponse>() {
        public void onSuccess(HttpContext context, DynamicResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


#### <a name="get_redemption_request_async"></a>![Method: ](https://apidocs.io/img/method.png "com.geniusreferrals.api.controllers.RedemptionRequestsController.getRedemptionRequestAsync") getRedemptionRequestAsync

> Get a redemption request by a given id.


```java
void getRedemptionRequestAsync(
        final String accountSlug,
        final String redemptionRequestId,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accountSlug |  ``` Required ```  | The account identifier |
| redemptionRequestId |  ``` Required ```  | The redemption request identifier |


#### Example Usage

```java
String accountSlug = "account_slug";
String redemptionRequestId = "redemption_request_id";
// Invoking the API call with sample inputs
redemptionRequests.getRedemptionRequestAsync(accountSlug, redemptionRequestId, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_redemption_requests_async"></a>![Method: ](https://apidocs.io/img/method.png "com.geniusreferrals.api.controllers.RedemptionRequestsController.getRedemptionRequestsAsync") getRedemptionRequestsAsync

> Get the list of redemption requests.


```java
void getRedemptionRequestsAsync(
        final String accountSlug,
        final String page,
        final String limit,
        final String filter,
        final String sort,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accountSlug |  ``` Required ```  | The account identifier |
| page |  ``` Optional ```  | Page number, e.g. 1 would start at the first result, and 10 would start at the tenth result. |
| limit |  ``` Optional ```  | Maximum number of results to return in the response. Default (10), threshold (100) |
| filter |  ``` Optional ```  | Allowed fields: redemption_request_id, name, lastname, email, request_status_slug, request_action_slug, from, to, created. Use the following delimiters to build your filters params. The vertical bar ('\|') to separate individual filter phrases and a double colon ('::') to separate the names and values. The delimiter of the double colon (':') separates the property name from the comparison value, enabling the comparison value to contain spaces. Example: www.example.com/users?filter='name::todd\|city::denver\|title::grand poobah' |
| sort |  ``` Optional ```  | Allowed fields: name, lastname, email, created. Use sort query-string parameter that contains a delimited set of property names. For each property name, sort in ascending order, and for each property prefixed with a dash ('-') sort in descending order. Separate each property name with a vertical bar ('\|'), which is consistent with the separation of the name\|value pairs in filtering, above. For example, if we want to retrieve users in order of their last name (ascending), first name (ascending) and hire date (descending), the request might look like this www.example.com/users?sort='last_name\|first_name\|-hire_date' |


#### Example Usage

```java
String accountSlug = "account_slug";
String page = "page";
String limit = "limit";
String filter = "filter";
String sort = "sort";
// Invoking the API call with sample inputs
redemptionRequests.getRedemptionRequestsAsync(accountSlug, page, limit, filter, sort, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

### <a name="bonuses_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.geniusreferrals.api.controllers.BonusesController") BonusesController

#### Get singleton instance

The singleton instance of the ``` BonusesController ``` class can be accessed from the API Client.

```java
BonusesController bonuses = client.getBonuses();
```

#### <a name="get_bonuses_async"></a>![Method: ](https://apidocs.io/img/method.png "com.geniusreferrals.api.controllers.BonusesController.getBonusesAsync") getBonusesAsync

> Get the list of bonuses for a given account.


```java
void getBonusesAsync(
        final String accountSlug,
        final Integer page,
        final Integer limit,
        final String filter,
        final String sort,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accountSlug |  ``` Required ```  | The account identifier |
| page |  ``` Optional ```  | Page number, e.g. 1 would start at the first result, and 10 would start at the tenth result. |
| limit |  ``` Optional ```  | Maximum number of results to return in the response. Default (10), threshold (100) |
| filter |  ``` Optional ```  | Allowed fields: name, lastname, email, campaign_slug, from, to, created. Use the following delimiters to build your filters params. The vertical bar ('\|') to separate individual filter phrases and a double colon ('::') to separate the names and values. The delimiter of the double colon (':') separates the property name from the comparison value, enabling the comparison value to contain spaces. Example: www.example.com/users?filter='name::todd\|city::denver\|title::grand poobah' |
| sort |  ``` Optional ```  | Allowed fields: name, lastname, email, created. Use sort query-string parameter that contains a delimited set of property names. For each property name, sort in ascending order, and for each property prefixed with a dash ('-') sort in descending order. Separate each property name with a vertical bar ('\|'), which is consistent with the separation of the name\|value pairs in filtering, above. For example, if we want to retrieve users in order of their last name (ascending), first name (ascending) and hire date (descending), the request might look like this www.example.com/users?sort='last_name\|first_name\|-hire_date' |


#### Example Usage

```java
String accountSlug = "account_slug";
Integer page = 253;
Integer limit = 253;
String filter = "filter";
String sort = "sort";
// Invoking the API call with sample inputs
bonuses.getBonusesAsync(accountSlug, page, limit, filter, sort, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="post_bonuses_async"></a>![Method: ](https://apidocs.io/img/method.png "com.geniusreferrals.api.controllers.BonusesController.postBonusesAsync") postBonusesAsync

> Make an attempt to give a bonus for to the advocate's referrer. The system processes the given advocate (referral) and creates a bonus for the advocate's referrer if is needed. All restrictions set on the campaigns for this account will be check out before giving the bonus to the advocate's referrer.


```java
void postBonusesAsync(
        final String accountSlug,
        final BonusesForm bonusesForm,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accountSlug |  ``` Required ```  | The account identifier |
| bonusesForm |  ``` Required ```  | The body of the request |


#### Example Usage

```java
try {
    String accountSlug = "account_slug";
    BonusesForm bonusesForm = new BonusesForm();
    // Invoking the API call with sample inputs
    bonuses.postBonusesAsync(accountSlug, bonusesForm, new APICallBack<DynamicResponse>() {
        public void onSuccess(HttpContext context, DynamicResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


#### <a name="get_bonuses_checkup_async"></a>![Method: ](https://apidocs.io/img/method.png "com.geniusreferrals.api.controllers.BonusesController.getBonusesCheckupAsync") getBonusesCheckupAsync

> Check if there is a bonus to be given to the advocate. Allows the clients to check if there is a bonus to be given, it simulates the behaivor of a POST request to /accounts/{account_slug}/bonuses resource. This resource is idempotent.


```java
void getBonusesCheckupAsync(
        final String accountSlug,
        final String advocateToken,
        final String reference,
        final double paymentAmount,
        final APICallBack<InputStream> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accountSlug |  ``` Required ```  | The account identifier |
| advocateToken |  ``` Required ```  | The referral's token. Usually the one that completed the purchase, or trigger an event. |
| reference |  ``` Required ```  | The reference number for this request. Usually the order_id, payment_id, or timestamp. |
| paymentAmount |  ``` Required ```  | The payment amount the referrals has made. Required for a percentage based campaign. |


#### Example Usage

```java
String accountSlug = "account_slug";
String advocateToken = "advocate_token";
String reference = "reference";
double paymentAmount = 253.661910113255;
// Invoking the API call with sample inputs
bonuses.getBonusesCheckupAsync(accountSlug, advocateToken, reference, paymentAmount, new APICallBack<InputStream>() {
    public void onSuccess(HttpContext context, InputStream response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="post_bonuses_force_async"></a>![Method: ](https://apidocs.io/img/method.png "com.geniusreferrals.api.controllers.BonusesController.postBonusesForceAsync") postBonusesForceAsync

> Force the system to give a bonus to an advocate. The system will not take into account the restriccions specified on the campaigns.


```java
void postBonusesForceAsync(
        final String accountSlug,
        final BonusesForm1 bonusForm,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accountSlug |  ``` Required ```  | The account identifier |
| bonusForm |  ``` Required ```  | The body of the request |


#### Example Usage

```java
try {
    String accountSlug = "account_slug";
    BonusesForm1 bonusForm = new BonusesForm1();
    // Invoking the API call with sample inputs
    bonuses.postBonusesForceAsync(accountSlug, bonusForm, new APICallBack<DynamicResponse>() {
        public void onSuccess(HttpContext context, DynamicResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


#### <a name="get_bonuses_trace_async"></a>![Method: ](https://apidocs.io/img/method.png "com.geniusreferrals.api.controllers.BonusesController.getBonusesTraceAsync") getBonusesTraceAsync

> Get a bonus request trace.


```java
void getBonusesTraceAsync(
        final String accountSlug,
        final int traceId,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accountSlug |  ``` Required ```  | The account identifier |
| traceId |  ``` Required ```  | The trace id |


#### Example Usage

```java
String accountSlug = "account_slug";
int traceId = 253;
// Invoking the API call with sample inputs
bonuses.getBonusesTraceAsync(accountSlug, traceId, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="delete_bonus_async"></a>![Method: ](https://apidocs.io/img/method.png "com.geniusreferrals.api.controllers.BonusesController.deleteBonusAsync") deleteBonusAsync

> Delete a bonus


```java
void deleteBonusAsync(
        final String accountSlug,
        final int bonusId,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accountSlug |  ``` Required ```  | The account identifier |
| bonusId |  ``` Required ```  | The bonus id |


#### Example Usage

```java
String accountSlug = "account_slug";
int bonusId = 253;
// Invoking the API call with sample inputs
bonuses.deleteBonusAsync(accountSlug, bonusId, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_bonus_async"></a>![Method: ](https://apidocs.io/img/method.png "com.geniusreferrals.api.controllers.BonusesController.getBonusAsync") getBonusAsync

> Get a bonus by a given id.


```java
void getBonusAsync(
        final String accountSlug,
        final int bonusId,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accountSlug |  ``` Required ```  | The account identifier |
| bonusId |  ``` Required ```  | The bonus id |


#### Example Usage

```java
String accountSlug = "account_slug";
int bonusId = 253;
// Invoking the API call with sample inputs
bonuses.getBonusAsync(accountSlug, bonusId, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_bonuses_traces_async"></a>![Method: ](https://apidocs.io/img/method.png "com.geniusreferrals.api.controllers.BonusesController.getBonusesTracesAsync") getBonusesTracesAsync

> Get the list of bonuses traces (audit trail). Every time the system tries to give a bonus the an advocate a new trace is created.


```java
void getBonusesTracesAsync(
        final String accountSlug,
        final Integer page,
        final Integer limit,
        final String filter,
        final String sort,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accountSlug |  ``` Required ```  | The account identifier |
| page |  ``` Optional ```  | Page number, e.g. 1 would start at the first result, and 10 would start at the tenth result. |
| limit |  ``` Optional ```  | Maximum number of results to return in the response. Default (10), threshold (100) |
| filter |  ``` Optional ```  | Allowed fields: reference, result, bonus_amount, advocate_token, advocate_referrer_token, campaign_slug, from, to, created. Use the following delimiters to build your filters params. The vertical bar ('\|') to separate individual filter phrases and a double colon ('::') to separate the names and values. The delimiter of the double colon (':') separates the property name from the comparison value, enabling the comparison value to contain spaces. Example: www.example.com/users?filter='name::todd\|city::denver\|title::grand poobah' |
| sort |  ``` Optional ```  | Allowed fields: created. Use sort query-string parameter that contains a delimited set of property names. For each property name, sort in ascending order, and for each property prefixed with a dash ('-') sort in descending order. Separate each property name with a vertical bar ('\|'), which is consistent with the separation of the name\|value pairs in filtering, above. For example, if we want to retrieve users in order of their last name (ascending), first name (ascending) and hire date (descending), the request might look like this www.example.com/users?sort='last_name\|first_name\|-hire_date' |


#### Example Usage

```java
String accountSlug = "account_slug";
Integer page = 253;
Integer limit = 253;
String filter = "filter";
String sort = "sort";
// Invoking the API call with sample inputs
bonuses.getBonusesTracesAsync(accountSlug, page, limit, filter, sort, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

### <a name="campaigns_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.geniusreferrals.api.controllers.CampaignsController") CampaignsController

#### Get singleton instance

The singleton instance of the ``` CampaignsController ``` class can be accessed from the API Client.

```java
CampaignsController campaigns = client.getCampaigns();
```

#### <a name="get_campaign_async"></a>![Method: ](https://apidocs.io/img/method.png "com.geniusreferrals.api.controllers.CampaignsController.getCampaignAsync") getCampaignAsync

> Get a campaign by a given slug.


```java
void getCampaignAsync(
        final String accountSlug,
        final String campaignSlug,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accountSlug |  ``` Required ```  | The account identifier |
| campaignSlug |  ``` Required ```  | The campaign identifier |


#### Example Usage

```java
String accountSlug = "account_slug";
String campaignSlug = "campaign_slug";
// Invoking the API call with sample inputs
campaigns.getCampaignAsync(accountSlug, campaignSlug, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_campaigns_async"></a>![Method: ](https://apidocs.io/img/method.png "com.geniusreferrals.api.controllers.CampaignsController.getCampaignsAsync") getCampaignsAsync

> Get the list of campaings for a given account.


```java
void getCampaignsAsync(
        final String accountSlug,
        final Integer page,
        final Integer limit,
        final String filter,
        final String sort,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accountSlug |  ``` Required ```  | The account identifier |
| page |  ``` Optional ```  | Page number, e.g. 1 would start at the first result, and 10 would start at the tenth result. |
| limit |  ``` Optional ```  | Maximum number of results to return in the response. Default (10), threshold (100) |
| filter |  ``` Optional ```  | Allowed fields: name, description, start_date, end_date, is_active (true\|false), created. Use the following delimiters to build your filters params. The vertical bar ('\|') to separate individual filter phrases and a double colon ('::') to separate the names and values. The delimiter of the double colon (':') separates the property name from the comparison value, enabling the comparison value to contain spaces. Example: www.example.com/users?filter='name::todd\|city::denver\|title::grand poobah' |
| sort |  ``` Optional ```  | Allowed fields: campaign_slug, created, start_date, end_date, is_active. Use sort query-string parameter that contains a delimited set of property names. For each property name, sort in ascending order, and for each property prefixed with a dash ('-') sort in descending order. Separate each property name with a vertical bar ('\|'), which is consistent with the separation of the name\|value pairs in filtering, above. For example, if we want to retrieve users in order of their last name (ascending), first name (ascending) and hire date (descending), the request might look like this www.example.com/users?sort='last_name\|first_name\|-hire_date' |


#### Example Usage

```java
String accountSlug = "account_slug";
Integer page = 253;
Integer limit = 253;
String filter = "filter";
String sort = "sort";
// Invoking the API call with sample inputs
campaigns.getCampaignsAsync(accountSlug, page, limit, filter, sort, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)



