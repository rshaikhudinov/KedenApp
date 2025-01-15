package KedenApp.service;

import KedenApp.dto.rates.Item;
import KedenApp.dto.rates.Rss;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.net.URI;
import java.net.URL;

@Slf4j
@Service
public class RatesService {

    private BigDecimal getRate(String currencyCode) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Rss.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            URL url = URI.create("https://nationalbank.kz/rss/rates_all.xml").toURL();

            try (InputStream inputStream = url.openStream()) {
                Rss rss = (Rss) unmarshaller.unmarshal(inputStream);
                if (rss != null && rss.getChannel() != null && rss.getChannel().getItems() != null) {
                    for (Item item : rss.getChannel().getItems()) {
                        if (item.getTitle().contains(currencyCode)) {
                            return new BigDecimal(item.getDescription());
                        }
                    }
                }
            }
            log.warn("Rate for {} not found in XML.", currencyCode);
            return null;

        } catch (JAXBException | IOException e) {
            log.error("Error fetching or parsing XML: {}", e.getMessage());
            return null;
        }
    }

    public BigDecimal getUsdRate() {
        return getRate("USD");
    }

    public BigDecimal getEurRate() {
        return getRate("EUR");
    }
}