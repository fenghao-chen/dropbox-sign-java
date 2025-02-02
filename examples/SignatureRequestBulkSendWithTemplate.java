import com.dropbox.sign.ApiClient;
import com.dropbox.sign.ApiException;
import com.dropbox.sign.Configuration;
import com.dropbox.sign.api.*;
import com.dropbox.sign.auth.HttpBasicAuth;
import com.dropbox.sign.auth.HttpBearerAuth;
import com.dropbox.sign.model.*;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        ApiClient apiClient = Configuration.getDefaultApiClient();

        // Configure HTTP basic authorization: api_key
        HttpBasicAuth apiKey = (HttpBasicAuth) apiClient
            .getAuthentication("api_key");
        apiKey.setUsername("YOUR_API_KEY");

        // or, configure Bearer (JWT) authorization: oauth2
        /*
        HttpBearerAuth oauth2 = (HttpBearerAuth) apiClient
            .getAuthentication("oauth2");

        oauth2.setBearerToken("YOUR_ACCESS_TOKEN");
        */

        SignatureRequestApi signatureRequestApi = new SignatureRequestApi(apiClient);

        SubSignatureRequestTemplateSigner signerList1Signer = new SubSignatureRequestTemplateSigner()
            .role("Client")
            .name("George")
            .emailAddress("george@example.com")
            .pin("d79a3td");

        SubBulkSignerListCustomField signerList1CustomFields = new SubBulkSignerListCustomField()
            .name("company")
            .value("ABC Corp");

        SubBulkSignerList signerList1 = new SubBulkSignerList()
            .signers(Arrays.asList(signerList1Signer))
            .customFields(Arrays.asList(signerList1CustomFields));

        SubSignatureRequestTemplateSigner signerList2Signer = new SubSignatureRequestTemplateSigner()
            .role("Client")
            .name("Mary")
            .emailAddress("mary@example.com")
            .pin("gd9as5b");

        SubBulkSignerListCustomField signerList2CustomFields = new SubBulkSignerListCustomField()
            .name("company")
            .value("123 Corp");

        SubBulkSignerList signerList2 = new SubBulkSignerList()
            .signers(Arrays.asList(signerList2Signer))
            .customFields(Arrays.asList(signerList2CustomFields));

        SubCC cc1 = new SubCC()
            .role("Accounting")
            .emailAddress("accouting@email.com");

        SignatureRequestBulkSendWithTemplateRequest data = new SignatureRequestBulkSendWithTemplateRequest()
            .templateIds(Arrays.asList("c26b8a16784a872da37ea946b9ddec7c1e11dff6"))
            .subject("Purchase Order")
            .message("Glad we could come to an agreement.")
            .signerList(Arrays.asList(signerList1, signerList2))
            .ccs(Arrays.asList(cc1))
            .testMode(true);

        try {
            BulkSendJobSendResponse result = signatureRequestApi.signatureRequestBulkSendWithTemplate(data);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#accountCreate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
