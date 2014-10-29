package uk.ac.ebi.pride.archive.dataprovider.identification;

import java.util.Set;

/**
 * @author Jose A. Dianes
 * @version $Id$
 */
public interface ProteinReferenceProvider {
    String getAccession();
    Set<String> getSynonyms();
}
