package org.concordion.cubano.template.specification.google;

import org.concordion.cubano.template.specification.ConcordionFixture;

public class SearchForConcordionFixture extends ConcordionFixture {

    public String google(String term, String site) {
        return workflow()
                .openSearch()
                .searchFor(term)
                .getSearchResult(site);
    }
}
