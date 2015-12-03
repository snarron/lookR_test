package com.looker.lookr;

import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.api.ApiAuthApi;
import io.swagger.client.api.LookApi;
import io.swagger.client.api.QueryApi;
import io.swagger.client.model.AccessToken;
import io.swagger.client.model.Query;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Looker {

    // method for starting up the api client
    public void LookerSetup(String clientId, String clientSecret, String basePath) {
        try {
            // instantiate ApiClient
            ApiClient apiClient = new ApiClient();

            // set api path
            apiClient.setBasePath(basePath);

            // instantiate AuthApi
            ApiAuthApi apiAuthApi = new ApiAuthApi(apiClient);

            // prepare token and secret for login
            AccessToken token = apiAuthApi.login(clientId, clientSecret);

            // configure ApiClient
            Configuration.setDefaultApiClient(apiClient);

            // add auth credentials to ApiClient
            Configuration.getDefaultApiClient().addDefaultHeader("Authorization", "token " + token.getAccessToken());

        }
        catch(Exception e) {
            System.out.println("Exception thrown  :" + e);
        }
    }
    public static void main(String[] args){

    }

    // method for running inline queries
    public void LookerRunInlineQuery() {
        try {
            QueryApi lookerQuery = new QueryApi();
            // create an empty query object
            Query query = new Query();

            // required parameters
            String model = "meta";
            String view = "lead";
            String fields_array[] = new String[]{"lead.grouping", "lead.created_month", "lead.count"};
            List fields = Arrays.asList(fields_array);

            // non-essential parameters
            List<String> pivots = new ArrayList<String>();
            pivots.add("lead.grouping");
//            Map<String, String> filters = new HashMap<String, String>();
//            List<String> sorts = new ArrayList<String>();
            Long id = null;
            String limit = null;
            String columnLimit = null;
            Boolean total = null;
            String rowTotal = null;
            Double runtime = null;
            String visibleUiSections = null;
            String slug = null;
            String clientId = null;
            String shareUrl = null;
            String expandedShareUrl = null;
            String queryTimezone = null;

//            private Map<String, String> visConfig = new HashMap<String, String>();
//            private Map<String, String> filterConfig = new HashMap<String, String>();
//            private List<String> dynamicFields = new ArrayList<String>();


            // add required fields to query
            if (model != null || view != null || fields != null) {
                query.setModel(model);
                query.setView(view);
                query.setFields(fields);
                query.setFilters(null);
                query.setPivots(pivots);
            }

            // run look
            System.out.println(lookerQuery.runInlineQuery("json", query));

        }
        catch (Exception e) {
            System.out.println("Exception thrown  :" + e);
        }
    }

}