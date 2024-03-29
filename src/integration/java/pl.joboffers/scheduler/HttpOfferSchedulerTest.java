package pl.joboffers.scheduler;

import com.junioroffers.JobOffersApplication;
import com.junioroffers.domain.offer.OfferFetchable;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;
import pl.joboffers.BaseIntegrationTest;

import java.time.Duration;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.testcontainers.shaded.org.awaitility.Awaitility.await;

@SpringBootTest(classes = JobOffersApplication.class, properties = "scheduling.enabled=true")
public class HttpOfferSchedulerTest extends BaseIntegrationTest {

    @SpyBean
    OfferFetchable remoteOfferClient;
    @Test
    public void schould_run_http_client_offers_fetching_exactly_given_times(){
        await().atMost(Duration.ofSeconds(2))
                .untilAsserted(() -> verify(remoteOfferClient, times(2)).fetchOffers());
    }
}
