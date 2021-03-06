package uk.ac.ebi.pride.archive.dataprovider.reference;

import uk.ac.ebi.pride.archive.dataprovider.entity.EntityProvider;

/**
 * {@code ReferenceProvider} defines an interface for accessing the details of a reference
 *
 * @author Rui Wang
 * @version $Id$
 */
public interface ReferenceProvider extends EntityProvider{

    String getReferenceLine();
    int getPubmedId();
    String getDoi();

}
