package example.google;

import org.concordion.cubano.template.driver.ui.google.GoogleSearchPage;
import org.concordion.cubano.template.framework.CubanoTemplateBrowserFixture;

public class SearchForConcordionFixture extends CubanoTemplateBrowserFixture {

    public String google(String term, String site) {
        return GoogleSearchPage.open(this)
                .searchFor(term)
                .getSearchResult(site);
    }
}
